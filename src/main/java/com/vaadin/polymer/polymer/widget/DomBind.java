/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.polymer.widget;

import com.vaadin.polymer.polymer.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.PolymerWidget;
import elemental2.core.Array;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;
import com.vaadin.polymer.PolymerFunction;
import elemental2.dom.Element;
import elemental2.dom.HTMLElement;
import jsinterop.base.Js;

/**
 * 
 */
public class DomBind extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public DomBind() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public DomBind(String html) {
        super(DomBindElement.TAG, DomBindElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public DomBindElement getPolymerElement() {
        return Js.cast(getElement());
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property notifyDomChange
     * @type Boolean
     * 
     */
    public  boolean getNotifyDomChange() {
        return getPolymerElement().getNotifyDomChange();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property notifyDomChange
     * @type Boolean
     * 
     */
    public  void setNotifyDomChange(boolean value) {
        getPolymerElement().setNotifyDomChange(value);
    }



    /**
     * 
     *
     * JavaScript Info:
     * @method render
     * 
     * 
     */
    public void render() {
        getPolymerElement().render();
    }


}
