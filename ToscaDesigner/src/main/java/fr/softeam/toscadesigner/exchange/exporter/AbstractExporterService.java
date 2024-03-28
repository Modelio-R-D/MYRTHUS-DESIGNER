package fr.softeam.toscadesigner.exchange.exporter;

import java.util.Map;
import camel.core.Application;
import camel.core.camelModel;
import camel.core.CoreFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.exchange.walker.IWalker;
import fr.softeam.toscadesigner.exchange.walker.UmlWalker;
import fr.softeam.toscadesigner.impl.ToscaDesignerModule;
import fr.softeam.toscadesigner.impl.ToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel;

import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Package;

public abstract class AbstractExporterService {
    protected Map<String, Boolean> _options;

    protected String _fileExtension;

    private final String _rootID = "5fe3c74b-bdb5-411d-a9c9-80e86449b9a5";

    public AbstractExporterService(Map<String, Boolean> options, String fileExtension) {
        super();
        this._options = options;
        this._fileExtension = fileExtension;
    }

    public void exporttoscaUMLModelToFile(fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel toscaUMLModel, String filePath) {
        GenerateMap genMap = GenerateMap.getInstance();
        genMap.clear();
        
        ToscaModel toscaModel = generatetoscaModelRoot(toscaUMLModel, genMap);
        
        GenerateProcess generateProcess = new GenerateProcess(null);
        try {
            IWalker<ModelElement> umlWalker = new UmlWalker(generateProcess);
            umlWalker.walk(toscaUMLModel);
        }catch(Exception e) {
            ToscaDesignerModule.logService.error(e);
        }
        
        this.exportTosca(toscaModel, filePath);
    }

    @objid ("3e76bd92-92bd-4213-8e30-aaba26444a61")
    protected abstract void exportTosca(ToscaModel toscaModel, String filePath);

    @objid ("1864b77c-589a-4b89-a595-ee773592e31d")
    private ToscaModel generatetoscaModelRoot(fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel rootProxy, GenerateMap genMap) {
        //Creates root Camel Model
        ToscaModel toscaModel = CoreFactory.eINSTANCE.createtoscaModel();
        toscaModel.setName(rootProxy.getElement().getName());
        
        //Creates Application
        Application application = CoreFactory.eINSTANCE.createApplication();
        application.setName(rootProxy.getApplicationName());
        application.setVersion(rootProxy.getApplicationVersion());
        toscaModel.setApplication(application);
        
        //Adds Library
        Package root = ToscaDesignerModule.getInstance().getModuleContext().getModelingSession().findElementById(Package.class, this._rootID);
        for (ModelTree ownedElt : root.getOwnedElement()) {
            if (ownedElt.isStereotyped(ToscaDesignerPeerModule.MODULE_NAME, fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel.STEREOTYPE_NAME)) {
                genMap.put(ownedElt, toscaModel);
            }
        }
        
        genMap.put(rootProxy.getElement(), toscaModel);
        return toscaModel;
    }

}
