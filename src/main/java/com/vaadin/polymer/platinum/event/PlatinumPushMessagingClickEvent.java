/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-push-messaging project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum.event;

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
 * <p>Fired when a notification is clicked that had the current page as the<br>click URL.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class PlatinumPushMessagingClickEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "platinum-push-messaging-click";

    public PlatinumPushMessagingClickEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public PlatinumPushMessagingClickEvent() {
        super(NAME);
    }


    @Override
    @JsProperty
    public native Detail getDetail();

    @JsType(isNative=true)
    public interface Detail extends PolymerEvent.Detail {

        /**
         * <p>push message data used to create the notification</p>
         */
        @JsProperty  JavaScriptObject getThe();

    }

}
