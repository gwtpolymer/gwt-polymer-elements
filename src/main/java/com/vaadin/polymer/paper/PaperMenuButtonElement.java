/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu-button project by The Polymer Authors
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
 * <p>Material design: <a href="https://www.google.com/design/spec/components/buttons.html#buttons-dropdown-buttons">Dropdown buttons</a></p>
 * <p><code>paper-menu-button</code> allows one to compose a designated “trigger” element with<br>another element that represents “content”, to create a dropdown menu that<br>displays the “content” when the “trigger” is clicked.</p>
 * <p>The child element assigned to the <code>dropdown-trigger</code> slot will be used as the<br>“trigger” element. The child element assigned to the <code>dropdown-content</code> slot will be<br>used as the “content” element.</p>
 * <p>The <code>paper-menu-button</code> is sensitive to its content’s <code>iron-select</code> events. If<br>the “content” element triggers an <code>iron-select</code> event, the <code>paper-menu-button</code><br>will close automatically.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-menu-button&gt;
 *   &lt;paper-icon-button icon=&quot;menu&quot; slot=&quot;dropdown-trigger&quot;&gt;&lt;/paper-icon-button&gt;
 *   &lt;paper-listbox slot=&quot;dropdown-content&quot;&gt;
 *     &lt;paper-item&gt;Share&lt;/paper-item&gt;
 *     &lt;paper-item&gt;Settings&lt;/paper-item&gt;
 *     &lt;paper-item&gt;Help&lt;/paper-item&gt;
 *   &lt;/paper-listbox&gt;
 * &lt;/paper-menu-button&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are also available for styling:</p>
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
 * <td><code>--paper-menu-button-dropdown-background</code></td>
 * <td>Background color of the paper-menu-button dropdown</td>
 * <td><code>--primary-background-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-menu-button</code></td>
 * <td>Mixin applied to the paper-menu-button</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-menu-button-disabled</code></td>
 * <td>Mixin applied to the paper-menu-button when disabled</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-menu-button-dropdown</code></td>
 * <td>Mixin applied to the paper-menu-button dropdown</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-menu-button-content</code></td>
 * <td>Mixin applied to the paper-menu-button content</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class PaperMenuButtonElement extends PolymerElement {

    @JsOverlay public static final String TAG = "paper-menu-button";
    @JsOverlay public static final String SRC = "paper-menu-button/paper-menu-button.html";


    /**
     * <p>By default, the dropdown will constrain scrolling on the page<br>to itself when opened.<br>Set to true in order to prevent scroll from being constrained<br>to the dropdown when it opens.</p>
     *
     * JavaScript Info:
     * @property allowOutsideScroll
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getAllowOutsideScroll();
    /**
     * <p>By default, the dropdown will constrain scrolling on the page<br>to itself when opened.<br>Set to true in order to prevent scroll from being constrained<br>to the dropdown when it opens.</p>
     *
     * JavaScript Info:
     * @property allowOutsideScroll
     * @type Boolean
     * 
     */
    @JsProperty public native  void setAllowOutsideScroll(boolean value);

    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>. Use a negative value to offset to the<br>left, or a positive value to offset to the right.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * 
     */
    @JsProperty public native  double getHorizontalOffset();
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>. Use a negative value to offset to the<br>left, or a positive value to offset to the right.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * 
     */
    @JsProperty public native  void setHorizontalOffset(double value);

    /**
     * <p>An animation config. If provided, this will be used to animate the<br>opening of the dropdown.</p>
     *
     * JavaScript Info:
     * @property openAnimationConfig
     * @type Object
     * 
     */
    @JsProperty public native  JavaScriptObject getOpenAnimationConfig();
    /**
     * <p>An animation config. If provided, this will be used to animate the<br>opening of the dropdown.</p>
     *
     * JavaScript Info:
     * @property openAnimationConfig
     * @type Object
     * 
     */
    @JsProperty public native  void setOpenAnimationConfig(JavaScriptObject value);

    /**
     * <p>An animation config. If provided, this will be used to animate the<br>closing of the dropdown.</p>
     *
     * JavaScript Info:
     * @property closeAnimationConfig
     * @type Object
     * 
     */
    @JsProperty public native  JavaScriptObject getCloseAnimationConfig();
    /**
     * <p>An animation config. If provided, this will be used to animate the<br>closing of the dropdown.</p>
     *
     * JavaScript Info:
     * @property closeAnimationConfig
     * @type Object
     * 
     */
    @JsProperty public native  void setCloseAnimationConfig(JavaScriptObject value);

    /**
     * <p>To be used to express what combination of keys  will trigger the relative<br>callback. e.g. <code>keyBindings: { &#39;esc&#39;: &#39;_onEscPressed&#39;}</code></p>
     *
     * JavaScript Info:
     * @property keyBindings
     * @type !Object
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  JavaScriptObject getKeyBindings();
    /**
     * <p>To be used to express what combination of keys  will trigger the relative<br>callback. e.g. <code>keyBindings: { &#39;esc&#39;: &#39;_onEscPressed&#39;}</code></p>
     *
     * JavaScript Info:
     * @property keyBindings
     * @type !Object
     * @behavior VaadinDatePicker
     */
    @JsProperty public native  void setKeyBindings(JavaScriptObject value);

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
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>. Use a negative value to offset towards the<br>top, or a positive value to offset towards the bottom.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    @JsProperty public native  double getVerticalOffset();
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>. Use a negative value to offset towards the<br>top, or a positive value to offset towards the bottom.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    @JsProperty public native  void setVerticalOffset(double value);

    /**
     * <p>Set to true to disable automatically closing the dropdown after<br>a selection has been made.</p>
     *
     * JavaScript Info:
     * @property ignoreSelect
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getIgnoreSelect();
    /**
     * <p>Set to true to disable automatically closing the dropdown after<br>a selection has been made.</p>
     *
     * JavaScript Info:
     * @property ignoreSelect
     * @type Boolean
     * 
     */
    @JsProperty public native  void setIgnoreSelect(boolean value);

    /**
     * <p>Set to true to disable animations when opening and closing the<br>dropdown.</p>
     *
     * JavaScript Info:
     * @property noAnimations
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getNoAnimations();
    /**
     * <p>Set to true to disable animations when opening and closing the<br>dropdown.</p>
     *
     * JavaScript Info:
     * @property noAnimations
     * @type Boolean
     * 
     */
    @JsProperty public native  void setNoAnimations(boolean value);

    /**
     * <p>If true, the dropdown will be positioned so that it doesn’t overlap<br>the button.</p>
     *
     * JavaScript Info:
     * @property noOverlap
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getNoOverlap();
    /**
     * <p>If true, the dropdown will be positioned so that it doesn’t overlap<br>the button.</p>
     *
     * JavaScript Info:
     * @property noOverlap
     * @type Boolean
     * 
     */
    @JsProperty public native  void setNoOverlap(boolean value);

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
     * <p>If true, the <code>horizontalAlign</code> and <code>verticalAlign</code> properties will<br>be considered preferences instead of strict requirements when<br>positioning the dropdown and may be changed if doing so reduces<br>the area of the dropdown falling outside of <code>fitInto</code>.</p>
     *
     * JavaScript Info:
     * @property dynamicAlign
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getDynamicAlign();
    /**
     * <p>If true, the <code>horizontalAlign</code> and <code>verticalAlign</code> properties will<br>be considered preferences instead of strict requirements when<br>positioning the dropdown and may be changed if doing so reduces<br>the area of the dropdown falling outside of <code>fitInto</code>.</p>
     *
     * JavaScript Info:
     * @property dynamicAlign
     * @type Boolean
     * 
     */
    @JsProperty public native  void setDynamicAlign(boolean value);

    /**
     * <p>True if the content is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getOpened();
    /**
     * <p>True if the content is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty public native  void setOpened(boolean value);

    /**
     * <p>Whether focus should be restored to the button when the menu closes.</p>
     *
     * JavaScript Info:
     * @property restoreFocusOnClose
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getRestoreFocusOnClose();
    /**
     * <p>Whether focus should be restored to the button when the menu closes.</p>
     *
     * JavaScript Info:
     * @property restoreFocusOnClose
     * @type Boolean
     * 
     */
    @JsProperty public native  void setRestoreFocusOnClose(boolean value);

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
     * <p>Set to true to enable automatically closing the dropdown after an<br>item has been activated, even if the selection did not change.</p>
     *
     * JavaScript Info:
     * @property closeOnActivate
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getCloseOnActivate();
    /**
     * <p>Set to true to enable automatically closing the dropdown after an<br>item has been activated, even if the selection did not change.</p>
     *
     * JavaScript Info:
     * @property closeOnActivate
     * @type Boolean
     * 
     */
    @JsProperty public native  void setCloseOnActivate(boolean value);

    /**
     * <p>The orientation against which to align the menu dropdown<br>vertically relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * 
     */
    @JsProperty public native  String getVerticalAlign();
    /**
     * <p>The orientation against which to align the menu dropdown<br>vertically relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * 
     */
    @JsProperty public native  void setVerticalAlign(String value);

    /**
     * <p>The orientation against which to align the menu dropdown<br>horizontally relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    @JsProperty public native  String getHorizontalAlign();
    /**
     * <p>The orientation against which to align the menu dropdown<br>horizontally relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    @JsProperty public native  void setHorizontalAlign(String value);


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
     * <p>Make the dropdown content appear as an overlay positioned relative<br>to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @method open
     * 
     * 
     */
    public native void open();

    /**
     * <p>Hide the dropdown content.</p>
     *
     * JavaScript Info:
     * @method close
     * 
     * 
     */
    public native void close();

    /**
     * <p>Toggles the drowpdown content between opened and closed.</p>
     *
     * JavaScript Info:
     * @method toggle
     * 
     * 
     */
    public native void toggle();

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
