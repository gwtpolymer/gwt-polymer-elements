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
 * <p>Fired when a push message is received but no notification is shown.<br>This happens when the click URL is for this page and the page is<br>visible to the user on the screen.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class PlatinumPushMessagingPushEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "platinum-push-messaging-push";

    public PlatinumPushMessagingPushEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public PlatinumPushMessagingPushEvent() {
        super(NAME);
    }


    @Override
    @JsProperty
    public native Detail getDetail();

    @JsType(isNative=true)
    public interface Detail extends PolymerEvent.Detail {

        /**
         * <p>push message data that was received</p>
         */
        @JsProperty  JavaScriptObject getThe();

    }

}
