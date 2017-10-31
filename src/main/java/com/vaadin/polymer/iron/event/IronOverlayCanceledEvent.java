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
 * <p>Fired when the overlay is canceled, but before it is closed.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class IronOverlayCanceledEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "iron-overlay-canceled";

    public IronOverlayCanceledEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public IronOverlayCanceledEvent() {
        super(NAME);
    }


    @Override
    @JsProperty
    public native Detail getDetail();

    @JsType(isNative=true)
    public interface Detail extends PolymerEvent.Detail {

        /**
         * <p>The closing of the overlay can be prevented<br>by calling <code>event.preventDefault()</code>. The <code>event.detail</code> is the original event that<br>originated the canceling (e.g. ESC keyboard event or click event outside the overlay).</p>
         */
        @JsProperty  JavaScriptObject getEvent();

    }

}
