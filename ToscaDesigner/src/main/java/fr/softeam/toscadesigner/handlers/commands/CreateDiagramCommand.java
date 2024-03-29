package fr.softeam.toscadesigner.handlers.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.DiagramCreationStandardHandler;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("145a0024-c8e4-4cbe-8bc2-fd00593017b9")
public class CreateDiagramCommand extends DiagramCreationStandardHandler {
    @objid ("b4180092-eef9-4df1-a650-fe3a24fc3de7")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        // Generated call to the super method will check the scope conditions defined in Studio.
        // Do not remove this call unless you need to take full control on the checks to be carried out.
        // However you can safely extends the checked conditions by adding custom code.
        if (super.accept(selectedElements, module) == false) {
            return false;
        }
        return true;
    }

    @objid ("81b7693c-92ff-4d2e-bde3-00af3825b57c")
    @Override
    protected void postConfigureElement(final MObject newDiagram, final IModule module) {
        // This method is a hook called once the element is created and configured and before the transaction is committed.
        // The super method applies the diagram style and open the diagram is needed and should be first called in most cases.
        // Sub classes may redefine this method to make additional modifications.
        
        // Call the super method to apply the diagram style and open the diagram if asked for.
        super.postConfigureElement(newDiagram, module);
        
        // TODO Add additional behavior below
        
        
    }

}
