/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-layout project by The Polymer Authors
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import elemental2.core.Array;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.base.Js;

/**
 * <p>Fired when the layout of app-drawer has changed.</p>
 */
public class AppDrawerResetLayoutEvent extends DomEvent<AppDrawerResetLayoutEventHandler> {

    public static Type<AppDrawerResetLayoutEventHandler> TYPE = new Type<AppDrawerResetLayoutEventHandler>(
       com.vaadin.polymer.app.event.AppDrawerResetLayoutEvent.NAME, new AppDrawerResetLayoutEvent());


    public AppDrawerResetLayoutEvent() {
    }

    public Type<AppDrawerResetLayoutEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(AppDrawerResetLayoutEventHandler handler) {
        handler.onAppDrawerResetLayout(this);
    }

    public com.vaadin.polymer.app.event.AppDrawerResetLayoutEvent getPolymerEvent() {
        return Js.cast(super.getNativeEvent());
    }


}
