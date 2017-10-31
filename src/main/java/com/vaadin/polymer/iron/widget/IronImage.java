/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-image project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

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
public class IronImage extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronImage() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronImage(String html) {
        super(IronImageElement.TAG, IronImageElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronImageElement getPolymerElement() {
        return Js.cast(getElement());
    }


    /**
     * <p>Can be used to set the width of image (e.g. via binding); size may also be<br>set via CSS.</p>
     *
     * JavaScript Info:
     * @property width
     * @type Number
     * 
     */
    public  double getWidth() {
        return getPolymerElement().getWidth();
    }
    /**
     * <p>Can be used to set the width of image (e.g. via binding); size may also be<br>set via CSS.</p>
     *
     * JavaScript Info:
     * @property width
     * @type Number
     * 
     */
    public  void setWidth(double value) {
        getPolymerElement().setWidth(value);
    }

    /**
     * <p>Read-only value that indicates that the last set <code>src</code> failed to load.</p>
     *
     * JavaScript Info:
     * @property error
     * @type Boolean
     * 
     */
    public  boolean getError() {
        return getPolymerElement().getError();
    }
    /**
     * <p>Read-only value that indicates that the last set <code>src</code> failed to load.</p>
     *
     * JavaScript Info:
     * @property error
     * @type Boolean
     * 
     */
    public  void setError(boolean value) {
        getPolymerElement().setError(value);
    }

    /**
     * <p>When <code>preload</code> is true, setting <code>fade</code> to true will cause the image to<br>fade into place.</p>
     *
     * JavaScript Info:
     * @property fade
     * @type Boolean
     * 
     */
    public  boolean getFade() {
        return getPolymerElement().getFade();
    }
    /**
     * <p>When <code>preload</code> is true, setting <code>fade</code> to true will cause the image to<br>fade into place.</p>
     *
     * JavaScript Info:
     * @property fade
     * @type Boolean
     * 
     */
    public  void setFade(boolean value) {
        getPolymerElement().setFade(value);
    }

    /**
     * <p>Can be used to set the height of image (e.g. via binding); size may also be<br>set via CSS.</p>
     *
     * JavaScript Info:
     * @property height
     * @type Number
     * 
     */
    public  double getHeight() {
        return getPolymerElement().getHeight();
    }
    /**
     * <p>Can be used to set the height of image (e.g. via binding); size may also be<br>set via CSS.</p>
     *
     * JavaScript Info:
     * @property height
     * @type Number
     * 
     */
    public  void setHeight(double value) {
        getPolymerElement().setHeight(value);
    }

    /**
     * <p>Read-only value that is true when the image is loaded.</p>
     *
     * JavaScript Info:
     * @property loaded
     * @type Boolean
     * 
     */
    public  boolean getLoaded() {
        return getPolymerElement().getLoaded();
    }
    /**
     * <p>Read-only value that is true when the image is loaded.</p>
     *
     * JavaScript Info:
     * @property loaded
     * @type Boolean
     * 
     */
    public  void setLoaded(boolean value) {
        getPolymerElement().setLoaded(value);
    }

    /**
     * <p>Read-only value that tracks the loading state of the image when the <code>preload</code><br>option is used.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    public  boolean getLoading() {
        return getPolymerElement().getLoading();
    }
    /**
     * <p>Read-only value that tracks the loading state of the image when the <code>preload</code><br>option is used.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    public  void setLoading(boolean value) {
        getPolymerElement().setLoading(value);
    }

    /**
     * <p>When <code>true</code>, any change to the <code>src</code> property will cause the <code>placeholder</code><br>image to be shown until the new image has loaded.</p>
     *
     * JavaScript Info:
     * @property preload
     * @type Boolean
     * 
     */
    public  boolean getPreload() {
        return getPolymerElement().getPreload();
    }
    /**
     * <p>When <code>true</code>, any change to the <code>src</code> property will cause the <code>placeholder</code><br>image to be shown until the new image has loaded.</p>
     *
     * JavaScript Info:
     * @property preload
     * @type Boolean
     * 
     */
    public  void setPreload(boolean value) {
        getPolymerElement().setPreload(value);
    }

    /**
     * <p>When true, the image is prevented from loading and any placeholder is<br>shown.  This may be useful when a binding to the src property is known to<br>be invalid, to prevent 404 requests.</p>
     *
     * JavaScript Info:
     * @property preventLoad
     * @type Boolean
     * 
     */
    public  boolean getPreventLoad() {
        return getPolymerElement().getPreventLoad();
    }
    /**
     * <p>When true, the image is prevented from loading and any placeholder is<br>shown.  This may be useful when a binding to the src property is known to<br>be invalid, to prevent 404 requests.</p>
     *
     * JavaScript Info:
     * @property preventLoad
     * @type Boolean
     * 
     */
    public  void setPreventLoad(boolean value) {
        getPolymerElement().setPreventLoad(value);
    }

    /**
     * <p>When a sizing option is used (<code>cover</code> or <code>contain</code>), this determines<br>how the image is aligned within the element bounds.</p>
     *
     * JavaScript Info:
     * @property position
     * @type String
     * 
     */
    public  String getPosition() {
        return getPolymerElement().getPosition();
    }
    /**
     * <p>When a sizing option is used (<code>cover</code> or <code>contain</code>), this determines<br>how the image is aligned within the element bounds.</p>
     *
     * JavaScript Info:
     * @property position
     * @type String
     * 
     */
    public  void setPosition(String value) {
        getPolymerElement().setPosition(value);
    }

    /**
     * <p>A short text alternative for the image.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    public  String getAlt() {
        return getPolymerElement().getAlt();
    }
    /**
     * <p>A short text alternative for the image.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    public  void setAlt(String value) {
        getPolymerElement().setAlt(value);
    }

    /**
     * <p>CORS enabled images support: <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image">https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image</a></p>
     *
     * JavaScript Info:
     * @property crossorigin
     * @type String
     * 
     */
    public  String getCrossorigin() {
        return getPolymerElement().getCrossorigin();
    }
    /**
     * <p>CORS enabled images support: <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image">https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image</a></p>
     *
     * JavaScript Info:
     * @property crossorigin
     * @type String
     * 
     */
    public  void setCrossorigin(String value) {
        getPolymerElement().setCrossorigin(value);
    }

    /**
     * <p>Sets a sizing option for the image.  Valid values are <code>contain</code> (full<br>aspect ratio of the image is contained within the element and<br>letterboxed) or <code>cover</code> (image is cropped in order to fully cover the<br>bounds of the element), or <code>null</code> (default: image takes natural size).</p>
     *
     * JavaScript Info:
     * @property sizing
     * @type String
     * 
     */
    public  String getSizing() {
        return getPolymerElement().getSizing();
    }
    /**
     * <p>Sets a sizing option for the image.  Valid values are <code>contain</code> (full<br>aspect ratio of the image is contained within the element and<br>letterboxed) or <code>cover</code> (image is cropped in order to fully cover the<br>bounds of the element), or <code>null</code> (default: image takes natural size).</p>
     *
     * JavaScript Info:
     * @property sizing
     * @type String
     * 
     */
    public  void setSizing(String value) {
        getPolymerElement().setSizing(value);
    }

    /**
     * <p>The URL of an image.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    public  String getSrc() {
        return getPolymerElement().getSrc();
    }
    /**
     * <p>The URL of an image.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    public  void setSrc(String value) {
        getPolymerElement().setSrc(value);
    }

    /**
     * <p>This image will be used as a background/placeholder until the src image has<br>loaded.  Use of a data-URI for placeholder is encouraged for instant rendering.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    public  String getPlaceholder() {
        return getPolymerElement().getPlaceholder();
    }
    /**
     * <p>This image will be used as a background/placeholder until the src image has<br>loaded.  Use of a data-URI for placeholder is encouraged for instant rendering.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    public  void setPlaceholder(String value) {
        getPolymerElement().setPlaceholder(value);
    }


    // Needed in UIBinder
    /**
     * <p>Can be used to set the width of image (e.g. via binding); size may also be<br>set via CSS.</p>
     *
     * JavaScript Info:
     * @attribute width
     * 
     */
    public void setWidth(String value) {
        Polymer.property(this.getPolymerElement(), "width", value);
    }

    // Needed in UIBinder
    /**
     * <p>Can be used to set the height of image (e.g. via binding); size may also be<br>set via CSS.</p>
     *
     * JavaScript Info:
     * @attribute height
     * 
     */
    public void setHeight(String value) {
        Polymer.property(this.getPolymerElement(), "height", value);
    }



}
