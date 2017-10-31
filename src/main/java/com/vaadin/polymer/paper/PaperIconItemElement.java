/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-item project by The Polymer Authors
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
 * <p><code>&lt;paper-icon-item&gt;</code> is a convenience element to make an item with icon. It is an interactive list<br>item with a fixed-width icon area, according to Material Design. This is useful if the icons are of<br>varying widths, but you want the item bodies to line up. Use this like a <code>&lt;paper-item&gt;</code>. The child<br>node with the slot name <code>item-icon</code> is placed in the icon area.</p>
 * <pre><code>&lt;paper-icon-item&gt;
 *   &lt;iron-icon icon=&quot;favorite&quot; slot=&quot;item-icon&quot;&gt;&lt;/iron-icon&gt;
 *   Favorite
 * &lt;/paper-icon-item&gt;
 * &lt;paper-icon-item&gt;
 *   &lt;div class=&quot;avatar&quot; slot=&quot;item-icon&quot;&gt;&lt;/div&gt;
 *   Avatar
 * &lt;/paper-icon-item&gt;
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
 * <td><code>--paper-item-icon-width</code></td>
 * <td>Width of the icon area</td>
 * <td><code>56px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-icon</code></td>
 * <td>Mixin applied to the icon area</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-icon-item</code></td>
 * <td>Mixin applied to the item</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-selected-weight</code></td>
 * <td>The font weight of a selected item</td>
 * <td><code>bold</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-selected</code></td>
 * <td>Mixin applied to selected paper-items</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-disabled-color</code></td>
 * <td>The color for disabled paper-items</td>
 * <td><code>--disabled-text-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-disabled</code></td>
 * <td>Mixin applied to disabled paper-items</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-focused</code></td>
 * <td>Mixin applied to focused paper-items</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-focused-before</code></td>
 * <td>Mixin applied to :before focused paper-items</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class PaperIconItemElement extends PolymerElement {

    @JsOverlay public static final String TAG = "paper-icon-item";
    @JsOverlay public static final String SRC = "paper-item/all-imports.html";


    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type ?EventTarget
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  JavaScriptObject getKeyEventTarget();
    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type ?EventTarget
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  void setKeyEventTarget(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty public native  JavaScriptObject getKeyBindings();
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty public native  void setKeyBindings(JavaScriptObject value);

    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  boolean getFocused();
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  void setFocused(boolean value);

    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  boolean getPointerDown();
    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  void setPointerDown(boolean value);

    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  boolean getPressed();
    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  void setPressed(boolean value);

    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  boolean getReceivedFocusFromKeyboard();
    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  void setReceivedFocusFromKeyboard(boolean value);

    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  boolean getStopKeyboardEventPropagation();
    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  void setStopKeyboardEventPropagation(boolean value);

    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  boolean getToggles();
    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  void setToggles(boolean value);

    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  boolean getActive();
    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  void setActive(boolean value);

    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  boolean getDisabled();
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty public native  void setDisabled(boolean value);

    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    @JsProperty public native  String getAriaActiveAttribute();
    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    @JsProperty public native  void setAriaActiveAttribute(String value);


    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior VaadinDatePicker
     * 
     */
    public native void addOwnKeyBinding(Object eventString, Object handlerName);

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinDatePicker
     * 
     */
    public native void removeOwnKeyBindings();

    /**
     * <p>Returns true if a keyboard event matches <code>eventString</code>.</p>
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {KeyboardEvent} event  
     * @param {string} eventString  
     * @behavior VaadinDatePicker
     * @return {boolean}
     */
    public native boolean keyboardEventMatchesKeys(JavaScriptObject event, String eventString);

}
