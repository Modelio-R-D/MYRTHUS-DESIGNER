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
 * Proxy class to handle a {@link Class} with << InstanceStateType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b3d52380-7760-478a-ae4b-701cedf5aa04")
public class InstanceStateType implements IMdaProxy {
    @objid ("98e2ede6-d2d9-4ca4-a856-80541fe3a099")
    public static final String STEREOTYPE_NAME = "InstanceStateType";

    @objid ("71dda238-40b4-4fff-9b41-97c76208f090")
    public static final String STATE_TAGTYPE = "state";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("7f53fb48-217f-438e-b10a-ff33dbd839b2")
    protected final Class elt;

    /**
     * Tells whether a {@link InstanceStateType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << InstanceStateType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9be8668d-493f-4797-aad5-8e00d81ca585")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (InstanceStateType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(InstanceStateType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << InstanceStateType >> then instantiate a {@link InstanceStateType} proxy.
     * @return a {@link InstanceStateType} proxy on the created {@link Class}.
     */
    @objid ("65bceb00-f582-4d5f-b80a-46a8dc8dd3a0")
    public static InstanceStateType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(InstanceStateType.MdaTypes.STEREOTYPE_ELT);
        return InstanceStateType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link InstanceStateType} proxy from a {@link Class} stereotyped << InstanceStateType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link InstanceStateType} proxy or <i>null</i>.
     */
    @objid ("b8bb7de0-ae4e-40b0-8d04-8ac9c8f7abd2")
    public static InstanceStateType instantiate(final Class obj) {
        return InstanceStateType.canInstantiate(obj) ? new InstanceStateType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InstanceStateType} proxy from a {@link Class} stereotyped << InstanceStateType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link InstanceStateType} proxy.
     */
    @objid ("830f3672-ab0d-4ed7-9e2e-607a1d3d5ce7")
    public static InstanceStateType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (InstanceStateType.canInstantiate(obj))
            return new InstanceStateType(obj);
        else
            throw new IllegalArgumentException("InstanceStateType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0e7757a0-e91c-4537-b9be-e80623d29d35")
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
        InstanceStateType other = (InstanceStateType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("5c7d58bb-30e1-4165-9698-42aab37a291d")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d0510e4c-6364-4ef0-b988-765efaa04d37")
    public String getState() {
        return this.elt.getTagValue(InstanceStateType.MdaTypes.STATE_TAGTYPE_ELT);
    }

    @objid ("84cef6b1-bb0a-46bd-9cc3-01a45d2ab821")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2c8b3783-a3f8-49dc-9e1c-e356975ec283")
    public void setState(final String value) {
        this.elt.putTagValue(InstanceStateType.MdaTypes.STATE_TAGTYPE_ELT, value);
    }

    @objid ("5b1e6d3b-dd1d-42e9-a0f3-5884c6164f63")
    protected  InstanceStateType(final Class elt) {
        this.elt = elt;
    }

    @objid ("7fe05db2-29e5-4bc8-8aee-e3c1370760c7")
    public static final class MdaTypes {
        @objid ("38babd63-3760-427b-9112-d4afd217108a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fe3fceb6-c266-4f85-8eb8-dd31810724fa")
        public static TagType STATE_TAGTYPE_ELT;

        @objid ("d284c578-1f2f-451d-9d83-cc5f053b8125")
        private static Stereotype MDAASSOCDEP;

        @objid ("5322c2ec-7bdf-4916-a778-de2e04b4df61")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8b8cc650-b6c6-465a-ad07-c232ed274be2")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "17542f25-7d53-4414-ad44-cda8dcefd24c", "InstanceStateType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "3b1a149f-4f8f-4b4f-9e19-9b01218d74ba", "state");
            STATE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (STATE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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
