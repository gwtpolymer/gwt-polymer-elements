/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.polymer.widget;

import com.vaadin.polymer.polymer.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class CustomStyle extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public CustomStyle() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public CustomStyle(String html) {
        super(CustomStyleElement.TAG, CustomStyleElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public CustomStyleElement getPolymerElement() {
        try {
            return (CustomStyleElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property include
     * @type string
     * 
     */
    public String getInclude() {
        return getPolymerElement().getInclude();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property include
     * @type string
     * 
     */
    public void setInclude(String value) {
        getPolymerElement().setInclude(value);
    }




}