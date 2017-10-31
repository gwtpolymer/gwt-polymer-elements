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
 * <p>Connected to the database</p>
 */
public class PouchdbConnectEvent extends DomEvent<PouchdbConnectEventHandler> {

    public static Type<PouchdbConnectEventHandler> TYPE = new Type<PouchdbConnectEventHandler>(
       com.vaadin.polymer.vaadin.event.PouchdbConnectEvent.NAME, new PouchdbConnectEvent());


    public PouchdbConnectEvent() {
    }

    public Type<PouchdbConnectEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PouchdbConnectEventHandler handler) {
        handler.onPouchdbConnect(this);
    }

    public com.vaadin.polymer.vaadin.event.PouchdbConnectEvent getPolymerEvent() {
        return Js.cast(super.getNativeEvent());
    }


}
