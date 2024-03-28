package fr.softeam.toscadesigner.exchange.walker;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

public interface IWalker<T> {
	
    void walk(T element);

}
