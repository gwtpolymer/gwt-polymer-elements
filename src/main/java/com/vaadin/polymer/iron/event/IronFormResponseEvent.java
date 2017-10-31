/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-form project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.event;

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
 * <p>Fired after the form is submitted and a response is received. An<br>IronRequestElement is included as the event.detail object.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class IronFormResponseEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "iron-form-response";

    public IronFormResponseEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public IronFormResponseEvent() {
        super(NAME);
    }


}
