/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-input project by The Polymer Authors
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
 * <p>  The <code>iron-input-validate</code> event is fired whenever <code>validate()</code> is called.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class IronInputValidateEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "iron-input-validate";

    public IronInputValidateEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public IronInputValidateEvent() {
        super(NAME);
    }


}
