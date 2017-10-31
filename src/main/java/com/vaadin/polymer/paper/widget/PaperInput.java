/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-input project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.paper.widget.event.ChangeEvent;
import com.vaadin.polymer.paper.widget.event.ChangeEventHandler;

import com.vaadin.polymer.iron.widget.event.IronFormElementRegisterEvent;
import com.vaadin.polymer.iron.widget.event.IronFormElementRegisterEventHandler;

import com.vaadin.polymer.iron.widget.event.IronFormElementUnregisterEvent;
import com.vaadin.polymer.iron.widget.event.IronFormElementUnregisterEventHandler;

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
 * <p>Material design: <a href="https://www.google.com/design/spec/components/text-fields.html">Text fields</a></p>
 * <p><code>&lt;paper-input&gt;</code> is a single-line text field with Material Design styling.</p>
 * <pre><code>&lt;paper-input label=&quot;Input label&quot;&gt;&lt;/paper-input&gt;
 * 
 * 
 * </code></pre><p>It may include an optional error message or character counter.</p>
 * <pre><code>&lt;paper-input error-message=&quot;Invalid input!&quot; label=&quot;Input label&quot;&gt;&lt;/paper-input&gt;
 * &lt;paper-input char-counter label=&quot;Input label&quot;&gt;&lt;/paper-input&gt;
 * 
 * 
 * </code></pre><p>It can also include custom prefix or suffix elements, which are displayed<br>before or after the text input itself. In order for an element to be<br>considered as a prefix, it must have the <code>prefix</code> attribute (and similarly<br>for <code>suffix</code>).</p>
 * <pre><code>&lt;paper-input label=&quot;total&quot;&gt;
 *   &lt;div prefix&gt;$&lt;/div&gt;
 *   &lt;paper-icon-button suffix icon=&quot;clear&quot;&gt;&lt;/paper-icon-button&gt;
 * &lt;/paper-input&gt;
 * 
 * 
 * </code></pre><p>A <code>paper-input</code> can use the native <code>type=search</code> or <code>type=file</code> features.<br>However, since we can’t control the native styling of the input (search icon,<br>file button, date placeholder, etc.), in these cases the label will be<br>automatically floated. The <code>placeholder</code> attribute can still be used for<br>additional informational text.</p>
 * <pre><code>&lt;paper-input label=&quot;search!&quot; type=&quot;search&quot;
 *     placeholder=&quot;search for cats&quot; autosave=&quot;test&quot; results=&quot;5&quot;&gt;
 * &lt;/paper-input&gt;
 * 
 * 
 * </code></pre><p>See <code>Polymer.PaperInputBehavior</code> for more API docs.</p>
 * <h3 id="focus">Focus</h3>
 * <p>To focus a paper-input, you can call the native <code>focus()</code> method as long as the<br>paper input has a tab index.</p>
 * <h3 id="styling">Styling</h3>
 * <p>See <code>Polymer.PaperInputContainer</code> for a list of custom properties used to<br>style this element.</p>
 */
