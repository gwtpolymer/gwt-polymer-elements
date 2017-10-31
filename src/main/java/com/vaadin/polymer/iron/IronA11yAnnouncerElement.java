/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-a11y-announcer project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

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
 * <p><code>iron-a11y-announcer</code> is a singleton element that is intended to add a11y<br>to features that require on-demand announcement from screen readers. In<br>order to make use of the announcer, it is best to request its availability<br>in the announcing element.</p>
 * <p>Example:</p>
 * <pre><code>Polymer({
 * 
 *   is: &#39;x-chatty&#39;,
 * 
 *   attached: function() {
 *     // This will create the singleton element if it has not
 *     // been created yet:
 *     Polymer.IronA11yAnnouncer.requestAvailability();
 *   }
 * });
 * 
 * 
 * </code></pre><p>After the <code>iron-a11y-announcer</code> has been made available, elements can<br>make announces by firing bubbling <code>iron-announce</code> events.</p>
 * <p>Example:</p>
 * <pre><code>this.fire(&#39;iron-announce&#39;, {
 *   text: &#39;This is an announcement!&#39;
 * }, { bubbles: true });
 * 
 * 
 * </code></pre><p>Note: announcements are only audible if you have a screen reader enabled.</p>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class IronA11yAnnouncerElement extends PolymerElement {

    @JsOverlay public static final String TAG = "iron-a11y-announcer";
    @JsOverlay public static final String SRC = "iron-a11y-announcer/iron-a11y-announcer.html";


    /**
     * <p>The value of mode is used to set the <code>aria-live</code> attribute<br>for the element that will be announced. Valid values are: <code>off</code>,<br><code>polite</code> and <code>assertive</code>.</p>
     *
     * JavaScript Info:
     * @property mode
     * @type String
     * 
     */
    @JsProperty public native  String getMode();
    /**
     * <p>The value of mode is used to set the <code>aria-live</code> attribute<br>for the element that will be announced. Valid values are: <code>off</code>,<br><code>polite</code> and <code>assertive</code>.</p>
     *
     * JavaScript Info:
     * @property mode
     * @type String
     * 
     */
    @JsProperty public native  void setMode(String value);


    /**
     * <p>Cause a text string to be announced by screen readers.</p>
     *
     * JavaScript Info:
     * @method announce
     * @param {string} text  
     * 
     * 
     */
    public native void announce(String text);

}
