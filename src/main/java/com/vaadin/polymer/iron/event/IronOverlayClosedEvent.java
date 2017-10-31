/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-context-menu project by unknown author
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
 * <p>Fired after the overlay closes.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class IronOverlayClosedEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "iron-overlay-closed";

    public IronOverlayClosedEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public IronOverlayClosedEvent() {
        super(NAME);
    }


    @Override
    @JsProperty
    public native Detail getDetail();

    @JsType(isNative=true)
    public interface Detail extends PolymerEvent.Detail {

        /**
         * <p>The <code>event.detail</code> is the <code>closingReason</code> property<br>(contains <code>canceled</code>, whether the overlay was canceled).</p>
         */
        @JsProperty  JavaScriptObject getEvent();

    }

}
