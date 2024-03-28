package fr.softeam.toscadesigner.exchange.exporter;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.ModelElement;
import fr.softeam.cameldesigner.exchange.IElementProcess;
import fr.softeam.cameldesigner.exchange.exporter.core.ModelElementExporter;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("9d3c43e8-d77f-4de9-89be-8e5ed21b089a")
public class GenerateProcess implements IElementProcess<CDOObject,ModelElement> {

	private ModelElement ModelElementParent;

    public GenerateProcess(ModelElement ModelElementParent) {
        this.ModelElementParent = ModelElementParent;
    }

    @Override
    public CDOObject process(ModelElement element, ModelElement context) {
        CDOObject processedElement = null;
        GenerateMap genMap = GenerateMap.getInstance();
        
        try {
            ModelElementExporter<ModelElement> exporter = (ModelElementExporter) ExporterFactory.instantiateExporter(element.getElement());
            exporter.setProcess(this);
        
            if(genMap.containsKey(element.getElement())) {
                processedElement = genMap.get(element.getElement());
            } else {
                CDOObject owner = getElement(context);
                processedElement = exporter.createCamelElt(owner);
                exporter.attach(processedElement, owner);
                if(processedElement != null) {
                    genMap.put(element.getElement(), processedElement);
                }
            }
            exporter.setProperties(processedElement);
        
        }catch (Exception e) {
            CamelDesignerModule.logService.error(e);
            return null;
        }
        return processedElement;
    }

    public ModelElement getModelElementParent() {
        return this.ModelElementParent;
    }

    public void setModelElementParent(ModelElement ModelElementParent) {
        this.ModelElementParent = ModelElementParent;
    }

    public CDOObject getElement(ModelElement element) {
        if (element != null) {
        
            GenerateMap genMap = GenerateMap.getInstance();
            ModelElement modelioElt = element.getElement();
        
            if(genMap.containsKey(modelioElt)) {
                return genMap.get(modelioElt);
            }else {
        
                MObject compositionOwner = modelioElt.getCompositionOwner();
                if (compositionOwner instanceof ModelElement) {
                    ModelElement modelioOwner = (ModelElement) compositionOwner;
                    Object instantiated = CamelDesignerProxyFactory.instantiate(modelioOwner);
                    if (instantiated  instanceof ModelElement) {
                        return process(element, (ModelElement) instantiated);
                    }
                }
            }
        }
        return null;
    }

    @Override
    public CDOObject create(ModelElement element, ModelElement context) {
        CDOObject processedElement = null;
        GenerateMap genMap = GenerateMap.getInstance();
        
        try {
            ModelElementExporter<ModelElement> exporter = (ModelElementExporter) ExporterFactory.instantiateExporter(element.getElement());
            exporter.setProcess(this);
        
            CDOObject owner = getElement(context);
            processedElement = exporter.createCamelElt(owner);
        
            if(processedElement != null) {
                exporter.attach(processedElement, owner);
                genMap.put(element.getElement(), processedElement);
            }
        
        
        }catch (Exception e) {
            CamelDesignerModule.logService.error(e);
            return null;
        }
        return processedElement;
    }

    public List<CDOObject> getElements(List<? extends ModelElement> elements) {
        List<CDOObject> result = new ArrayList<>();
        for (ModelElement elt : elements) {
            result.add(getElement(elt));
        }
        return result;
    }

}
