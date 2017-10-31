/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-split-layout project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
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
 * <p>Fired when the splitter is dragged. Non-bubbing. Fired for the splitter<br>element and any nested elements with <code>IronResizableBehavior</code>.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class IronResizeEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "iron-resize";

    public IronResizeEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public IronResizeEvent() {
        super(NAME);
    }


}
