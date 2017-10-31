/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-badge project by The Polymer Authors
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
 * <p><code>&lt;paper-badge&gt;</code> is a circular text badge that is displayed on the top right<br>corner of an element, representing a status or a notification. It will badge<br>the anchor element specified in the <code>for</code> attribute, or, if that doesn’t exist,<br>centered to the parent node containing it.</p>
 * <p>Badges can also contain an icon by adding the <code>icon</code> attribute and setting<br>it to the id of the desired icon. Please note that you should still set the<br><code>label</code> attribute in order to keep the element accessible. Also note that you will need to import<br>the <code>iron-iconset</code> that includes the icons you want to use. See <a href="../iron-icon">iron-icon</a><br>for more information on how to import and use icon sets.</p>
 * <p>Example:</p>
 * <pre><code>&lt;div style=&quot;display:inline-block&quot;&gt;
 *   &lt;span&gt;Inbox&lt;/span&gt;
 *   &lt;paper-badge label=&quot;3&quot;&gt;&lt;/paper-badge&gt;
 * &lt;/div&gt;
 * 
 * &lt;div&gt;
 *   &lt;paper-button id=&quot;btn&quot;&gt;Status&lt;/paper-button&gt;
 *   &lt;paper-badge icon=&quot;favorite&quot; for=&quot;btn&quot; label=&quot;favorite icon&quot;&gt;&lt;/paper-badge&gt;
 * &lt;/div&gt;
 * 
 * &lt;div&gt;
 *   &lt;paper-icon-button id=&quot;account-box&quot; icon=&quot;account-box&quot; alt=&quot;account-box&quot;&gt;&lt;/paper-icon-button&gt;
 *   &lt;paper-badge icon=&quot;social:mood&quot; for=&quot;account-box&quot; label=&quot;mood icon&quot;&gt;&lt;/paper-badge&gt;
 * &lt;/div&gt;
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
 * <td><code>--paper-badge-background</code></td>
 * <td>The background color of the badge</td>
 * <td><code>--accent-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-opacity</code></td>
 * <td>The opacity of the badge</td>
 * <td><code>1.0</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-text-color</code></td>
 * <td>The color of the badge text</td>
 * <td><code>white</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-width</code></td>
 * <td>The width of the badge circle</td>
 * <td><code>20px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-height</code></td>
 * <td>The height of the badge circle</td>
 * <td><code>20px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-margin-left</code></td>
 * <td>Optional spacing added to the left of the badge.</td>
 * <td><code>0px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-margin-bottom</code></td>
 * <td>Optional spacing added to the bottom of the badge.</td>
 * <td><code>0px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge</code></td>
 * <td>Mixin applied to the badge</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class PaperBadgeElement extends PolymerElement {

    @JsOverlay public static final String TAG = "paper-badge";
    @JsOverlay public static final String SRC = "paper-badge/paper-badge.html";


    /**
     * <p>An iron-icon ID. When given, the badge content will use an<br><code>&lt;iron-icon&gt;</code> element displaying the given icon ID rather than the<br>label text. However, the label text will still be used for<br>accessibility purposes.</p>
     *
     * JavaScript Info:
     * @property icon
     * @type String
     * 
     */
    @JsProperty public native  String getIcon();
    /**
     * <p>An iron-icon ID. When given, the badge content will use an<br><code>&lt;iron-icon&gt;</code> element displaying the given icon ID rather than the<br>label text. However, the label text will still be used for<br>accessibility purposes.</p>
     *
     * JavaScript Info:
     * @property icon
     * @type String
     * 
     */
    @JsProperty public native  void setIcon(String value);

    /**
     * <p>The label displayed in the badge. The label is centered, and ideally<br>should have very few characters.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    @JsProperty public native  String getLabel();
    /**
     * <p>The label displayed in the badge. The label is centered, and ideally<br>should have very few characters.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    @JsProperty public native  void setLabel(String value);

    /**
     * <p>The id of the element that the badge is anchored to. This element<br>must be a sibling of the badge.</p>
     *
     * JavaScript Info:
     * @property for
     * @type String
     * 
     */
    @JsProperty public native  String getFor();
    /**
     * <p>The id of the element that the badge is anchored to. This element<br>must be a sibling of the badge.</p>
     *
     * JavaScript Info:
     * @property for
     * @type String
     * 
     */
    @JsProperty public native  void setFor(String value);


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
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinSplitLayout
     * 
     */
    public native void notifyResize();

    /**
     * <p>Repositions the badge relative to its anchor element. This is called<br>automatically when the badge is attached or an <code>iron-resize</code> event is<br>fired (for exmaple if the window has resized, or your target is a<br>custom element that implements IronResizableBehavior).</p>
     * <p>You should call this in all other cases when the achor’s position<br>might have changed (for example, if it’s visibility has changed, or<br>you’ve manually done a page re-layout).</p>
     *
     * JavaScript Info:
     * @method updatePosition
     * 
     * 
     */
    public native void updatePosition();

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
