package newpmbe.process.diagram.navigator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import newpmbe.process.diagram.part.NewPMBEVisualIDRegistry;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import vpml.processpackage.impl.EMPArtifactImpl;
import vpml.processpackage.impl.EMPCompActivityImpl;
import vpml.processpackage.impl.EMPDocumentImpl;
import vpml.processpackage.impl.EMPFormImpl;
import vpml.processpackage.impl.EMPNormalActivityImpl;
import vpml.processpackage.impl.EMPOtherImpl;
import vpml.processpackage.impl.EMPProductPackageImpl;

import vpml.resourcepackage.impl.EMRMachineTypeImpl;
import vpml.resourcepackage.impl.EMRRoleImpl;
import vpml.resourcepackage.impl.EMRToolTypeImpl;

/**
 * @generated NOT
 */
public class NewPMBENavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4031;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof NewPMBENavigatorItem) {
			NewPMBENavigatorItem item = (NewPMBENavigatorItem) element;
			return NewPMBEVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		if (e1 instanceof NewPMBENavigatorItem)
			checkCitation(e1);
		if (e2 instanceof NewPMBENavigatorItem)
			checkCitation(e2);
		int cat1 = category(e1);
		int cat2 = category(e2);
		if (cat1 != cat2) {
			//  if()
			return cat1 - cat2;
		}
		if ((((NewPMBENavigatorItem) e1).getView().getElement() instanceof EMPCompActivityImpl)
				|| (((NewPMBENavigatorItem) e1).getView().getElement() instanceof EMPNormalActivityImpl)
				|| (((NewPMBENavigatorItem) e1).getView().getElement() instanceof EMPProductPackageImpl)
				|| (((NewPMBENavigatorItem) e1).getView().getElement() instanceof EMPDocumentImpl)
				|| (((NewPMBENavigatorItem) e1).getView().getElement() instanceof EMPArtifactImpl)
				|| (((NewPMBENavigatorItem) e1).getView().getElement() instanceof EMPOtherImpl)
				|| (((NewPMBENavigatorItem) e1).getView().getElement() instanceof EMPFormImpl)) {
			//   String name=((NewpmbeNavigatorItem)e1).getView().getDiagram().getName();
			//	  System.out.println(((IFolder)((NewpmbeNavigatorItem)e1).getParent()).getLocation());
			//	  System.out.println(((NewpmbeNavigatorItem)e1).getView().getDiagram().getName());

			int i = setRelation(e1, e2);
			if (i != 0)
				return i;
		}

		String name1;
		String name2;

		if (viewer == null || !(viewer instanceof ContentViewer)) {
			name1 = e1.toString();
			name2 = e2.toString();
		} else {
			IBaseLabelProvider prov = ((ContentViewer) viewer)
					.getLabelProvider();
			if (prov instanceof ILabelProvider) {
				ILabelProvider lprov = (ILabelProvider) prov;
				name1 = lprov.getText(e1);
				name2 = lprov.getText(e2);
			} else {
				name1 = e1.toString();
				name2 = e2.toString();
			}
		}
		if (name1 == null) {
			name1 = "";//$NON-NLS-1$
		}
		if (name2 == null) {
			name2 = "";//$NON-NLS-1$
		}