public class PaperInput extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperInput() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperInput(String html) {
        super(PaperInputElement.TAG, PaperInputElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperInputElement getPolymerElement() {
        return Js.cast(getElement());
    }


    /**
     * <p>The maximum length of the input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>maxlength</code> property.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * 
     */
    public  double getMaxlength() {
        return getPolymerElement().getMaxlength();
    }
    /**
     * <p>The maximum length of the input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>maxlength</code> property.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * 
     */
    public  void setMaxlength(double value) {
        getPolymerElement().setMaxlength(value);
    }

    /**
     * <p>The minimum length of the input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
     *
     * JavaScript Info:
     * @property minlength
     * @type Number
     * 
     */
    public  double getMinlength() {
        return getPolymerElement().getMinlength();
    }
    /**
     * <p>The minimum length of the input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
     *
     * JavaScript Info:
     * @property minlength
     * @type Number
     * 
     */
    public  void setMinlength(double value) {
        getPolymerElement().setMinlength(value);
    }

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>results</code> property,<br>used with type=search.</p>
     *
     * JavaScript Info:
     * @property results
     * @type Number
     * 
     */
    public  double getResults() {
        return getPolymerElement().getResults();
    }
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>results</code> property,<br>used with type=search.</p>
     *
     * JavaScript Info:
     * @property results
     * @type Number
     * 
     */
    public  void setResults(double value) {
        getPolymerElement().setResults(value);
    }

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * @behavior PaperTextarea
     */
    public  double getSize() {
        return getPolymerElement().getSize();
    }
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * @behavior PaperTextarea
     */
    public  void setSize(double value) {
        getPolymerElement().setSize(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    public  JavaScriptObject getKeyBindings() {
        return getPolymerElement().getKeyBindings();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    public  void setKeyBindings(JavaScriptObject value) {
        getPolymerElement().setKeyBindings(value);
    }

    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type ?EventTarget
     * @behavior VaadinDatePicker
     */
    public  JavaScriptObject getKeyEventTarget() {
        return getPolymerElement().getKeyEventTarget();
    }
    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type ?EventTarget
     * @behavior VaadinDatePicker
     */
    public  void setKeyEventTarget(JavaScriptObject value) {
        getPolymerElement().setKeyEventTarget(value);
    }

    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public  boolean getFocused() {
        return getPolymerElement().getFocused();
    }
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public  void setFocused(boolean value) {
        getPolymerElement().setFocused(value);
    }

    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public  boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public  void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>Set to true to show a character counter.</p>
     *
     * JavaScript Info:
     * @property charCounter
     * @type Boolean
     * 
     */
    public  boolean getCharCounter() {
        return getPolymerElement().getCharCounter();
    }
    /**
     * <p>Set to true to show a character counter.</p>
     *
     * JavaScript Info:
     * @property charCounter
     * @type Boolean
     * 
     */
    public  void setCharCounter(boolean value) {
        getPolymerElement().setCharCounter(value);
    }

    /**
     * <p>Set to true to auto-validate the input value. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>autoValidate</code> property.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * @behavior PaperTextarea
     */
    public  boolean getAutoValidate() {
        return getPolymerElement().getAutoValidate();
    }
    /**
     * <p>Set to true to auto-validate the input value. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>autoValidate</code> property.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * @behavior PaperTextarea
     */
    public  void setAutoValidate(boolean value) {
        getPolymerElement().setAutoValidate(value);
    }

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the<code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>multiple</code> property,<br>used with type=file.</p>
     *
     * JavaScript Info:
     * @property multiple
     * @type Boolean
     * 
     */
    public  boolean getMultiple() {
        return getPolymerElement().getMultiple();
    }
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the<code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>multiple</code> property,<br>used with type=file.</p>
     *
     * JavaScript Info:
     * @property multiple
     * @type Boolean
     * 
     */
    public  void setMultiple(boolean value) {
        getPolymerElement().setMultiple(value);
    }

    /**
     * <p>Set to true to always float the label. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    public  boolean getAlwaysFloatLabel() {
        return getPolymerElement().getAlwaysFloatLabel();
    }
    /**
     * <p>Set to true to always float the label. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    public  void setAlwaysFloatLabel(boolean value) {
        getPolymerElement().setAlwaysFloatLabel(value);
    }

    /**
     * <p>Set to true to disable the floating label. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    public  boolean getNoLabelFloat() {
        return getPolymerElement().getNoLabelFloat();
    }
    /**
     * <p>Set to true to disable the floating label. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    public  void setNoLabelFloat(boolean value) {
        getPolymerElement().setNoLabelFloat(value);
    }

    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public  boolean getStopKeyboardEventPropagation() {
        return getPolymerElement().getStopKeyboardEventPropagation();
    }
    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public  void setStopKeyboardEventPropagation(boolean value) {
        getPolymerElement().setStopKeyboardEventPropagation(value);
    }

    /**
     * <p>Returns true if the value is invalid. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to both the<br><code>&lt;paper-input-container&gt;</code>‘s and the input’s <code>invalid</code> property.</p>
     * <p>If <code>autoValidate</code> is true, the <code>invalid</code> attribute is managed automatically,<br>which can clobber attempts to manage it manually.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    public  boolean getInvalid() {
        return getPolymerElement().getInvalid();
    }
    /**
     * <p>Returns true if the value is invalid. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to both the<br><code>&lt;paper-input-container&gt;</code>‘s and the input’s <code>invalid</code> property.</p>
     * <p>If <code>autoValidate</code> is true, the <code>invalid</code> attribute is managed automatically,<br>which can clobber attempts to manage it manually.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    public  void setInvalid(boolean value) {
        getPolymerElement().setInvalid(value);
    }

    /**
     * <p>Set to true to mark the input as required. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>required</code> property.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior PaperTextarea
     */
    public  boolean getRequired() {
        return getPolymerElement().getRequired();
    }
    /**
     * <p>Set to true to mark the input as required. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>required</code> property.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior PaperTextarea
     */
    public  void setRequired(boolean value) {
        getPolymerElement().setRequired(value);
    }

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>readonly</code> property.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * @behavior PaperTextarea
     */
    public  boolean getReadonly() {
        return getPolymerElement().getReadonly();
    }
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>readonly</code> property.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * @behavior PaperTextarea
     */
    public  void setReadonly(boolean value) {
        getPolymerElement().setReadonly(value);
    }

    /**
     * <p>Set to true to prevent the user from entering invalid input. If you’re<br>using PaperInputBehavior to  implement your own paper-input-like element,<br>bind this to <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>preventInvalidInput</code> property.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * 
     */
    public  boolean getPreventInvalidInput() {
        return getPolymerElement().getPreventInvalidInput();
    }
    /**
     * <p>Set to true to prevent the user from entering invalid input. If you’re<br>using PaperInputBehavior to  implement your own paper-input-like element,<br>bind this to <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>preventInvalidInput</code> property.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * 
     */
    public  void setPreventInvalidInput(boolean value) {
        getPolymerElement().setPreventInvalidInput(value);
    }

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autofocus</code> property.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * 
     */
    public  boolean getAutofocus() {
        return getPolymerElement().getAutofocus();
    }
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autofocus</code> property.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * 
     */
    public  void setAutofocus(boolean value) {
        getPolymerElement().setAutofocus(value);
    }

    /**
     * <p>Limits the numeric or date-time increments.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>step</code> property.</p>
     *
     * JavaScript Info:
     * @property step
     * @type String
     * @behavior PaperTextarea
     */
    public  String getStep() {
        return getPolymerElement().getStep();
    }
    /**
     * <p>Limits the numeric or date-time increments.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>step</code> property.</p>
     *
     * JavaScript Info:
     * @property step
     * @type String
     * @behavior PaperTextarea
     */
    public  void setStep(String value) {
        getPolymerElement().setStep(value);
    }

    /**
     * <p>The error message to display when the input is invalid. If you’re using<br>PaperInputBehavior to implement your own paper-input-like element,<br>bind this to the <code>&lt;paper-input-error&gt;</code>‘s content, if using.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * @behavior PaperTextarea
     */
    public  String getErrorMessage() {
        return getPolymerElement().getErrorMessage();
    }
    /**
     * <p>The error message to display when the input is invalid. If you’re using<br>PaperInputBehavior to implement your own paper-input-like element,<br>bind this to the <code>&lt;paper-input-error&gt;</code>‘s content, if using.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * @behavior PaperTextarea
     */
    public  void setErrorMessage(String value) {
        getPolymerElement().setErrorMessage(value);
    }

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>inputmode</code> property.</p>
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * @behavior PaperTextarea
     */
    public  String getInputmode() {
        return getPolymerElement().getInputmode();
    }
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>inputmode</code> property.</p>
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * @behavior PaperTextarea
     */
    public  void setInputmode(String value) {
        getPolymerElement().setInputmode(value);
    }

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autosave</code> property,<br>used with type=search.</p>
     *
     * JavaScript Info:
     * @property autosave
     * @type String
     * @behavior PaperTextarea
     */
    public  String getAutosave() {
        return getPolymerElement().getAutosave();
    }
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autosave</code> property,<br>used with type=search.</p>
     *
     * JavaScript Info:
     * @property autosave
     * @type String
     * @behavior PaperTextarea
     */
    public  void setAutosave(String value) {
        getPolymerElement().setAutosave(value);
    }

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocorrect</code> property.</p>
     *
     * JavaScript Info:
     * @property autocorrect
     * @type String
     * @behavior PaperTextarea
     */
    public  String getAutocorrect() {
        return getPolymerElement().getAutocorrect();
    }
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocorrect</code> property.</p>
     *
     * JavaScript Info:
     * @property autocorrect
     * @type String
     * @behavior PaperTextarea
     */
    public  void setAutocorrect(String value) {
        getPolymerElement().setAutocorrect(value);
    }

    /**
     * <p>The label for this input. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br><code>&lt;label&gt;</code>‘s content and <code>hidden</code> property, e.g.<br><code>&lt;label hidden$=&quot;[[!label]]&quot;&gt;[[label]]&lt;/label&gt;</code> in your <code>template</code></p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * @behavior PaperTextarea
     */
    public  String getLabel() {
        return getPolymerElement().getLabel();
    }
    /**
     * <p>The label for this input. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br><code>&lt;label&gt;</code>‘s content and <code>hidden</code> property, e.g.<br><code>&lt;label hidden$=&quot;[[!label]]&quot;&gt;[[label]]&lt;/label&gt;</code> in your <code>template</code></p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * @behavior PaperTextarea
     */
    public  void setLabel(String value) {
        getPolymerElement().setLabel(value);
    }

    /**
     * <p>The datalist of the input (if any). This should match the id of an existing <code>&lt;datalist&gt;</code>.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>list</code> property.</p>
     *
     * JavaScript Info:
     * @property list
     * @type String
     * @behavior PaperTextarea
     */
    public  String getList() {
        return getPolymerElement().getList();
    }
    /**
     * <p>The datalist of the input (if any). This should match the id of an existing <code>&lt;datalist&gt;</code>.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>list</code> property.</p>
     *
     * JavaScript Info:
     * @property list
     * @type String
     * @behavior PaperTextarea
     */
    public  void setList(String value) {
        getPolymerElement().setList(value);
    }

    /**
     * <p>The maximum (numeric or date-time) input value.<br>Can be a String (e.g. <code>&quot;2000-01-01&quot;</code>) or a Number (e.g. <code>2</code>).<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>max</code> property.</p>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * @behavior PaperTextarea
     */
    public  String getMax() {
        return getPolymerElement().getMax();
    }
    /**
     * <p>The maximum (numeric or date-time) input value.<br>Can be a String (e.g. <code>&quot;2000-01-01&quot;</code>) or a Number (e.g. <code>2</code>).<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>max</code> property.</p>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * @behavior PaperTextarea
     */
    public  void setMax(String value) {
        getPolymerElement().setMax(value);
    }

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocomplete</code> property.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * @behavior PaperTextarea
     */
    public  String getAutocomplete() {
        return getPolymerElement().getAutocomplete();
    }
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocomplete</code> property.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * @behavior PaperTextarea
     */
    public  void setAutocomplete(String value) {
        getPolymerElement().setAutocomplete(value);
    }

    /**
     * <p>The minimum (numeric or date-time) input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>min</code> property.</p>
     *
     * JavaScript Info:
     * @property min
     * @type String
     * @behavior PaperTextarea
     */
    public  String getMin() {
        return getPolymerElement().getMin();
    }
    /**
     * <p>The minimum (numeric or date-time) input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>min</code> property.</p>
     *
     * JavaScript Info:
     * @property min
     * @type String
     * @behavior PaperTextarea
     */
    public  void setMin(String value) {
        getPolymerElement().setMin(value);
    }

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocapitalize</code> property.</p>
     *
     * JavaScript Info:
     * @property autocapitalize
     * @type String
     * @behavior PaperTextarea
     */
    public  String getAutocapitalize() {
        return getPolymerElement().getAutocapitalize();
    }
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocapitalize</code> property.</p>
     *
     * JavaScript Info:
     * @property autocapitalize
     * @type String
     * @behavior PaperTextarea
     */
    public  void setAutocapitalize(String value) {
        getPolymerElement().setAutocapitalize(value);
    }

    /**
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>. If<br>you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>allowedPattern</code><br>property.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * 
     */
    public  String getAllowedPattern() {
        return getPolymerElement().getAllowedPattern();
    }
    /**
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>. If<br>you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>allowedPattern</code><br>property.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * 
     */
    public  void setAllowedPattern(String value) {
        getPolymerElement().setAllowedPattern(value);
    }

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>name</code> property.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior PaperTextarea
     */
    public  String getName() {
        return getPolymerElement().getName();
    }
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>name</code> property.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior PaperTextarea
     */
    public  void setName(String value) {
        getPolymerElement().setName(value);
    }

    /**
     * <p>A pattern to validate the <code>input</code> with. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>pattern</code> property.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * @behavior PaperTextarea
     */
    public  String getPattern() {
        return getPolymerElement().getPattern();
    }
    /**
     * <p>A pattern to validate the <code>input</code> with. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>pattern</code> property.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * @behavior PaperTextarea
     */
    public  void setPattern(String value) {
        getPolymerElement().setPattern(value);
    }

    /**
     * <p>A placeholder string in addition to the label. If this is set, the label will always float.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * @behavior PaperTextarea
     */
    public  String getPlaceholder() {
        return getPolymerElement().getPlaceholder();
    }
    /**
     * <p>A placeholder string in addition to the label. If this is set, the label will always float.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * @behavior PaperTextarea
     */
    public  void setPlaceholder(String value) {
        getPolymerElement().setPlaceholder(value);
    }

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>accept</code> property,<br>used with type=file.</p>
     *
     * JavaScript Info:
     * @property accept
     * @type String
     * @behavior PaperTextarea
     */
    public  String getAccept() {
        return getPolymerElement().getAccept();
    }
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>accept</code> property,<br>used with type=file.</p>
     *
     * JavaScript Info:
     * @property accept
     * @type String
     * @behavior PaperTextarea
     */
    public  void setAccept(String value) {
        getPolymerElement().setAccept(value);
    }

    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior VaadinDatePicker
     */
    public  String getValue() {
        return getPolymerElement().getValue();
    }
    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior VaadinDatePicker
     */
    public  void setValue(String value) {
        getPolymerElement().setValue(value);
    }

    /**
     * <p>Name of the validator to use. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>validator</code> property.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * 
     */
    public  String getValidator() {
        return getPolymerElement().getValidator();
    }
    /**
     * <p>Name of the validator to use. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>validator</code> property.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * 
     */
    public  void setValidator(String value) {
        getPolymerElement().setValidator(value);
    }

    /**
     * <p>The type of the input. The supported types are <code>text</code>, <code>number</code> and <code>password</code>.<br>If you’re using PaperInputBehavior to implement your own paper-input-like element,<br>bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>type</code> property.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * @behavior PaperTextarea
     */
    public  String getType() {
        return getPolymerElement().getType();
    }
    /**
     * <p>The type of the input. The supported types are <code>text</code>, <code>number</code> and <code>password</code>.<br>If you’re using PaperInputBehavior to implement your own paper-input-like element,<br>bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>type</code> property.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * @behavior PaperTextarea
     */
    public  void setType(String value) {
        getPolymerElement().setType(value);
    }


    // Needed in UIBinder
    /**
     * 
     *
     * JavaScript Info:
     * @attribute key-bindings
     * 
     */
    public void setKeyBindings(String value) {
        Polymer.property(this.getPolymerElement(), "keyBindings", value);
    }

    // Needed in UIBinder
    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @attribute key-event-target
     * @behavior VaadinDatePicker
     */
    public void setKeyEventTarget(String value) {
        Polymer.property(this.getPolymerElement(), "keyEventTarget", value);
    }

    // Needed in UIBinder
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>results</code> property,<br>used with type=search.</p>
     *
     * JavaScript Info:
     * @attribute results
     * 
     */
    public void setResults(String value) {
        Polymer.property(this.getPolymerElement(), "results", value);
    }

    // Needed in UIBinder
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
     *
     * JavaScript Info:
     * @attribute size
     * @behavior PaperTextarea
     */
    public void setSize(String value) {
        Polymer.property(this.getPolymerElement(), "size", value);
    }

    // Needed in UIBinder
    /**
     * <p>The minimum length of the input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
     *
     * JavaScript Info:
     * @attribute minlength
     * @behavior PaperTextarea
     */
    public void setMinlength(String value) {
        Polymer.property(this.getPolymerElement(), "minlength", value);
    }

    // Needed in UIBinder
    /**
     * <p>The maximum length of the input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>maxlength</code> property.</p>
     *
     * JavaScript Info:
     * @attribute maxlength
     * @behavior PaperTextarea
     */
    public void setMaxlength(String value) {
        Polymer.property(this.getPolymerElement(), "maxlength", value);
    }


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
    public void addOwnKeyBinding(Object eventString, Object handlerName) {
        getPolymerElement().addOwnKeyBinding(eventString, handlerName);
    }

    /**
     * <p>Validates the input element and sets an error style if needed.</p>
     *
     * JavaScript Info:
     * @method validate
     * @behavior PaperTextarea
     * @return {boolean}
     */
    public boolean validate() {
        return getPolymerElement().validate();
    }

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinDatePicker
     * 
     */
    public void removeOwnKeyBindings() {
        getPolymerElement().removeOwnKeyBindings();
    }

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
    public boolean keyboardEventMatchesKeys(JavaScriptObject event, String eventString) {
        return getPolymerElement().keyboardEventMatchesKeys(event, eventString);
    }

    /**
     * <p>Restores the cursor to its original position after updating the value.</p>
     *
     * JavaScript Info:
     * @method updateValueAndPreserveCaret
     * @param {string} newValue  
     * 
     * 
     */
    public void updateValueAndPreserveCaret(String newValue) {
        getPolymerElement().updateValueAndPreserveCaret(newValue);
    }


    /**
     * <p>Fired when the input changes due to user interaction.</p>
     *
     * JavaScript Info:
     * @event change
     */
    public HandlerRegistration addChangeHandler(ChangeEventHandler handler) {
        return addDomHandler(handler, ChangeEvent.TYPE);
    }

    /**
     * <p>Fired when the element is added to an <code>iron-form</code>.</p>
     *
     * JavaScript Info:
     * @event iron-form-element-register
     */
    public HandlerRegistration addIronFormElementRegisterHandler(IronFormElementRegisterEventHandler handler) {
        return addDomHandler(handler, IronFormElementRegisterEvent.TYPE);
    }

    /**
     * <p>Fired when the element is removed from an <code>iron-form</code>.</p>
     *
     * JavaScript Info:
     * @event iron-form-element-unregister
     */
    public HandlerRegistration addIronFormElementUnregisterHandler(IronFormElementUnregisterEventHandler handler) {
        return addDomHandler(handler, IronFormElementUnregisterEvent.TYPE);
    }

}
