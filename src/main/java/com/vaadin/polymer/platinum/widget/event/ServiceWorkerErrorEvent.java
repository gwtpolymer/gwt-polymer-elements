/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-sw project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import elemental2.core.Array;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.base.Js;

/**
 * <p>Fired when an error prevents the service worker installation from completing.</p>
 */
public class ServiceWorkerErrorEvent extends DomEvent<ServiceWorkerErrorEventHandler> {

    public static Type<ServiceWorkerErrorEventHandler> TYPE = new Type<ServiceWorkerErrorEventHandler>(
       com.vaadin.polymer.platinum.event.ServiceWorkerErrorEvent.NAME, new ServiceWorkerErrorEvent());


    public ServiceWorkerErrorEvent() {
    }

    public Type<ServiceWorkerErrorEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ServiceWorkerErrorEventHandler handler) {
        handler.onServiceWorkerError(this);
    }

    public com.vaadin.polymer.platinum.event.ServiceWorkerErrorEvent getPolymerEvent() {
        return Js.cast(super.getNativeEvent());
    }


    /**
     * <p>message indicating what went wrong.</p>
     */
    public  String getA() {
        return getPolymerEvent().getDetail().getA();
    }

}
