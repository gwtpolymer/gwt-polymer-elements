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
 * <p>Synchronisation active</p>
 */
public class PouchdbSyncActiveEvent extends DomEvent<PouchdbSyncActiveEventHandler> {

    public static Type<PouchdbSyncActiveEventHandler> TYPE = new Type<PouchdbSyncActiveEventHandler>(
       com.vaadin.polymer.vaadin.event.PouchdbSyncActiveEvent.NAME, new PouchdbSyncActiveEvent());


    public PouchdbSyncActiveEvent() {
    }

    public Type<PouchdbSyncActiveEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PouchdbSyncActiveEventHandler handler) {
        handler.onPouchdbSyncActive(this);
    }

    public com.vaadin.polymer.vaadin.event.PouchdbSyncActiveEvent getPolymerEvent() {
        return Js.cast(super.getNativeEvent());
    }


}
