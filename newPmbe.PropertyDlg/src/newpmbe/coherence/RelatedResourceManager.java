package newpmbe.coherence;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;

/**
 * 记录已经关联进过程模型的资源模型和组织模型
 * 如果组织/资源模型更改资源模型，应为其设定某个状态值，告诉通过该状态值
 * 来通知相应的过程模型，资源模型已经更改，从而保持过程模型永远处于最新状态
 * 需要的信息：
 * <组织/资源模型文件名，过程模型List>，List中的元素为自定义类对象，包括两个
 * 关键的键值对<文件名，needRefresh==(true/false)>
 * 
 * 另外的思路：
 * 该manager维护一个过程模型同组织/资源模型中相应的对象的Map。为每个组织模型定义一个HashMap
 * 或者Hash表，Key为组织资源中的模型，value为过程中的模型。当改变Key时，改变value。
 * 
 * 如果该manager可以扩展NotificationListener，则监听可以取代Map。
 * 
 * 前提：必须获得不通过EditingDomain来改变属性值的方法。
 * 
 * 
 * ---------------------------------
 * 新的思路：
 * 创建Manager，当组织/资源模型中模型的属性做出更改时，相应的反映到过程模型中。
 * 
 * @author nemo
 *
 */
public class RelatedResourceManager {

	private static RelatedResourceManager _instance = null;
	
	
	public RelatedResourceManager(){
//		ResourceSet resourceSet2 = new ResourceSetImpl();
//		IFile file;
//
//		URI fileURI2 = URI.createFileURI("");
//
//		//Attention, The second parameter must be trur to get the resource for the first time.
//		EcoreUtil util;
//		Resource poResource2 = resourceSet2.getResource(fileURI2, true);
////		poResource2.getEObject(uriFragment)
		
		
	}
	public static RelatedResourceManager getInstance(){
		if(_instance == null)
			_instance = new RelatedResourceManager();
		return _instance;
	}
	
	
}