		return getComparator().compare(name1, name2);

	}

	@Override
	public void sort(Viewer viewer, Object[] elements) {
		// TODO Auto-generated method stub
		super.sort(viewer, elements);
	}

	public void checkCitation(final Object e1) {
		//name记录正打开的窗页名
		String diagram_name = "";
		diagram_name = ((NewPMBENavigatorItem) e1).getView().getDiagram()
				.getName();
		String name = "";
		String filePath = "";
		if (((NewPMBENavigatorItem) e1).getParent() instanceof IProject) {
			IProject project = (IProject) ((NewPMBENavigatorItem) e1)
					.getParent();
			filePath = project.getLocation().toString();
			name = project.getName() + "_diagram";

		} else {
			IFolder folder = (IFolder) ((NewPMBENavigatorItem) e1).getParent();
			filePath = (folder).getLocation().toString();
			name = folder.getName() + ".process_diagram";
		}

		//		name = diagram_name.substring(diagram_name.lastIndexOf("/") + 1,
		//				diagram_name.lastIndexOf("_"));
		//		
		//		name = diagram_name.substring(diagram_name.lastIndexOf("/")+1);

		//path_diagram 记录.process文件的绝对地址

		String path_diagram = "";
		//nameProject记录节点所在的工程名
		path_diagram = filePath + "/" + name;
		String pathSource = path_diagram.substring(0, path_diagram
				.lastIndexOf("/"))
				+ "/.XML";
		File file = new File(pathSource);
		if (((NewPMBENavigatorItem) e1).getView().getElement() instanceof EMRMachineTypeImpl) {
			if (file.exists()) {
				Document doc = parseXML(pathSource);
				Node rootItem = doc.getFirstChild();
				NodeList nodeList = rootItem.getChildNodes();
				//				boolean exist = false;
				//
				//				for (int i = 0; i < (nodeList.getLength() - 1) / 2; i++) {
				//					if (nodeList.item(2 * i + 1).getAttributes().getNamedItem(
				//							"type").getNodeValue().equals("MachineType")
				//							&& nodeList
				//									.item(2 * i + 1)
				//									.getAttributes()
				//									.getNamedItem("nameTarget")
				//									.getNodeValue()
				//									.equals(
				//											((EMRMachineTypeImpl) (((NewPMBENavigatorItem) e1)
				//													.getView().getElement()))
				//													.getName())) {
				//						exist = true;
				//						break;
				//					}
				//				}
				//				if (!exist) {
				//					Document doc1 = parseXML(path_diagram);
				//					Node rootItem1 = doc1.getFirstChild();
				//					NodeList nodeList1 = rootItem1.getChildNodes();
				//					for (int j = 0; j < (nodeList1.getLength() - 1) / 2; j++) {
				//						if (nodeList1.item(2 * j + 1).getNodeName().equals(
				//								"MachineType")
				//								&& nodeList1
				//										.item(2 * j + 1)
				//										.getAttributes()
				//										.getNamedItem("name")
				//										.getNodeValue()
				//										.equals(
				//												((EMRMachineTypeImpl) (((NewPMBENavigatorItem) e1)
				//														.getView().getElement()))
				//														.getName())) {
				////							nodeList1.item(2 * j + 1).getAttributes()
				////									.getNamedItem("name").setNodeValue("未定义");
				//						}
				//					}
				//					saveXML(doc1, path_diagram);
				////					final EMRMachineTypeImpl tt = (EMRMachineTypeImpl) (((NewPMBENavigatorItem) e1)
				////							.getView().getElement());
				////					TransactionalEditingDomain domain = TransactionUtil
				////							.getEditingDomain(tt);
				////					domain.getCommandStack().execute(
				////							new RecordingCommand(domain) {
				////								protected void doExecute() {
				////									tt.setName("未定义");
				////								}
				////							});
				//				}
				//			} else {
				Document doc1 = parseXML(path_diagram);
				Node rootItem1 = doc1.getFirstChild();
				//				NodeList nodeList1 = rootItem1.getChildNodes();
				//				for (int j = 0; j < (nodeList1.getLength() - 1) / 2; j++) {
				//					if (nodeList1.item(2 * j + 1).getNodeName().equals(
				//							"MachineType")
				//							&& nodeList1
				//									.item(2 * j + 1)
				//									.getAttributes()
				//									.getNamedItem("name")
				//									.getNodeValue()
				//									.equals(
				//											((EMRMachineTypeImpl) (((NewPMBENavigatorItem) e1)
				//													.getView().getElement()))
				//													.getName())) {
				////						nodeList1.item(2 * j + 1).getAttributes().getNamedItem(
				////								"name").setNodeValue("未定义");
				//					}
				//				}
				saveXML(doc1, path_diagram);
				//				final EMRMachineTypeImpl tt = (EMRMachineTypeImpl) (((NewPMBENavigatorItem) e1)
				//						.getView().getElement());
				//				TransactionalEditingDomain domain = TransactionUtil
				//						.getEditingDomain(tt);
				//				domain.getCommandStack().execute(new RecordingCommand(domain) {
				//					protected void doExecute() {
				//						tt.setName("未定义");
				//					}
				//				});
			}
		}
		if (((NewPMBENavigatorItem) e1).getView().getElement() instanceof EMRToolTypeImpl) {

			if (file.exists()) {
				Document doc = parseXML(pathSource);
				Node rootItem = doc.getFirstChild();
				NodeList nodeList = rootItem.getChildNodes();
				//				boolean exist = false;

				//				for (int i = 0; i < (nodeList.getLength() - 1) / 2; i++) {
				//					if (nodeList.item(2 * i + 1).getAttributes().getNamedItem(
				//							"type").getNodeValue().equals("ToolType")
				//							&& nodeList
				//									.item(2 * i + 1)
				//									.getAttributes()
				//									.getNamedItem("nameTarget")
				//									.getNodeValue()
				//									.equals(
				//											((EMRToolTypeImpl) (((NewPMBENavigatorItem) e1)
				//													.getView().getElement()))
				//													.getName())) {
				//						exist = true;
				//						break;
				//					}
				//				}
				//				if (!exist) {
				//					Document doc1 = parseXML(path_diagram);
				//					Node rootItem1 = doc1.getFirstChild();
				//					NodeList nodeList1 = rootItem1.getChildNodes();
				//					for (int j = 0; j < (nodeList1.getLength() - 1) / 2; j++) {
				//						if (nodeList1.item(2 * j + 1).getNodeName().equals(
				//								"ToolType")
				//								&& nodeList1
				//										.item(2 * j + 1)
				//										.getAttributes()
				//										.getNamedItem("name")
				//										.getNodeValue()
				//										.equals(
				//												((EMRToolTypeImpl) (((NewPMBENavigatorItem) e1)
				//														.getView().getElement()))
				//														.getName())) {
				//							nodeList1.item(2 * j + 1).getAttributes()
				//									.getNamedItem("name").setNodeValue("未定义");
				//						}
				//					}
				//					saveXML(doc1, path_diagram);
				//					final EMRToolTypeImpl tt = (EMRToolTypeImpl) (((NewPMBENavigatorItem) e1)
				//							.getView().getElement());
				//					TransactionalEditingDomain domain = TransactionUtil
				//							.getEditingDomain(tt);
				//					domain.getCommandStack().execute(
				//							new RecordingCommand(domain) {
				//								protected void doExecute() {
				//									tt.setName("未定义");
				//								}
				//							});
				//				}
				//			} else {
				Document doc1 = parseXML(path_diagram);
				Node rootItem1 = doc1.getFirstChild();
				NodeList nodeList1 = rootItem1.getChildNodes();
				//				for (int j = 0; j < (nodeList1.getLength() - 1) / 2; j++) {
				//					if (nodeList1.item(2 * j + 1).getNodeName().equals(
				//							"ToolType")
				//							&& nodeList1
				//									.item(2 * j + 1)
				//									.getAttributes()
				//									.getNamedItem("name")
				//									.getNodeValue()
				//									.equals(
				//											((EMRToolTypeImpl) (((NewPMBENavigatorItem) e1)
				//													.getView().getElement()))
				//													.getName())) {
				////						nodeList1.item(2 * j + 1).getAttributes().getNamedItem(
				////								"name").setNodeValue("未定义");
				//					}
				//				}
				saveXML(doc1, path_diagram);
				//				final EMRToolTypeImpl tt = (EMRToolTypeImpl) (((NewPMBENavigatorItem) e1)
				//						.getView().getElement());
				//				TransactionalEditingDomain domain = TransactionUtil
				//						.getEditingDomain(tt);
				//				domain.getCommandStack().execute(new RecordingCommand(domain) {
				//					protected void doExecute() {
				//						tt.setName("未定义");
				//					}
				//				});
			}

		}
		if (((NewPMBENavigatorItem) e1).getView().getElement() instanceof EMRRoleImpl) {
			//如果role没有名字则自动改为 “未定义”
			Document doc2 = parseXML(path_diagram);
			Node rootItem2 = doc2.getFirstChild();
			NodeList nodeList2 = rootItem2.getChildNodes();
			//			for (int i = 0; i < (nodeList2.getLength() - 1) / 2; i++) {
			//				if (nodeList2.item(2 * i + 1).getNodeName().equals("role")) {
			//					boolean nameExist = false;
			//					for (int j = 0; j < (nodeList2.item(2 * i + 1))
			//							.getAttributes().getLength(); j++) {
			//						if (nodeList2.item(2 * i + 1).getAttributes().item(j)
			//								.getNodeName().equals("name")) {
			//							nameExist = true;
			//							break;
			//						}
			//					}
			//					if (!nameExist) {
			////						((Element) nodeList2.item(2 * i + 1)).setAttribute(
			////								"name", "未定义");
			//					}
			//				}
			//			}
			saveXML(doc2, path_diagram);
			//
			if (file.exists()) {
				Document doc = parseXML(pathSource);
				Node rootItem = doc.getFirstChild();
				NodeList nodeList = rootItem.getChildNodes();
				//				boolean exist = false;
				//
				//				for (int i = 0; i < (nodeList.getLength() - 1) / 2; i++) {
				//					if (nodeList.item(2 * i + 1).getAttributes().getNamedItem(
				//							"type").getNodeValue().equals("role")
				//							&& nodeList
				//									.item(2 * i + 1)
				//									.getAttributes()
				//									.getNamedItem("nameTarget")
				//									.getNodeValue()
				//									.equals(
				//											((EMRMachineTypeImpl) (((NewPMBENavigatorItem) e1)
				//													.getView().getElement()))
				//													.getName())) {
				//						exist = true;
				//						break;
				//					}
				//				}
				//				if (!exist) {
				//					Document doc1 = parseXML(path_diagram);
				//					Node rootItem1 = doc1.getFirstChild();
				//					NodeList nodeList1 = rootItem1.getChildNodes();
				//					for (int j = 0; j < (nodeList1.getLength() - 1) / 2; j++) {
				//						if (nodeList1.item(2 * j + 1).getNodeName().equals(
				//								"role")
				//								&& nodeList1
				//										.item(2 * j + 1)
				//										.getAttributes()
				//										.getNamedItem("name")
				//										.getNodeValue()
				//										.equals(
				//												((EMRMachineTypeImpl) (((NewPMBENavigatorItem) e1)
				//														.getView().getElement()))
				//														.getName())) {
				////							nodeList1.item(2 * j + 1).getAttributes()
				////									.getNamedItem("name").setNodeValue("未定义");
				//						}
				//					}
				//					saveXML(doc1, path_diagram);
				////					final EMRMachineTypeImpl tt = (EMRMachineTypeImpl) (((NewPMBENavigatorItem) e1)
				////							.getView().getElement());
				////					TransactionalEditingDomain domain = TransactionUtil
				////							.getEditingDomain(tt);
				////					domain.getCommandStack().execute(
				////							new RecordingCommand(domain) {
				////								protected void doExecute() {
				////									tt.setName("未定义");
				////								}
				////							});
				//				}
				//
				//			} else {
				//
				Document doc1 = parseXML(path_diagram);
				Node rootItem1 = doc1.getFirstChild();
				//				NodeList nodeList1 = rootItem1.getChildNodes();
				//				for (int j = 0; j < (nodeList1.getLength() - 1) / 2; j++) {
				//					if (nodeList1.item(2 * j + 1).getNodeName().equals("role")
				//							&& nodeList1
				//									.item(2 * j + 1)
				//									.getAttributes()
				//									.getNamedItem("name")
				//									.getNodeValue()
				//									.equals(
				//											((EMRMachineTypeImpl) (((NewPMBENavigatorItem) e1)
				//													.getView().getElement()))
				//													.getName())) {
				////						nodeList1.item(2 * j + 1).getAttributes().getNamedItem(
				////								"name").setNodeValue("未定义");
				//					}
				//				}
				saveXML(doc1, path_diagram);
				//				final EMRMachineTypeImpl tt = (EMRMachineTypeImpl) (((NewPMBENavigatorItem) e1)
				//						.getView().getElement());
				//				TransactionalEditingDomain domain = TransactionUtil
				//						.getEditingDomain(tt);
				//				domain.getCommandStack().execute(new RecordingCommand(domain) {
				//					protected void doExecute() {
				//						tt.setName("未定义");
				//					}
				//				});

			}
		}
	}

	//根据path解析xml文件
	public Document parseXML(String path) {
		Document doc = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			FileInputStream inputStream = new FileInputStream(path);

			doc = builder.parse(inputStream);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doc;
	}

	//根据path保存修改后的xml文件
	public void saveXML(Document doc, String path) {
		try {
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			DOMSource source = new DOMSource(doc);
			transformer.setOutputProperty(OutputKeys.ENCODING, "GB2312");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			PrintWriter pw = new PrintWriter(new FileOutputStream(path));
			StreamResult result = new StreamResult(pw);
			transformer.transform(source, result);
			pw.close();
		} catch (TransformerException mye) {
			mye.printStackTrace();
		} catch (IOException exp) {
			exp.printStackTrace();
		}
	}

	public int setRelation(Object e1, Object e2) {

		//  System.out.println(((EMPCompActivityImpl)((NewpmbeNavigatorItem)e1).getView().getElement()).getName());
		//     System.out.println("a");

		Vector<SortNode> vector = new Vector();
		String path = "";
		IWorkspace workSpace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workSpace.getRoot();
		File workpath = new File(root.getLocation().toString()
				+ "\\workspacePath.properties");
		if (!workpath.exists()) {
			path = root.getLocation().toString();
		} else {
			try {
				FileInputStream inPut = new FileInputStream(workpath);
				Properties pro = new Properties();
				try {
					pro.load(inPut);
					path = pro.getProperty("path");

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//name记录正打开的窗页名
		String filePath = "";
		if (((NewPMBENavigatorItem) e1).getParent() instanceof IProject) {
			filePath = ((IProject) ((NewPMBENavigatorItem) e1).getParent())
					.getLocation().toString();
		} else {
			filePath = ((IFolder) ((NewPMBENavigatorItem) e1).getParent())
					.getLocation().toString();
		}
		String diagram_name = "";
		diagram_name = ((NewPMBENavigatorItem) e1).getView().getDiagram()
				.getName();
		String name = "";
		name = diagram_name.substring(diagram_name.lastIndexOf("/") + 1,
				diagram_name.length() - 8);

		//path_diagram 记录.process文件的绝对地址

		String path_diagram = "";
		//nameProject记录节点所在的工程名
		path_diagram = filePath + "/" + name + "_diagram";
		//System.out.println(path_diagram);
		Document doc = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
			try {
				doc = builder.parse(new FileInputStream(path_diagram));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Node rootItem = doc.getFirstChild();
			NodeList nodeList = rootItem.getChildNodes();
			//在容器中添加节点信息
			for (int i = 0; i < (nodeList.getLength() - 1) / 2; i++) {

				if (nodeList.item(2 * i + 1).getNodeName().indexOf("Flow") == -1) {

					SortNode node = new SortNode();
					node.name = nodeList.item(2 * i + 1).getAttributes()
							.getNamedItem("name").getNodeValue();
					node.type = nodeList.item(2 * i + 1).getNodeName();
					vector.add(node);
				}
			}
			//添加 “流” 信息
			for (int i = 0; i < (nodeList.getLength() - 1) / 2; i++) {
				String source = "";
				String target = "";

				if (nodeList.item(2 * i + 1).getNodeName().indexOf("dataFlow") != -1) {

					if (nodeList.item(2 * i + 1).getAttributes().getLength() < 2) {
						continue;
					} else {
						if (nodeList.item(2 * i + 1).getAttributes()
								.getLength() == 2) {
							if (nodeList.item(2 * i + 1).getAttributes()
									.item(0).getNodeValue().indexOf("@") == -1)
								continue;
							else {
								source = nodeList.item(2 * i + 1)
										.getAttributes().item(0).getNodeValue();

								target = nodeList.item(2 * i + 1)
										.getAttributes().item(1).getNodeValue();
							}
						} else {
							source = nodeList.item(2 * i + 1).getAttributes()
									.item(1).getNodeValue();

							target = nodeList.item(2 * i + 1).getAttributes()
									.item(2).getNodeValue();
						}
					}
					//System.out.println(target+"aa "+source);
					String sourceType = source
							.substring(3, source.indexOf("."));
					String targetType = target
							.substring(3, target.indexOf("."));
					String sourceNum = source.substring(
							source.indexOf(".") + 1, source.length());
					String targetNum = target.substring(
							target.indexOf(".") + 1, target.length());
					//				    	System.out.println(sourceType+sourceNum+" "+targetType+targetNum);
					int sourceNm;
					int targetNm;
					sourceNm = Integer.parseInt(sourceNum);
					targetNm = Integer.parseInt(targetNum);
					//记录源节点在容器中的位置
					int t = 0;
					while (t < vector.size()) {

						if (sourceType.equals(vector.elementAt(t).type)) {

							break;
						}
						t++;
					}
					//记录目的节点在容器中的位置
					int k = 0;
					while (k < vector.size()) {
						if (targetType.equals(vector.elementAt(k).type)) {
							break;
						}
						k++;
					}

					vector.elementAt(t + sourceNm).link.add(k + targetNm);

				} else if (nodeList.item(2 * i + 1).getNodeName().indexOf(
						"refFlow") != -1) {
					for (int j = 0; j < nodeList.item(2 * i + 1)
							.getAttributes().getLength(); j++) {
						if (nodeList.item(2 * i + 1).getAttributes()
								.getLength() < 2) {
							continue;
						} else {
							if (nodeList.item(2 * i + 1).getAttributes()
									.getLength() == 2) {
								source = nodeList.item(2 * i + 1)
										.getAttributes().item(0).getNodeValue();
								//				    				System.out.println("s=="+source);
								if (source.indexOf("@") == -1) {
									continue;
								} else {

									target = nodeList.item(2 * i + 1)
											.getAttributes().item(1)
											.getNodeValue();
									//				    					System.out.println("t"+target);
									if (target.indexOf("@") == -1) {
										continue;
									}
								}
							} else {
								source = nodeList.item(2 * i + 1)
										.getAttributes().item(0).getNodeValue();
								target = nodeList.item(2 * i + 1)
										.getAttributes().item(2).getNodeValue();
							}
						}
					}
					String sourceType = source
							.substring(3, source.indexOf("."));
					String targetType = target
							.substring(3, target.indexOf("."));
					String sourceNum = source.substring(
							source.indexOf(".") + 1, source.length());
					String targetNum = target.substring(
							target.indexOf(".") + 1, target.length());
					//				    	System.out.println(sourceType+sourceNum+" "+targetType+targetNum);
					int sourceNm;
					int targetNm;
					sourceNm = Integer.parseInt(sourceNum);
					targetNm = Integer.parseInt(targetNum);
					//记录源节点在容器中的位置
					int t = 0;
					while (t < vector.size()) {

						if (sourceType.equals(vector.elementAt(t).type)) {

							break;
						}
						t++;
					}
					//记录目的节点在容器中的位置
					int k = 0;
					while (k < vector.size()) {
						if (targetType.equals(vector.elementAt(k).type)) {
							break;
						}
						k++;
					}

					vector.elementAt(t + sourceNm).link.add(k + targetNm);

				}

			}

			//			   for(int i=0;i<vector.size();i++){
			//				   System.out.print(vector.elementAt(i).type+" "+vector.elementAt(i).name);
			//				   for(int j=0;j<vector.elementAt(i).link.size();j++){
			//					   System.out.print(" "+vector.elementAt(i).link.elementAt(j));
			//				   }
			//				   System.out.println("");
			//			   }
			Vector<SortNode> stack = new Vector();
			//获得节点名称
			String name1 = "";
			String name2 = "";
			if (((NewPMBENavigatorItem) e1).getView().getElement() instanceof EMPCompActivityImpl) {
				name1 = ((EMPCompActivityImpl) ((NewPMBENavigatorItem) e1)
						.getView().getElement()).getName();
				name2 = ((EMPCompActivityImpl) ((NewPMBENavigatorItem) e2)
						.getView().getElement()).getName();
			} else if (((NewPMBENavigatorItem) e1).getView().getElement() instanceof EMPNormalActivityImpl) {
				name1 = ((EMPNormalActivityImpl) ((NewPMBENavigatorItem) e1)
						.getView().getElement()).getName();
				name2 = ((EMPNormalActivityImpl) ((NewPMBENavigatorItem) e2)
						.getView().getElement()).getName();
			} else if (((NewPMBENavigatorItem) e1).getView().getElement() instanceof EMPDocumentImpl) {
				name1 = ((EMPDocumentImpl) ((NewPMBENavigatorItem) e1)
						.getView().getElement()).getName();
				name2 = ((EMPDocumentImpl) ((NewPMBENavigatorItem) e2)
						.getView().getElement()).getName();
			} else if (((NewPMBENavigatorItem) e1).getView().getElement() instanceof EMPFormImpl) {
				name1 = ((EMPFormImpl) ((NewPMBENavigatorItem) e1).getView()
						.getElement()).getName();
				name2 = ((EMPFormImpl) ((NewPMBENavigatorItem) e2).getView()
						.getElement()).getName();
			} else if (((NewPMBENavigatorItem) e1).getView().getElement() instanceof EMPArtifactImpl) {
				name1 = ((EMPArtifactImpl) ((NewPMBENavigatorItem) e1)
						.getView().getElement()).getName();
				name2 = ((EMPArtifactImpl) ((NewPMBENavigatorItem) e2)
						.getView().getElement()).getName();
			} else if (((NewPMBENavigatorItem) e1).getView().getElement() instanceof EMPOtherImpl) {
				name1 = ((EMPOtherImpl) ((NewPMBENavigatorItem) e1).getView()
						.getElement()).getName();
				name2 = ((EMPOtherImpl) ((NewPMBENavigatorItem) e2).getView()
						.getElement()).getName();
			} else {
				name1 = ((EMPProductPackageImpl) ((NewPMBENavigatorItem) e1)
						.getView().getElement()).getName();
				name2 = ((EMPProductPackageImpl) ((NewPMBENavigatorItem) e2)
						.getView().getElement()).getName();
			}
			int i;
			boolean exist = false;
			for (i = 0; i < vector.size(); i++) {
				if (name1.equals(vector.elementAt(i).name)) {
					exist = true;
					break;
				}
			}
			if (!exist) {
				return 0;
			}
			stack.add(vector.elementAt(i));

			while (stack.size() > 0) {
				SortNode temp = stack.elementAt(stack.size() - 1);
				stack.removeElementAt(stack.size() - 1);
				if (temp.name.equals(name2)) {
					return -1;
				}
				for (int q = 0; q < temp.link.size(); q++) {
					stack.add(vector.elementAt(temp.link.elementAt(q)));
				}
			}
			stack.removeAllElements();
			for (i = 0; i < vector.size(); i++) {
				if (name2.equals(vector.elementAt(i).name)) {
					break;
				}
			}
			stack.add(vector.elementAt(i));
			while (stack.size() > 0) {
				SortNode temp = stack.elementAt(stack.size() - 1);
				stack.removeElementAt(stack.size() - 1);
				if (temp.name.equals(name1)) {
					return 1;
				}
				for (int q = 0; q < temp.link.size(); q++) {
					stack.add(vector.elementAt(temp.link.elementAt(q)));
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//   System.out.println("d");
		return 0;
	}

	public class SortNode {
		String name = "";
		String type = "";
		Vector<Integer> link = new Vector();
	}
}
