/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-date-picker project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget;

import com.vaadin.polymer.vaadin.*;

import com.vaadin.polymer.vaadin.widget.event.ValueChangedEvent;
import com.vaadin.polymer.vaadin.widget.event.ValueChangedEventHandler;

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
 * <p><code>&lt;vaadin-date-picker-light&gt;</code> is a customizable version of the <code>&lt;vaadin-date-picker&gt;</code> providing<br>only the scrollable month calendar view and leaving the input field definition to the user.</p>
 * <p>To create a custom input field, you need to add a child element which has a two-way<br>data-bindable property representing the input value. The property name is expected<br>to be <code>bindValue</code> by default. See the example below for a simplest possible example<br>using an <code>&lt;input&gt;</code> element extended with <code>iron-input</code>.</p>
 * <pre><code class="lang-html">&lt;vaadin-date-picker-light&gt;
 *   &lt;input is=&quot;iron-input&quot; /&gt;
 * &lt;/vaadin-date-picker-light&gt;
 * </code></pre>
 * <p>If you are using other custom input fields like <code>&lt;paper-input&gt;</code>, you<br>need to define the name of value property using the <code>attrForValue</code> property.</p>
 * <pre><code class="lang-html">&lt;vaadin-date-picker-light attr-for-value=&quot;value&quot;&gt;
 *   &lt;paper-input label=&quot;Birthday&quot;&gt;
 *   &lt;/paper-input&gt;
 * &lt;/vaadin-date-picker-light&gt;
 * </code></pre>
 */
