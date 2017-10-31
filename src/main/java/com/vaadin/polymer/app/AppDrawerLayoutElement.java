/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-layout project by The Polymer Authors
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app;

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
 * <p>app-drawer-layout is a wrapper element that positions an app-drawer and other content. When<br>the viewport width is smaller than <code>responsiveWidth</code>, this element changes to narrow layout.<br>In narrow layout, the drawer will be stacked on top of the main content. The drawer will slide<br>in/out to hide/reveal the main content.</p>
 * <p>By default the drawer is aligned to the start, which is left in LTR layouts:</p>
 * <pre><code class="lang-html">&lt;app-drawer-layout&gt;
 *   &lt;app-drawer&gt;
 *     drawer content
 *   &lt;/app-drawer&gt;
 *   &lt;div&gt;
 *     main content
 *   &lt;/div&gt;
 * &lt;/app-drawer-layout&gt;
 * </code></pre>
 * <p>Align the drawer at the end:</p>
 * <pre><code class="lang-html">&lt;app-drawer-layout&gt;
 *   &lt;app-drawer align=&quot;end&quot;&gt;
 *      drawer content
 *   &lt;/app-drawer&gt;
 *   &lt;div&gt;
 *     main content
 *   &lt;/div&gt;
 * &lt;/app-drawer-layout&gt;
 * </code></pre>
 * <p>With an app-header-layout:</p>
 * <pre><code class="lang-html">&lt;app-drawer-layout&gt;
 *   &lt;app-drawer&gt;
 *     drawer-content
 *   &lt;/app-drawer&gt;
 *   &lt;app-header-layout&gt;
 *     &lt;app-header&gt;
 *       &lt;app-toolbar&gt;
 *         &lt;div main-title&gt;App name&lt;/div&gt;
 *       &lt;/app-toolbar&gt;
 *     &lt;/app-header&gt;
 * 
 *     main content
 * 
 *   &lt;/app-header-layout&gt;
 * &lt;/app-drawer-layout&gt;
 * </code></pre>
 * <p>Add the <code>drawer-toggle</code> attribute to elements inside <code>app-drawer-layout</code> that toggle the drawer on tap events:</p>
 * <pre><code class="lang-html">&lt;app-drawer-layout&gt;
 *   &lt;app-drawer&gt;
 *     drawer-content
 *   &lt;/app-drawer&gt;
 *   &lt;app-header-layout&gt;
 *     &lt;app-header&gt;
 *       &lt;app-toolbar&gt;
 *         &lt;paper-icon-button icon=&quot;menu&quot; drawer-toggle&gt;&lt;/paper-icon-button&gt;
 *         &lt;div main-title&gt;App name&lt;/div&gt;
 *       &lt;/app-toolbar&gt;
 *     &lt;/app-header&gt;
 * 
 *     main content
 * 
 *   &lt;/app-header-layout&gt;
 * &lt;/app-drawer-layout&gt;
 * </code></pre>
 * <p>Add the <code>fullbleed</code> attribute to app-drawer-layout to make it fit the size of its container:</p>
 * <pre><code class="lang-html">&lt;app-drawer-layout fullbleed&gt;
 *   &lt;app-drawer&gt;
 *      drawer content
 *   &lt;/app-drawer&gt;
 *   &lt;div&gt;
 *     main content
 *   &lt;/div&gt;
 * &lt;/app-drawer-layout&gt;
 * </code></pre>
 * <h3 id="styling">Styling</h3>
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
 * <td><code>--app-drawer-layout-content-transition</code></td>
 * <td>Transition for the content container</td>
 * <td>none</td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class AppDrawerLayoutElement extends PolymerElement {

    @JsOverlay public static final String TAG = "app-drawer-layout";
    @JsOverlay public static final String SRC = "app-layout/app-layout.html";


    /**
     * <p>Returns true if it is in narrow layout. This is useful if you need to show/hide<br>elements based on the layout.</p>
     *
     * JavaScript Info:
     * @property narrow
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getNarrow();
    /**
     * <p>Returns true if it is in narrow layout. This is useful if you need to show/hide<br>elements based on the layout.</p>
     *
     * JavaScript Info:
     * @property narrow
     * @type Boolean
     * 
     */
    @JsProperty public native  void setNarrow(boolean value);

    /**
     * <p>If true, the drawer will initially be opened when in narrow layout mode.</p>
     *
     * JavaScript Info:
     * @property openedWhenNarrow
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getOpenedWhenNarrow();
    /**
     * <p>If true, the drawer will initially be opened when in narrow layout mode.</p>
     *
     * JavaScript Info:
     * @property openedWhenNarrow
     * @type Boolean
     * 
     */
    @JsProperty public native  void setOpenedWhenNarrow(boolean value);

    /**
     * <p>If true, ignore <code>responsiveWidth</code> setting and force the narrow layout.</p>
     *
     * JavaScript Info:
     * @property forceNarrow
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getForceNarrow();
    /**
     * <p>If true, ignore <code>responsiveWidth</code> setting and force the narrow layout.</p>
     *
     * JavaScript Info:
     * @property forceNarrow
     * @type Boolean
     * 
     */
    @JsProperty public native  void setForceNarrow(boolean value);

    /**
     * <p>If the viewport’s width is smaller than this value, the panel will change to narrow<br>layout. In the mode the drawer will be closed.</p>
     *
     * JavaScript Info:
     * @property responsiveWidth
     * @type String
     * 
     */
    @JsProperty public native  String getResponsiveWidth();
    /**
     * <p>If the viewport’s width is smaller than this value, the panel will change to narrow<br>layout. In the mode the drawer will be closed.</p>
     *
     * JavaScript Info:
     * @property responsiveWidth
     * @type String
     * 
     */
    @JsProperty public native  void setResponsiveWidth(String value);


    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior VaadinSplitLayout
     * 
     */
    public native void assignParentResizable(Object parentResizable);

    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior VaadinSplitLayout
     * 
     */
    public native void stopResizeNotificationsFor(Object target);

    /**
     * 
     *
     * JavaScript Info:
     * @method resetLayout
     * 
     * 
     */
    public native void resetLayout();

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinSplitLayout
     * 
     */
    public native void notifyResize();

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior VaadinSplitLayout
     * @return {boolean}
     */
    public native boolean resizerShouldNotify(HTMLElement element);

}
