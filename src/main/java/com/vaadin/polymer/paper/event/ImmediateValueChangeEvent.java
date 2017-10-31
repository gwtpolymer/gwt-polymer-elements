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
 * <p>Fired when the slider’s immediateValue changes. Only occurs while the<br>user is dragging.</p>
 * <p>To detect changes to immediateValue that happen for any input (i.e.<br>dragging, tapping, clicking, etc.) listen for immediate-value-changed<br>instead.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class ImmediateValueChangeEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "immediate-value-change";

    public ImmediateValueChangeEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public ImmediateValueChangeEvent() {
        super(NAME);
    }


}
