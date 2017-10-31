/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-storage project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app;

import elemental2.dom.*;
import com.google.gwt.core.client.JavaScriptObject;
import elemental2.core.Array;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import com.vaadin.polymer.PolymerFunction;


/**
 * <p><code>Polymer.AppNetworkStatusBehavior</code> tracks the status of whether the browser<br>is online or offline. True if the browser is online, and false if the browser is<br>offline matching the HTML browser state spec.</p>
 */
@JsType(isNative=true)
public interface AppNetworkStatusBehavior {

    @JsOverlay public static final String NAME = "Polymer.AppNetworkStatusBehavior";
    @JsOverlay public static final String SRC = "app-storage/app-network-status-behavior.html";
    @JsOverlay public default <T> T cast() {
      return (T)this;
    }


    /**
     * <p>True if the browser is online, and false if the browser is offline<br>matching the HTML browser state spec.</p>
     *
     * JavaScript Info:
     * @property online
     * @type Boolean
     * 
     */
    @JsProperty  boolean getOnline();
    /**
     * <p>True if the browser is online, and false if the browser is offline<br>matching the HTML browser state spec.</p>
     *
     * JavaScript Info:
     * @property online
     * @type Boolean
     * 
     */
    @JsProperty  void setOnline(boolean value);


    /**
     * <p>Updates the <code>online</code> property to reflect the browser connection status.</p>
     *
     * JavaScript Info:
     * @method refreshNetworkStatus
     * 
     * 
     */
     void refreshNetworkStatus();

}
