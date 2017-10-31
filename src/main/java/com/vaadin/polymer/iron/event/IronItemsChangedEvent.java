/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tabs project by The Polymer Authors
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
 * <p>Fired when the list of selectable items changes (e.g., items are<br>added or removed). The detail of the event is a mutation record that<br>describes what changed.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class IronItemsChangedEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "iron-items-changed";

    public IronItemsChangedEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public IronItemsChangedEvent() {
        super(NAME);
    }


}
