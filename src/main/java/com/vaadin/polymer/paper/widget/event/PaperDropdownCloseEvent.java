/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu-button project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import elemental2.core.Array;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.base.Js;

/**
 * <p>Fired when the dropdown closes.</p>
 */
public class PaperDropdownCloseEvent extends DomEvent<PaperDropdownCloseEventHandler> {

    public static Type<PaperDropdownCloseEventHandler> TYPE = new Type<PaperDropdownCloseEventHandler>(
       com.vaadin.polymer.paper.event.PaperDropdownCloseEvent.NAME, new PaperDropdownCloseEvent());


    public PaperDropdownCloseEvent() {
    }

    public Type<PaperDropdownCloseEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperDropdownCloseEventHandler handler) {
        handler.onPaperDropdownClose(this);
    }

    public com.vaadin.polymer.paper.event.PaperDropdownCloseEvent getPolymerEvent() {
        return Js.cast(super.getNativeEvent());
    }


}
