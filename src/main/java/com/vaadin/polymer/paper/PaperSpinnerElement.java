/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-spinner project by The Polymer Authors
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
 * <p>Material design: <a href="https://www.google.com/design/spec/components/progress-activity.html">Progress &amp; activity</a></p>
 * <p>Element providing a multiple color material design circular spinner.</p>
 * <pre><code>&lt;paper-spinner active&gt;&lt;/paper-spinner&gt;
 * 
 * 
 * </code></pre><p>The default spinner cycles between four layers of colors; by default they are<br>blue, red, yellow and green. It can be customized to cycle between four different<br>colors. Use <paper-spinner-lite> for single color spinners.</p>
 * <h3 id="accessibility">Accessibility</h3>
 * <p>Alt attribute should be set to provide adequate context for accessibility. If not provided,<br>it defaults to ‘loading’.<br>Empty alt can be provided to mark the element as decorative if alternative content is provided<br>in another form (e.g. a text block following the spinner).</p>
 * <pre><code>&lt;paper-spinner alt=&quot;Loading contacts list&quot; active&gt;&lt;/paper-spinner&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--paper-spinner-layer-1-color</code></td>
 * <td>Color of the first spinner rotation</td>
 * <td><code>--google-blue-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-spinner-layer-2-color</code></td>
 * <td>Color of the second spinner rotation</td>
 * <td><code>--google-red-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-spinner-layer-3-color</code></td>
 * <td>Color of the third spinner rotation</td>
 * <td><code>--google-yellow-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-spinner-layer-4-color</code></td>
 * <td>Color of the fourth spinner rotation</td>
 * <td><code>--google-green-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-spinner-stroke-width</code></td>
 * <td>The width of the spinner stroke</td>
 * <td>3px</td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class PaperSpinnerElement extends PolymerElement {

    @JsOverlay public static final String TAG = "paper-spinner";
    @JsOverlay public static final String SRC = "paper-spinner/paper-spinner.html";


    /**
     * <p>Displays the spinner.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getActive();
    /**
     * <p>Displays the spinner.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * 
     */
    @JsProperty public native  void setActive(boolean value);

    /**
     * <p>Alternative text content for accessibility support.<br>If alt is present, it will add an aria-label whose content matches alt when active.<br>If alt is not present, it will default to ‘loading’ as the alt value.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    @JsProperty public native  String getAlt();
    /**
     * <p>Alternative text content for accessibility support.<br>If alt is present, it will add an aria-label whose content matches alt when active.<br>If alt is not present, it will default to ‘loading’ as the alt value.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    @JsProperty public native  void setAlt(String value);


}
