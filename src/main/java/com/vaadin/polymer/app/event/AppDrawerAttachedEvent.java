/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-layout project by The Polymer Authors
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app.event;

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
 * <p>Fired when the layout of app-drawer is attached.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class AppDrawerAttachedEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "app-drawer-attached";

    public AppDrawerAttachedEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public AppDrawerAttachedEvent() {
        super(NAME);
    }


}