public class VaadinDatePickerLight extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public VaadinDatePickerLight() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public VaadinDatePickerLight(String html) {
        super(VaadinDatePickerLightElement.TAG, VaadinDatePickerLightElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public VaadinDatePickerLightElement getPolymerElement() {
        return Js.cast(getElement());
    }


    /**
     * <p>Set true to open the date selector overlay.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    public  boolean getOpened() {
        return getPolymerElement().getOpened();
    }
    /**
     * <p>Set true to open the date selector overlay.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    public  void setOpened(boolean value) {
        getPolymerElement().setOpened(value);
    }

    /**
     * <p>Set true to display ISO-8601 week numbers in the calendar. Notice that<br>displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code><br>is 1 (Monday).</p>
     *
     * JavaScript Info:
     * @property showWeekNumbers
     * @type Boolean
     * 
     */
    public  boolean getShowWeekNumbers() {
        return getPolymerElement().getShowWeekNumbers();
    }
    /**
     * <p>Set true to display ISO-8601 week numbers in the calendar. Notice that<br>displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code><br>is 1 (Monday).</p>
     *
     * JavaScript Info:
     * @property showWeekNumbers
     * @type Boolean
     * 
     */
    public  void setShowWeekNumbers(boolean value) {
        getPolymerElement().setShowWeekNumbers(value);
    }

    /**
     * <p>Indicates whether this date picker has a value.</p>
     *
     * JavaScript Info:
     * @property hasValue
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public  boolean getHasValue() {
        return getPolymerElement().getHasValue();
    }
    /**
     * <p>Indicates whether this date picker has a value.</p>
     *
     * JavaScript Info:
     * @property hasValue
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public  void setHasValue(boolean value) {
        getPolymerElement().setHasValue(value);
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
     * <p>Set to true to mark the input as required. If used in a form, a<br>custom element that uses this behavior should also use<br>Polymer.IronValidatableBehavior and define a custom validation method.<br>Otherwise, a <code>required</code> element will always be considered valid.<br>It’s also strongly recommended to provide a visual style for the element<br>when its value is invalid.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public  boolean getRequired() {
        return getPolymerElement().getRequired();
    }
    /**
     * <p>Set to true to mark the input as required. If used in a form, a<br>custom element that uses this behavior should also use<br>Polymer.IronValidatableBehavior and define a custom validation method.<br>Otherwise, a <code>required</code> element will always be considered valid.<br>It’s also strongly recommended to provide a visual style for the element<br>when its value is invalid.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public  void setRequired(boolean value) {
        getPolymerElement().setRequired(value);
    }

    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public  boolean getInvalid() {
        return getPolymerElement().getInvalid();
    }
    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public  void setInvalid(boolean value) {
        getPolymerElement().setInvalid(value);
    }

    /**
     * <p>The object used to localize this component.<br>To change the default localization, replace the entire<br><em>i18n</em> object or just the property you want to modify.</p>
     * <p>The object has the following JSON structure and default values:</p>
     * <pre><code>{
     *   // An array with the full names of months starting
     *   // with January.
     *   monthNames: [
     *     &#39;January&#39;, &#39;February&#39;, &#39;March&#39;, &#39;April&#39;, &#39;May&#39;,
     *     &#39;June&#39;, &#39;July&#39;, &#39;August&#39;, &#39;September&#39;,
     *     &#39;October&#39;, &#39;November&#39;, &#39;December&#39;
     *   ],
     * 
     *   // An array of weekday names starting with Sunday. Used
     *   // in screen reader announcements.
     *   weekdays: [
     *     &#39;Sunday&#39;, &#39;Monday&#39;, &#39;Tuesday&#39;, &#39;Wednesday&#39;,
     *     &#39;Thursday&#39;, &#39;Friday&#39;, &#39;Saturday&#39;
     *   ],
     * 
     *   // An array of short weekday names starting with Sunday.
     *   // Displayed in the calendar.
     *   weekdaysShort: [
     *     &#39;Sun&#39;, &#39;Mon&#39;, &#39;Tue&#39;, &#39;Wed&#39;, &#39;Thu&#39;, &#39;Fri&#39;, &#39;Sat&#39;
     *   ],
     * 
     *   // An integer indicating the first day of the week
     *   // (0 = Sunday, 1 = Monday, etc.).
     *   firstDayOfWeek: 0,
     * 
     *   // Used in screen reader announcements along with week
     *   // numbers, if they are displayed.
     *   week: &#39;Week&#39;,
     * 
     *   // Translation of the Calendar icon button title.
     *   calendar: &#39;Calendar&#39;,
     * 
     *   // Translation of the Clear icon button title.
     *   clear: &#39;Clear&#39;,
     * 
     *   // Translation of the Today shortcut button text.
     *   today: &#39;Today&#39;,
     * 
     *   // Translation of the Cancel button text.
     *   cancel: &#39;Cancel&#39;,
     * 
     *   // A function to format given `Date` object as
     *   // date string.
     *   formatDate: function(d) {
     *     // returns a string representation of the given
     *     // Date object in &#39;MM/DD/YYYY&#39; -format
     *   },
     * 
     *   // A function to parse the given text to a `Date`
     *   // object. Must properly parse (at least) text
     *   // formatted by `formatDate`.
     *   // Setting the property to null will disable
     *   // keyboard input feature.
     *   parseDate: function(text) {
     *     // Parses a string in &#39;MM/DD/YY&#39;, &#39;MM/DD&#39; or &#39;DD&#39; -format to
     *     // a Date object
     *   }
     * 
     *   // A function to format given `monthName` and
     *   // `fullYear` integer as calendar title string.
     *   formatTitle: function(monthName, fullYear) {
     *     return monthName + &#39; &#39; + fullYear;
     *   }
     * 
     * }
     * 
     * 
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    public  JavaScriptObject getI18n() {
        return getPolymerElement().getI18n();
    }
    /**
     * <p>The object used to localize this component.<br>To change the default localization, replace the entire<br><em>i18n</em> object or just the property you want to modify.</p>
     * <p>The object has the following JSON structure and default values:</p>
     * <pre><code>{
     *   // An array with the full names of months starting
     *   // with January.
     *   monthNames: [
     *     &#39;January&#39;, &#39;February&#39;, &#39;March&#39;, &#39;April&#39;, &#39;May&#39;,
     *     &#39;June&#39;, &#39;July&#39;, &#39;August&#39;, &#39;September&#39;,
     *     &#39;October&#39;, &#39;November&#39;, &#39;December&#39;
     *   ],
     * 
     *   // An array of weekday names starting with Sunday. Used
     *   // in screen reader announcements.
     *   weekdays: [
     *     &#39;Sunday&#39;, &#39;Monday&#39;, &#39;Tuesday&#39;, &#39;Wednesday&#39;,
     *     &#39;Thursday&#39;, &#39;Friday&#39;, &#39;Saturday&#39;
     *   ],
     * 
     *   // An array of short weekday names starting with Sunday.
     *   // Displayed in the calendar.
     *   weekdaysShort: [
     *     &#39;Sun&#39;, &#39;Mon&#39;, &#39;Tue&#39;, &#39;Wed&#39;, &#39;Thu&#39;, &#39;Fri&#39;, &#39;Sat&#39;
     *   ],
     * 
     *   // An integer indicating the first day of the week
     *   // (0 = Sunday, 1 = Monday, etc.).
     *   firstDayOfWeek: 0,
     * 
     *   // Used in screen reader announcements along with week
     *   // numbers, if they are displayed.
     *   week: &#39;Week&#39;,
     * 
     *   // Translation of the Calendar icon button title.
     *   calendar: &#39;Calendar&#39;,
     * 
     *   // Translation of the Clear icon button title.
     *   clear: &#39;Clear&#39;,
     * 
     *   // Translation of the Today shortcut button text.
     *   today: &#39;Today&#39;,
     * 
     *   // Translation of the Cancel button text.
     *   cancel: &#39;Cancel&#39;,
     * 
     *   // A function to format given `Date` object as
     *   // date string.
     *   formatDate: function(d) {
     *     // returns a string representation of the given
     *     // Date object in &#39;MM/DD/YYYY&#39; -format
     *   },
     * 
     *   // A function to parse the given text to a `Date`
     *   // object. Must properly parse (at least) text
     *   // formatted by `formatDate`.
     *   // Setting the property to null will disable
     *   // keyboard input feature.
     *   parseDate: function(text) {
     *     // Parses a string in &#39;MM/DD/YY&#39;, &#39;MM/DD&#39; or &#39;DD&#39; -format to
     *     // a Date object
     *   }
     * 
     *   // A function to format given `monthName` and
     *   // `fullYear` integer as calendar title string.
     *   formatTitle: function(monthName, fullYear) {
     *     return monthName + &#39; &#39; + fullYear;
     *   }
     * 
     * }
     * 
     * 
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    public  void setI18n(JavaScriptObject value) {
        getPolymerElement().setI18n(value);
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
     * <p>To be used to express what combination of keys  will trigger the relative<br>callback. e.g. <code>keyBindings: { &#39;esc&#39;: &#39;_onEscPressed&#39;}</code></p>
     *
     * JavaScript Info:
     * @property keyBindings
     * @type !Object
     * @behavior VaadinDatePicker
     */
    public  JavaScriptObject getKeyBindings() {
        return getPolymerElement().getKeyBindings();
    }
    /**
     * <p>To be used to express what combination of keys  will trigger the relative<br>callback. e.g. <code>keyBindings: { &#39;esc&#39;: &#39;_onEscPressed&#39;}</code></p>
     *
     * JavaScript Info:
     * @property keyBindings
     * @type !Object
     * @behavior VaadinDatePicker
     */
    public  void setKeyBindings(JavaScriptObject value) {
        getPolymerElement().setKeyBindings(value);
    }

    /**
     * <p>Namespace for this validator. This property is deprecated and should<br>not be used. For all intents and purposes, please consider it a<br>read-only, config-time property.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior VaadinDatePicker
     */
    public  String getValidatorType() {
        return getPolymerElement().getValidatorType();
    }
    /**
     * <p>Namespace for this validator. This property is deprecated and should<br>not be used. For all intents and purposes, please consider it a<br>read-only, config-time property.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior VaadinDatePicker
     */
    public  void setValidatorType(String value) {
        getPolymerElement().setValidatorType(value);
    }

    /**
     * <p>Name of the two-way data-bindable property representing the<br>value of the custom input field.</p>
     *
     * JavaScript Info:
     * @property attrForValue
     * @type String
     * 
     */
    public  String getAttrForValue() {
        return getPolymerElement().getAttrForValue();
    }
    /**
     * <p>Name of the two-way data-bindable property representing the<br>value of the custom input field.</p>
     *
     * JavaScript Info:
     * @property attrForValue
     * @type String
     * 
     */
    public  void setAttrForValue(String value) {
        getPolymerElement().setAttrForValue(value);
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
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior VaadinDatePicker
     */
    public  String getName() {
        return getPolymerElement().getName();
    }
    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior VaadinDatePicker
     */
    public  void setName(String value) {
        getPolymerElement().setName(value);
    }

    /**
     * <p>The earliest date that can be selected. All earlier dates will be disabled.</p>
     * <p>Supported date formats:</p>
     * <ul>
     * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
     * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
     * </ul>
     *
     * JavaScript Info:
     * @property min
     * @type String
     * @behavior VaadinDatePicker
     */
    public  String getMin() {
        return getPolymerElement().getMin();
    }
    /**
     * <p>The earliest date that can be selected. All earlier dates will be disabled.</p>
     * <p>Supported date formats:</p>
     * <ul>
     * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
     * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
     * </ul>
     *
     * JavaScript Info:
     * @property min
     * @type String
     * @behavior VaadinDatePicker
     */
    public  void setMin(String value) {
        getPolymerElement().setMin(value);
    }

    /**
     * <p>The latest date that can be selected. All later dates will be disabled.</p>
     * <p>Supported date formats:</p>
     * <ul>
     * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
     * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
     * </ul>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * @behavior VaadinDatePicker
     */
    public  String getMax() {
        return getPolymerElement().getMax();
    }
    /**
     * <p>The latest date that can be selected. All later dates will be disabled.</p>
     * <p>Supported date formats:</p>
     * <ul>
     * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
     * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
     * </ul>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * @behavior VaadinDatePicker
     */
    public  void setMax(String value) {
        getPolymerElement().setMax(value);
    }

    /**
     * <p>The label for this element.</p>
     *
     * JavaScript Info:
     * @property label
     * @type string
     * @behavior VaadinDatePicker
     */
    public  String getLabel() {
        return getPolymerElement().getLabel();
    }
    /**
     * <p>The label for this element.</p>
     *
     * JavaScript Info:
     * @property label
     * @type string
     * @behavior VaadinDatePicker
     */
    public  void setLabel(String value) {
        getPolymerElement().setLabel(value);
    }

    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior VaadinDatePicker
     */
    public  String getValidator() {
        return getPolymerElement().getValidator();
    }
    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior VaadinDatePicker
     */
    public  void setValidator(String value) {
        getPolymerElement().setValidator(value);
    }

    /**
     * <p>Date which should be visible when there is no value selected.</p>
     * <p>The same date formats as for the <code>value</code> property are supported.</p>
     *
     * JavaScript Info:
     * @property initialPosition
     * @type string
     * @behavior VaadinDatePicker
     */
    public  String getInitialPosition() {
        return getPolymerElement().getInitialPosition();
    }
    /**
     * <p>Date which should be visible when there is no value selected.</p>
     * <p>The same date formats as for the <code>value</code> property are supported.</p>
     *
     * JavaScript Info:
     * @property initialPosition
     * @type string
     * @behavior VaadinDatePicker
     */
    public  void setInitialPosition(String value) {
        getPolymerElement().setInitialPosition(value);
    }


    // Needed in UIBinder
    /**
     * <p>The object used to localize this component.<br>To change the default localization, replace the entire<br><em>i18n</em> object or just the property you want to modify.</p>
     * <p>The object has the following JSON structure and default values:</p>
     * <pre><code>{
     *   // An array with the full names of months starting
     *   // with January.
     *   monthNames: [
     *     &#39;January&#39;, &#39;February&#39;, &#39;March&#39;, &#39;April&#39;, &#39;May&#39;,
     *     &#39;June&#39;, &#39;July&#39;, &#39;August&#39;, &#39;September&#39;,
     *     &#39;October&#39;, &#39;November&#39;, &#39;December&#39;
     *   ],
     * 
     *   // An array of weekday names starting with Sunday. Used
     *   // in screen reader announcements.
     *   weekdays: [
     *     &#39;Sunday&#39;, &#39;Monday&#39;, &#39;Tuesday&#39;, &#39;Wednesday&#39;,
     *     &#39;Thursday&#39;, &#39;Friday&#39;, &#39;Saturday&#39;
     *   ],
     * 
     *   // An array of short weekday names starting with Sunday.
     *   // Displayed in the calendar.
     *   weekdaysShort: [
     *     &#39;Sun&#39;, &#39;Mon&#39;, &#39;Tue&#39;, &#39;Wed&#39;, &#39;Thu&#39;, &#39;Fri&#39;, &#39;Sat&#39;
     *   ],
     * 
     *   // An integer indicating the first day of the week
     *   // (0 = Sunday, 1 = Monday, etc.).
     *   firstDayOfWeek: 0,
     * 
     *   // Used in screen reader announcements along with week
     *   // numbers, if they are displayed.
     *   week: &#39;Week&#39;,
     * 
     *   // Translation of the Calendar icon button title.
     *   calendar: &#39;Calendar&#39;,
     * 
     *   // Translation of the Clear icon button title.
     *   clear: &#39;Clear&#39;,
     * 
     *   // Translation of the Today shortcut button text.
     *   today: &#39;Today&#39;,
     * 
     *   // Translation of the Cancel button text.
     *   cancel: &#39;Cancel&#39;,
     * 
     *   // A function to format given `Date` object as
     *   // date string.
     *   formatDate: function(d) {
     *     // returns a string representation of the given
     *     // Date object in &#39;MM/DD/YYYY&#39; -format
     *   },
     * 
     *   // A function to parse the given text to a `Date`
     *   // object. Must properly parse (at least) text
     *   // formatted by `formatDate`.
     *   // Setting the property to null will disable
     *   // keyboard input feature.
     *   parseDate: function(text) {
     *     // Parses a string in &#39;MM/DD/YY&#39;, &#39;MM/DD&#39; or &#39;DD&#39; -format to
     *     // a Date object
     *   }
     * 
     *   // A function to format given `monthName` and
     *   // `fullYear` integer as calendar title string.
     *   formatTitle: function(monthName, fullYear) {
     *     return monthName + &#39; &#39; + fullYear;
     *   }
     * 
     * }
     * 
     * 
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @attribute i18n
     * 
     */
    public void setI18n(String value) {
        Polymer.property(this.getPolymerElement(), "i18n", value);
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
     * <p>To be used to express what combination of keys  will trigger the relative<br>callback. e.g. <code>keyBindings: { &#39;esc&#39;: &#39;_onEscPressed&#39;}</code></p>
     *
     * JavaScript Info:
     * @attribute key-bindings
     * @behavior VaadinDatePicker
     */
    public void setKeyBindings(String value) {
        Polymer.property(this.getPolymerElement(), "keyBindings", value);
    }


    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior VaadinSplitLayout
     * 
     */
    public void stopResizeNotificationsFor(Object target) {
        getPolymerElement().stopResizeNotificationsFor(target);
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
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior VaadinSplitLayout
     * 
     */
    public void assignParentResizable(Object parentResizable) {
        getPolymerElement().assignParentResizable(parentResizable);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method hasValidator
     * @behavior VaadinDatePicker
     * @return {boolean}
     */
    public boolean hasValidator() {
        return getPolymerElement().hasValidator();
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
     * <p>Opens the dropdown.</p>
     *
     * JavaScript Info:
     * @method open
     * @behavior VaadinDatePicker
     * 
     */
    public void open() {
        getPolymerElement().open();
    }

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinSplitLayout
     * 
     */
    public void notifyResize() {
        getPolymerElement().notifyResize();
    }

    /**
     * <p>Closes the dropdown.</p>
     *
     * JavaScript Info:
     * @method close
     * 
     * 
     */
    public void close() {
        getPolymerElement().close();
    }

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior VaadinSplitLayout
     * @return {boolean}
     */
    public boolean resizerShouldNotify(HTMLElement element) {
        return getPolymerElement().resizerShouldNotify(element);
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
     * <p>Returns true if the <code>value</code> is valid, and updates <code>invalid</code>. If you want<br>your element to have custom validation logic, do not override this method;<br>override <code>_getValidity(value)</code> instead.</p>
     *
     * JavaScript Info:
     * @method validate
     * @param {Object} value  
     * @behavior VaadinDatePicker
     * @return {boolean}
     */
    public boolean validate(JavaScriptObject value) {
        return getPolymerElement().validate(value);
    }


    /**
     * <p>Fired when the value changes.</p>
     *
     * JavaScript Info:
     * @event value-changed
     */
    public HandlerRegistration addValueChangedHandler(ValueChangedEventHandler handler) {
        return addDomHandler(handler, ValueChangedEvent.TYPE);
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
