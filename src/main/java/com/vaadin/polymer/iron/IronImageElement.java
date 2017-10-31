/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-image project by The Polymer Authors
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
 * <p><code>iron-image</code> is an element for displaying an image that provides useful sizing and<br>preloading options not found on the standard <code>&lt;img&gt;</code> tag.</p>
 * <p>The <code>sizing</code> option allows the image to be either cropped (<code>cover</code>) or<br>letterboxed (<code>contain</code>) to fill a fixed user-size placed on the element.</p>
 * <p>The <code>preload</code> option prevents the browser from rendering the image until the<br>image is fully loaded.  In the interim, either the element’s CSS <code>background-color</code><br>can be be used as the placeholder, or the <code>placeholder</code> property can be<br>set to a URL (preferably a data-URI, for instant rendering) for an<br>placeholder image.</p>
 * <p>The <code>fade</code> option (only valid when <code>preload</code> is set) will cause the placeholder<br>image/color to be faded out once the image is rendered.</p>
 * <p>Examples:</p>
 * <p>  Basically identical to <code>&lt;img src=&quot;...&quot;&gt;</code> tag:</p>
 * <pre><code>&lt;iron-image src=&quot;http://lorempixel.com/400/400&quot;&gt;&lt;/iron-image&gt;
 * 
 * 
 * </code></pre><p>  Will letterbox the image to fit:</p>
 * <pre><code>&lt;iron-image style=&quot;width:400px; height:400px;&quot; sizing=&quot;contain&quot;
 *   src=&quot;http://lorempixel.com/600/400&quot;&gt;&lt;/iron-image&gt;
 * 
 * 
 * </code></pre><p>  Will crop the image to fit:</p>
 * <pre><code>&lt;iron-image style=&quot;width:400px; height:400px;&quot; sizing=&quot;cover&quot;
 *   src=&quot;http://lorempixel.com/600/400&quot;&gt;&lt;/iron-image&gt;
 * 
 * 
 * </code></pre><p>  Will show light-gray background until the image loads:</p>
 * <pre><code>&lt;iron-image style=&quot;width:400px; height:400px; background-color: lightgray;&quot;
 *   sizing=&quot;cover&quot; preload src=&quot;http://lorempixel.com/600/400&quot;&gt;&lt;/iron-image&gt;
 * 
 * 
 * </code></pre><p>  Will show a base-64 encoded placeholder image until the image loads:</p>
 * <pre><code>&lt;iron-image style=&quot;width:400px; height:400px;&quot; placeholder=&quot;data:image/gif;base64,...&quot;
 *   sizing=&quot;cover&quot; preload src=&quot;http://lorempixel.com/600/400&quot;&gt;&lt;/iron-image&gt;
 * 
 * 
 * </code></pre><p>  Will fade the light-gray background out once the image is loaded:</p>
 * <pre><code>&lt;iron-image style=&quot;width:400px; height:400px; background-color: lightgray;&quot;
 *   sizing=&quot;cover&quot; preload fade src=&quot;http://lorempixel.com/600/400&quot;&gt;&lt;/iron-image&gt;
 * 
 * 
 * </code></pre><table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--iron-image-placeholder</code></td>
 * <td>Mixin applied to #placeholder</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--iron-image-width</code></td>
 * <td>Sets the width of the wrapped image</td>
 * <td><code>auto</code></td>
 * </tr>
 * <tr>
 * <td><code>--iron-image-height</code></td>
 * <td>Sets the height of the wrapped image</td>
 * <td><code>auto</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class IronImageElement extends PolymerElement {

    @JsOverlay public static final String TAG = "iron-image";
    @JsOverlay public static final String SRC = "iron-image/iron-image.html";


    /**
     * <p>Can be used to set the width of image (e.g. via binding); size may also be<br>set via CSS.</p>
     *
     * JavaScript Info:
     * @property width
     * @type Number
     * 
     */
    @JsProperty public native  double getWidth();
    /**
     * <p>Can be used to set the width of image (e.g. via binding); size may also be<br>set via CSS.</p>
     *
     * JavaScript Info:
     * @property width
     * @type Number
     * 
     */
    @JsProperty public native  void setWidth(double value);

    /**
     * <p>Read-only value that indicates that the last set <code>src</code> failed to load.</p>
     *
     * JavaScript Info:
     * @property error
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getError();
    /**
     * <p>Read-only value that indicates that the last set <code>src</code> failed to load.</p>
     *
     * JavaScript Info:
     * @property error
     * @type Boolean
     * 
     */
    @JsProperty public native  void setError(boolean value);

    /**
     * <p>When <code>preload</code> is true, setting <code>fade</code> to true will cause the image to<br>fade into place.</p>
     *
     * JavaScript Info:
     * @property fade
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getFade();
    /**
     * <p>When <code>preload</code> is true, setting <code>fade</code> to true will cause the image to<br>fade into place.</p>
     *
     * JavaScript Info:
     * @property fade
     * @type Boolean
     * 
     */
    @JsProperty public native  void setFade(boolean value);

    /**
     * <p>Can be used to set the height of image (e.g. via binding); size may also be<br>set via CSS.</p>
     *
     * JavaScript Info:
     * @property height
     * @type Number
     * 
     */
    @JsProperty public native  double getHeight();
    /**
     * <p>Can be used to set the height of image (e.g. via binding); size may also be<br>set via CSS.</p>
     *
     * JavaScript Info:
     * @property height
     * @type Number
     * 
     */
    @JsProperty public native  void setHeight(double value);

    /**
     * <p>Read-only value that is true when the image is loaded.</p>
     *
     * JavaScript Info:
     * @property loaded
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getLoaded();
    /**
     * <p>Read-only value that is true when the image is loaded.</p>
     *
     * JavaScript Info:
     * @property loaded
     * @type Boolean
     * 
     */
    @JsProperty public native  void setLoaded(boolean value);

    /**
     * <p>Read-only value that tracks the loading state of the image when the <code>preload</code><br>option is used.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getLoading();
    /**
     * <p>Read-only value that tracks the loading state of the image when the <code>preload</code><br>option is used.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    @JsProperty public native  void setLoading(boolean value);

    /**
     * <p>When <code>true</code>, any change to the <code>src</code> property will cause the <code>placeholder</code><br>image to be shown until the new image has loaded.</p>
     *
     * JavaScript Info:
     * @property preload
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getPreload();
    /**
     * <p>When <code>true</code>, any change to the <code>src</code> property will cause the <code>placeholder</code><br>image to be shown until the new image has loaded.</p>
     *
     * JavaScript Info:
     * @property preload
     * @type Boolean
     * 
     */
    @JsProperty public native  void setPreload(boolean value);

    /**
     * <p>When true, the image is prevented from loading and any placeholder is<br>shown.  This may be useful when a binding to the src property is known to<br>be invalid, to prevent 404 requests.</p>
     *
     * JavaScript Info:
     * @property preventLoad
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getPreventLoad();
    /**
     * <p>When true, the image is prevented from loading and any placeholder is<br>shown.  This may be useful when a binding to the src property is known to<br>be invalid, to prevent 404 requests.</p>
     *
     * JavaScript Info:
     * @property preventLoad
     * @type Boolean
     * 
     */
    @JsProperty public native  void setPreventLoad(boolean value);

    /**
     * <p>When a sizing option is used (<code>cover</code> or <code>contain</code>), this determines<br>how the image is aligned within the element bounds.</p>
     *
     * JavaScript Info:
     * @property position
     * @type String
     * 
     */
    @JsProperty public native  String getPosition();
    /**
     * <p>When a sizing option is used (<code>cover</code> or <code>contain</code>), this determines<br>how the image is aligned within the element bounds.</p>
     *
     * JavaScript Info:
     * @property position
     * @type String
     * 
     */
    @JsProperty public native  void setPosition(String value);

    /**
     * <p>A short text alternative for the image.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    @JsProperty public native  String getAlt();
    /**
     * <p>A short text alternative for the image.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    @JsProperty public native  void setAlt(String value);

    /**
     * <p>CORS enabled images support: <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image">https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image</a></p>
     *
     * JavaScript Info:
     * @property crossorigin
     * @type String
     * 
     */
    @JsProperty public native  String getCrossorigin();
    /**
     * <p>CORS enabled images support: <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image">https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image</a></p>
     *
     * JavaScript Info:
     * @property crossorigin
     * @type String
     * 
     */
    @JsProperty public native  void setCrossorigin(String value);

    /**
     * <p>Sets a sizing option for the image.  Valid values are <code>contain</code> (full<br>aspect ratio of the image is contained within the element and<br>letterboxed) or <code>cover</code> (image is cropped in order to fully cover the<br>bounds of the element), or <code>null</code> (default: image takes natural size).</p>
     *
     * JavaScript Info:
     * @property sizing
     * @type String
     * 
     */
    @JsProperty public native  String getSizing();
    /**
     * <p>Sets a sizing option for the image.  Valid values are <code>contain</code> (full<br>aspect ratio of the image is contained within the element and<br>letterboxed) or <code>cover</code> (image is cropped in order to fully cover the<br>bounds of the element), or <code>null</code> (default: image takes natural size).</p>
     *
     * JavaScript Info:
     * @property sizing
     * @type String
     * 
     */
    @JsProperty public native  void setSizing(String value);

    /**
     * <p>The URL of an image.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty public native  String getSrc();
    /**
     * <p>The URL of an image.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty public native  void setSrc(String value);

    /**
     * <p>This image will be used as a background/placeholder until the src image has<br>loaded.  Use of a data-URI for placeholder is encouraged for instant rendering.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty public native  String getPlaceholder();
    /**
     * <p>This image will be used as a background/placeholder until the src image has<br>loaded.  Use of a data-URI for placeholder is encouraged for instant rendering.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty public native  void setPlaceholder(String value);


}
