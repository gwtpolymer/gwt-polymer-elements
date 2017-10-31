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
 * <p>Fires when the layout of <code>app-header</code> changed.</p>
 */
public class AppHeaderResetLayoutEvent extends DomEvent<AppHeaderResetLayoutEventHandler> {

    public static Type<AppHeaderResetLayoutEventHandler> TYPE = new Type<AppHeaderResetLayoutEventHandler>(
       com.vaadin.polymer.app.event.AppHeaderResetLayoutEvent.NAME, new AppHeaderResetLayoutEvent());


    public AppHeaderResetLayoutEvent() {
    }

    public Type<AppHeaderResetLayoutEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(AppHeaderResetLayoutEventHandler handler) {
        handler.onAppHeaderResetLayout(this);
    }

    public com.vaadin.polymer.app.event.AppHeaderResetLayoutEvent getPolymerEvent() {
        return Js.cast(super.getNativeEvent());
    }


}
