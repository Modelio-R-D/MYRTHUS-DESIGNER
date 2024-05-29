/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/04/2024 10:28 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.api.module.MManualAssociationRole;
import com.modeliosoft.modelio.api.module.MManualAttribute;
import com.modeliosoft.modelio.api.module.MManualClass;
import com.modeliosoft.modelio.api.module.MManualImport;
import com.modeliosoft.modelio.api.module.MManualOperation;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ModelingSessionRegistry;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << InterfacesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e1ec5352-a78e-4a35-919a-fdf3a09eb4eb")
public class InterfacesType implements IMdaProxy {
    @objid ("1b874cfa-4281-455e-9a2c-5e8045dcbe3e")
    public static final String STEREOTYPE_NAME = "InterfacesType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("32601d0e-8f5d-4b2a-b9e0-4ad3e03cf856")
    protected final Class elt;

    /**
     * Tells whether a {@link InterfacesType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << InterfacesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("105970e8-8683-4c81-b816-5217dfd42a82")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (InterfacesType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(InterfacesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << InterfacesType >> then instantiate a {@link InterfacesType} proxy.
     * @return a {@link InterfacesType} proxy on the created {@link Class}.
     */
    @objid ("e60b5fc7-ddb5-4a14-a6c9-a1b04fbf940c")
    public static InterfacesType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(InterfacesType.MdaTypes.STEREOTYPE_ELT);
        return InterfacesType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link InterfacesType} proxy from a {@link Class} stereotyped << InterfacesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link InterfacesType} proxy or <i>null</i>.
     */
    @objid ("23a5b851-2169-4d16-bdcc-5f887f7881b2")
    public static InterfacesType instantiate(final Class obj) {
        return InterfacesType.canInstantiate(obj) ? new InterfacesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterfacesType} proxy from a {@link Class} stereotyped << InterfacesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link InterfacesType} proxy.
     */
    @objid ("15960b62-55e4-4b13-b3ff-3476500fc633")
    public static InterfacesType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (InterfacesType.canInstantiate(obj))
            return new InterfacesType(obj);
        else
            throw new IllegalArgumentException("InterfacesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("71664852-323a-488f-92f6-d6af7c31d849")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        InterfacesType other = (InterfacesType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("35d06ebf-8453-43cb-8330-4a6eb54a0b28")
    public Class getElement() {
        return this.elt;
    }

    @objid ("981714fe-95e1-4257-8e29-92a46d136b0f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ff9abb57-486e-46cb-a735-89a3b14d5416")
    protected  InterfacesType(final Class elt) {
        this.elt = elt;
    }

    @objid ("4309b581-0dd9-4e5c-a770-380b5c620f46")
    public static final class MdaTypes {
        @objid ("dd94a2a0-c7b7-4823-b1a6-bfa42a0977b9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fa9fcb28-bf9c-4194-8871-ce784f9394d4")
        private static Stereotype MDAASSOCDEP;

        @objid ("d1fb65d1-614c-42f8-bf05-5af3e9e1ada3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("87402f2b-b422-4225-844c-b813a03930cd")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "52b9c42d-29c2-4a9c-a9af-c3d178e32339", "InterfacesType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(Stereotype.MQNAME, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e", "MDAAssocDep");
            MDAASSOCDEP = (Stereotype) session.findByRef(mRef);
            if (MDAASSOCDEP==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd", "MDAAssocDepRole");
            MDAASSOCDEP_ROLE = (TagType) session.findByRef(mRef);
            if (MDAASSOCDEP_ROLE==null) missingRefs.add(mRef);
            
            if (! missingRefs.isEmpty()) throw new MdaProxyException(MdaProxyException.MdaProxyExceptionReason.MISSING_MDA_ELEMENT, missingRefs);
        }

    }

}
