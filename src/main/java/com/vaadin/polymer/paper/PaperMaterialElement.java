/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-material project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper;

import elemental2.dom.HTMLElement;
import elemental2.dom.Element;
import com.google.gwt.core.client.JavaScriptObject;
import elemental2.core.Array;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import com.vaadin.polymer.PolymerElement;
import com.vaadin.polymer.PolymerFunction;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/components/cards.html">Cards</a></p>
 * <p><code>paper-material</code> is a container that renders two shadows on top of each other to<br>create the effect of a lifted piece of paper.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-material elevation=&quot;1&quot;&gt;
 *   ... content ...
 * &lt;/paper-material&gt;
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class PaperMaterialElement extends PolymerElement {

    @JsOverlay public static final String TAG = "paper-material";
    @JsOverlay public static final String SRC = "paper-material/paper-material.html";


    /**
     * <p>Set this to true to animate the shadow when setting a new<br><code>elevation</code> value.</p>
     *
     * JavaScript Info:
     * @property animated
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getAnimated();
    /**
     * <p>Set this to true to animate the shadow when setting a new<br><code>elevation</code> value.</p>
     *
     * JavaScript Info:
     * @property animated
     * @type Boolean
     * 
     */
    @JsProperty public native  void setAnimated(boolean value);

    /**
     * <p>The z-depth of this element, from 0-5. Setting to 0 will remove the<br>shadow, and each increasing number greater than 0 will be “deeper”<br>than the last.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type Number
     * 
     */
    @JsProperty public native  double getElevation();
    /**
     * <p>The z-depth of this element, from 0-5. Setting to 0 will remove the<br>shadow, and each increasing number greater than 0 will be “deeper”<br>than the last.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type Number
     * 
     */
    @JsProperty public native  void setElevation(double value);


}
