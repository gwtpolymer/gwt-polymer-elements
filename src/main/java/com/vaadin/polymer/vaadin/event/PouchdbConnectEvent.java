/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-pouchdb project by Manolo Carrasco Moñino <manolo@apache.org>
 * that is licensed with Apache license.
 */
package com.vaadin.polymer.vaadin.event;

import elemental2.core.Array;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import elemental2.dom.Element;
import com.vaadin.polymer.PolymerEvent;
import elemental2.dom.EventInit;
import elemental2.dom.EventTarget;

/**
 * <p>Connected to the database</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class PouchdbConnectEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "pouchdb-connect";

    public PouchdbConnectEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public PouchdbConnectEvent() {
        super(NAME);
    }


}
