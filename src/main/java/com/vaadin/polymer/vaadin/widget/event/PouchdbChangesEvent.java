/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-pouchdb project by Manolo Carrasco Moñino <manolo@apache.org>
 * that is licensed with Apache license.
 */
package com.vaadin.polymer.vaadin.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import elemental2.core.Array;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.base.Js;

/**
 * <p>A change in the data.</p>
 */
public class PouchdbChangesEvent extends DomEvent<PouchdbChangesEventHandler> {

    public static Type<PouchdbChangesEventHandler> TYPE = new Type<PouchdbChangesEventHandler>(
       com.vaadin.polymer.vaadin.event.PouchdbChangesEvent.NAME, new PouchdbChangesEvent());


    public PouchdbChangesEvent() {
    }

    public Type<PouchdbChangesEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PouchdbChangesEventHandler handler) {
        handler.onPouchdbChanges(this);
    }

    public com.vaadin.polymer.vaadin.event.PouchdbChangesEvent getPolymerEvent() {
        return Js.cast(super.getNativeEvent());
    }


}
