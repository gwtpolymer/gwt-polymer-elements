/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-swipeable-container project by The Polymer Authors
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
 * <p><code>&lt;iron-swipeable-container&gt;</code> is a container that allows any of its nested<br>children (native or custom elements) to be swiped away. By default it supports<br>a curved or horizontal transition, but the transition duration and properties<br>can be customized.</p>
 * <p>Example:</p>
 * <pre><code>&lt;iron-swipeable-container&gt;
 *   &lt;div&gt;I can be swiped&lt;/div&gt;
 *   &lt;paper-card heading=&quot;Me too!&quot;&gt;&lt;/paper-card&gt;
 * &lt;/iron-swipeable-container&gt;
 * 
 * 
 * </code></pre><p>To disable swiping on individual children, you must give them the <code>.disable-swipe</code><br>class. Alternatively, to disable swiping on the whole container, you can use its<br><code>disable-swipe</code> attribute:</p>
 * <pre><code>&lt;iron-swipeable-container&gt;
 *   &lt;div class=&quot;disable-swipe&quot;&gt;I cannot be swiped be swiped&lt;/div&gt;
 *   &lt;paper-card heading=&quot;But I can!&quot;&gt;&lt;/paper-card&gt;
 * &lt;/iron-swipeable-container&gt;
 * 
 * &lt;iron-swipeable-container disable-swipe&gt;
 *   &lt;div&gt;I cannot be swiped&lt;/div&gt;
 *   &lt;paper-card heading=&quot;Me neither :(&quot;&gt;&lt;/paper-card&gt;
 * &lt;/iron-swipeable-container&gt;
 * 
 * 
 * </code></pre><p>It is a good idea to disable text selection on any of the children that you<br>want to be swiped:</p>
 * <pre><code>.swipe {
 *   -moz-user-select: none;
 *   -ms-user-select: none;
 *   -webkit-user-select: none;
 *   user-select: none;
 *   cursor: default;
 * }
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class IronSwipeableContainerElement extends PolymerElement {

    @JsOverlay public static final String TAG = "iron-swipeable-container";
    @JsOverlay public static final String SRC = "iron-swipeable-container/iron-swipeable-container.html";


    /**
     * <p>If true, then the container will not allow swiping.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getDisabled();
    /**
     * <p>If true, then the container will not allow swiping.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty public native  void setDisabled(boolean value);

    /**
     * <p>The ratio of the total animation distance after which the opacity<br>transformation begins. For example, if the <code>widthRatio</code> is 1 and<br>the <code>opacityRate</code> is 0.5, then the element needs to travel half its<br>width before its opacity starts decreasing.</p>
     *
     * JavaScript Info:
     * @property opacityRate
     * @type Number
     * 
     */
    @JsProperty public native  double getOpacityRate();
    /**
     * <p>The ratio of the total animation distance after which the opacity<br>transformation begins. For example, if the <code>widthRatio</code> is 1 and<br>the <code>opacityRate</code> is 0.5, then the element needs to travel half its<br>width before its opacity starts decreasing.</p>
     *
     * JavaScript Info:
     * @property opacityRate
     * @type Number
     * 
     */
    @JsProperty public native  void setOpacityRate(double value);

    /**
     * <p>The ratio of the width of the element that the translation animation<br>should happen over. For example, if the <code>widthRatio</code> is 3, the<br>animation will take place on a distance 3 times the width of the<br>element being swiped.</p>
     *
     * JavaScript Info:
     * @property widthRatio
     * @type Number
     * 
     */
    @JsProperty public native  double getWidthRatio();
    /**
     * <p>The ratio of the width of the element that the translation animation<br>should happen over. For example, if the <code>widthRatio</code> is 3, the<br>animation will take place on a distance 3 times the width of the<br>element being swiped.</p>
     *
     * JavaScript Info:
     * @property widthRatio
     * @type Number
     * 
     */
    @JsProperty public native  void setWidthRatio(double value);

    /**
     * <p>The style in which to swipe the card. Currently supported<br>options are <code>curve | horizontal</code>. If left unspecified, the default<br>is assumed to be <code>horizontal</code>.</p>
     *
     * JavaScript Info:
     * @property swipeStyle
     * @type String
     * 
     */
    @JsProperty public native  String getSwipeStyle();
    /**
     * <p>The style in which to swipe the card. Currently supported<br>options are <code>curve | horizontal</code>. If left unspecified, the default<br>is assumed to be <code>horizontal</code>.</p>
     *
     * JavaScript Info:
     * @property swipeStyle
     * @type String
     * 
     */
    @JsProperty public native  void setSwipeStyle(String value);

    /**
     * <p>The CSS transition applied while swiping.</p>
     *
     * JavaScript Info:
     * @property transition
     * @type String
     * 
     */
    @JsProperty public native  String getTransition();
    /**
     * <p>The CSS transition applied while swiping.</p>
     *
     * JavaScript Info:
     * @property transition
     * @type String
     * 
     */
    @JsProperty public native  void setTransition(String value);


}
