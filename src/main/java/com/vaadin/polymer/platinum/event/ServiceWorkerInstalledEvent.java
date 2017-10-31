/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-sw project by The Polymer Authors
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
 * <p>Fired when the initial service worker installation completes successfully.<br>The service worker will normally only be installed once, the first time a page with a<br><code>&lt;platinum-sw-register&gt;</code> element is visited in a given browser. If the same page is visited<br>again, the existing service worker will be reused, and there won’t be another<br><code>service-worker-installed</code> fired.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class ServiceWorkerInstalledEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "service-worker-installed";

    public ServiceWorkerInstalledEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public ServiceWorkerInstalledEvent() {
        super(NAME);
    }


    @Override
    @JsProperty
    public native Detail getDetail();

    @JsType(isNative=true)
    public interface Detail extends PolymerEvent.Detail {

        /**
         * <p>message indicating that the installation succeeded.</p>
         */
        @JsProperty  String getA();

    }

}
