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
 * ��¼�Ѿ�����������ģ�͵���Դģ�ͺ���֯ģ��
 * �����֯/��Դģ�͸�����Դģ�ͣ�ӦΪ���趨ĳ��״ֵ̬������ͨ����״ֵ̬
 * ��֪ͨ��Ӧ�Ĺ���ģ�ͣ���Դģ���Ѿ����ģ��Ӷ����ֹ���ģ����Զ��������״̬
 * ��Ҫ����Ϣ��
 * <��֯/��Դģ���ļ���������ģ��List>��List�е�Ԫ��Ϊ�Զ�������󣬰�������
 * �ؼ��ļ�ֵ��<�ļ�����needRefresh==(true/false)>
 * 
 * �����˼·��
 * ��managerά��һ������ģ��ͬ��֯/��Դģ������Ӧ�Ķ����Map��Ϊÿ����֯ģ�Ͷ���һ��HashMap
 * ����Hash��KeyΪ��֯��Դ�е�ģ�ͣ�valueΪ�����е�ģ�͡����ı�Keyʱ���ı�value��
 * 
 * �����manager������չNotificationListener�����������ȡ��Map��
 * 
 * ǰ�᣺�����ò�ͨ��EditingDomain���ı�����ֵ�ķ�����
 * 
 * 
 * ---------------------------------
 * �µ�˼·��
 * ����Manager������֯/��Դģ����ģ�͵�������������ʱ����Ӧ�ķ�ӳ������ģ���С�
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
