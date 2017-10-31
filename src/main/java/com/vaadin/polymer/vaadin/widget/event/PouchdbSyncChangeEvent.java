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
 * <p>Synchronisation change</p>
 */
public class PouchdbSyncChangeEvent extends DomEvent<PouchdbSyncChangeEventHandler> {

    public static Type<PouchdbSyncChangeEventHandler> TYPE = new Type<PouchdbSyncChangeEventHandler>(
       com.vaadin.polymer.vaadin.event.PouchdbSyncChangeEvent.NAME, new PouchdbSyncChangeEvent());


    public PouchdbSyncChangeEvent() {
    }

    public Type<PouchdbSyncChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PouchdbSyncChangeEventHandler handler) {
        handler.onPouchdbSyncChange(this);
    }

    public com.vaadin.polymer.vaadin.event.PouchdbSyncChangeEvent getPolymerEvent() {
        return Js.cast(super.getNativeEvent());
    }


}
