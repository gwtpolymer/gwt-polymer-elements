/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-swatch-picker project by The Polymer Authors
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
 * <p>Fired when a color has been selected</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class ColorPickerSelectedEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "color-picker-selected";

    public ColorPickerSelectedEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public ColorPickerSelectedEvent() {
        super(NAME);
    }


}
