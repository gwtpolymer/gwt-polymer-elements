/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-slider project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.event;

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
 * <p>Fired when the slider’s value changes.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class ValueChangeEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "value-change";

    public ValueChangeEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public ValueChangeEvent() {
        super(NAME);
    }


}
