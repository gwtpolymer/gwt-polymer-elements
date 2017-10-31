/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-icon project by The Polymer Authors
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
 * <p>The <code>iron-icon</code> element displays an icon. By default an icon renders as a 24px square.</p>
 * <p>Example using src:</p>
 * <pre><code>&lt;iron-icon src=&quot;star.png&quot;&gt;&lt;/iron-icon&gt;
 * 
 * 
 * </code></pre><p>Example setting size to 32px x 32px:</p>
 * <pre><code>&lt;iron-icon class=&quot;big&quot; src=&quot;big_star.png&quot;&gt;&lt;/iron-icon&gt;
 * 
 * &lt;style is=&quot;custom-style&quot;&gt;
 *   .big {
 *     --iron-icon-height: 32px;
 *     --iron-icon-width: 32px;
 *   }
 * &lt;/style&gt;
 * 
 * 
 * </code></pre><p>The iron elements include several sets of icons.<br>To use the default set of icons, import <code>iron-icons.html</code> and use the <code>icon</code> attribute to specify an icon:</p>
 * <pre><code>&lt;link rel=&quot;import&quot; href=&quot;/components/iron-icons/iron-icons.html&quot;&gt;
 * 
 * &lt;iron-icon icon=&quot;menu&quot;&gt;&lt;/iron-icon&gt;
 * 
 * 
 * </code></pre><p>To use a different built-in set of icons, import the specific <code>iron-icons/&lt;iconset&gt;-icons.html</code>, and<br>specify the icon as <code>&lt;iconset&gt;:&lt;icon&gt;</code>. For example, to use a communication icon, you would<br>use:</p>
 * <pre><code>&lt;link rel=&quot;import&quot; href=&quot;/components/iron-icons/communication-icons.html&quot;&gt;
 * 
 * &lt;iron-icon icon=&quot;communication:email&quot;&gt;&lt;/iron-icon&gt;
 * 
 * 
 * </code></pre><p>You can also create custom icon sets of bitmap or SVG icons.</p>
 * <p>Example of using an icon named <code>cherry</code> from a custom iconset with the ID <code>fruit</code>:</p>
 * <pre><code>&lt;iron-icon icon=&quot;fruit:cherry&quot;&gt;&lt;/iron-icon&gt;
 * 
 * 
 * </code></pre><p>See <a href="iron-iconset">iron-iconset</a> and <a href="iron-iconset-svg">iron-iconset-svg</a> for more information about<br>how to create a custom iconset.</p>
 * <p>See the <a href="iron-icons?view=demo:demo/index.html">iron-icons demo</a> to see the icons available<br>in the various iconsets.</p>
 * <p>To load a subset of icons from one of the default <code>iron-icons</code> sets, you can<br>use the <a href="https://poly-icon.appspot.com/">poly-icon</a> tool. It allows you<br>to select individual icons, and creates an iconset from them that you can<br>use directly in your elements.</p>
 * <h3 id="styling">Styling</h3>
 * <p>The following custom properties are available for styling:</p>
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
 * <td><code>--iron-icon</code></td>
 * <td>Mixin applied to the icon</td>
 * <td>{}</td>
 * </tr>
 * <tr>
 * <td><code>--iron-icon-width</code></td>
 * <td>Width of the icon</td>
 * <td><code>24px</code></td>
 * </tr>
 * <tr>
 * <td><code>--iron-icon-height</code></td>
 * <td>Height of the icon</td>
 * <td><code>24px</code></td>
 * </tr>
 * <tr>
 * <td><code>--iron-icon-fill-color</code></td>
 * <td>Fill color of the svg icon</td>
 * <td><code>currentcolor</code></td>
 * </tr>
 * <tr>
 * <td><code>--iron-icon-stroke-color</code></td>
 * <td>Stroke color of the svg icon</td>
 * <td>none</td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class IronIconElement extends PolymerElement {

    @JsOverlay public static final String TAG = "iron-icon";
    @JsOverlay public static final String SRC = "iron-icon/iron-icon.html";


    /**
     * <p>The name of the icon to use. The name should be of the form:<br><code>iconset_name:icon_name</code>.</p>
     *
     * JavaScript Info:
     * @property icon
     * @type String
     * 
     */
    @JsProperty public native  String getIcon();
    /**
     * <p>The name of the icon to use. The name should be of the form:<br><code>iconset_name:icon_name</code>.</p>
     *
     * JavaScript Info:
     * @property icon
     * @type String
     * 
     */
    @JsProperty public native  void setIcon(String value);

    /**
     * <p>If using iron-icon without an iconset, you can set the src to be<br>the URL of an individual icon image file. Note that this will take<br>precedence over a given icon attribute.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty public native  String getSrc();
    /**
     * <p>If using iron-icon without an iconset, you can set the src to be<br>the URL of an individual icon image file. Note that this will take<br>precedence over a given icon attribute.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty public native  void setSrc(String value);

    /**
     * <p>The name of the theme to used, if one is specified by the<br>iconset.</p>
     *
     * JavaScript Info:
     * @property theme
     * @type String
     * 
     */
    @JsProperty public native  String getTheme();
    /**
     * <p>The name of the theme to used, if one is specified by the<br>iconset.</p>
     *
     * JavaScript Info:
     * @property theme
     * @type String
     * 
     */
    @JsProperty public native  void setTheme(String value);


}
