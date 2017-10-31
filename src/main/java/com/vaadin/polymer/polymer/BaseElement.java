/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.polymer;

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
 * <p><code>Polymer.Base</code> acts as a base prototype for all Polymer elements. It is composed via various calls to <code>Polymer.Base._addFeature()</code>.</p>
 * <p>The properties reflected here are the combined view of all features found in this library. There may be more properties added via other libraries, as well.</p>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class BaseElement extends PolymerElement {

    @JsOverlay public static final String TAG = "Polymer.Base";
    @JsOverlay public static final String SRC = "polymer/polymer.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property behaviors
     * @type Array
     * 
     */
    @JsProperty public native <E> Array<E> getBehaviors();
    /**
     * 
     *
     * JavaScript Info:
     * @property behaviors
     * @type Array
     * 
     */
    @JsProperty public native <E> void setBehaviors(Array<E> value);

    /**
     * 
     *
     * JavaScript Info:
     * @property customStyle
     * @type object
     * 
     */
    @JsProperty public native  JavaScriptObject getCustomStyle();
    /**
     * 
     *
     * JavaScript Info:
     * @property customStyle
     * @type object
     * 
     */
    @JsProperty public native  void setCustomStyle(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty public native  JavaScriptObject getListeners();
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty public native  void setListeners(JavaScriptObject value);


    /**
     * 
     *
     * JavaScript Info:
     * @method cancelDebouncer
     * @param {} jobName  
     * 
     * 
     */
    public native void cancelDebouncer(Object jobName);

    /**
     * 
     *
     * JavaScript Info:
     * @method getComputedStyleValue
     * @param {} property  
     * 
     * 
     */
    public native void getComputedStyleValue(Object property);

    /**
     * 
     *
     * JavaScript Info:
     * @method transform
     * @param {} transform  
     * @param {} node  
     * 
     * 
     */
    public native void transform(Object transform, Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method toggleClass
     * @param {} name  
     * @param {} bool  
     * @param {} node  
     * 
     * 
     */
    public native void toggleClass(Object name, Object bool, Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method get
     * @param {} path  
     * @param {} root  
     * 
     * 
     */
    public native void get(Object path, Object root);

    /**
     * 
     *
     * JavaScript Info:
     * @method fire
     * @param {} type  
     * @param {} detail  
     * @param {} options  
     * 
     * 
     */
    public native void fire(Object type, Object detail, Object options);

    /**
     * 
     *
     * JavaScript Info:
     * @method getPropertyInfo
     * @param {} property  
     * 
     * 
     */
    public native void getPropertyInfo(Object property);

    /**
     * 
     *
     * JavaScript Info:
     * @method importHref
     * @param {} href  
     * @param {} onload  
     * @param {} onerror  
     * @param {} optAsync  
     * 
     * 
     */
    public native void importHref(Object href, Object onload, Object onerror, Object optAsync);

    /**
     * 
     *
     * JavaScript Info:
     * @method instanceTemplate
     * @param {} template  
     * 
     * 
     */
    public native void instanceTemplate(Object template);

    /**
     * 
     *
     * JavaScript Info:
     * @method splice
     * @param {} path  
     * @param {} start  
     * 
     * 
     */
    public native void splice(Object path, Object start);

    /**
     * 
     *
     * JavaScript Info:
     * @method classFollows
     * @param {} name  
     * @param {} toElement  
     * @param {} fromElement  
     * 
     * 
     */
    public native void classFollows(Object name, Object toElement, Object fromElement);

    /**
     * 
     *
     * JavaScript Info:
     * @method isLocalDescendant
     * @param {} node  
     * 
     * 
     */
    public native void isLocalDescendant(Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method isLightDescendant
     * @param {} node  
     * 
     * 
     */
    public native void isLightDescendant(Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method elementMatches
     * @param {} selector  
     * @param {} node  
     * 
     * 
     */
    public native void elementMatches(Object selector, Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method linkPaths
     * @param {} to  
     * @param {} from  
     * 
     * 
     */
    public native void linkPaths(Object to, Object from);

    /**
     * 
     *
     * JavaScript Info:
     * @method translate3d
     * @param {} x  
     * @param {} y  
     * @param {} z  
     * @param {} node  
     * 
     * 
     */
    public native void translate3d(Object x, Object y, Object z, Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method listen
     * @param {} node  
     * @param {} eventName  
     * @param {} methodName  
     * 
     * 
     */
    public native void listen(Object node, Object eventName, Object methodName);

    /**
     * 
     *
     * JavaScript Info:
     * @method distributeContent
     * @param {} updateInsertionPoints  
     * 
     * 
     */
    public native void distributeContent(Object updateInsertionPoints);

    /**
     * 
     *
     * JavaScript Info:
     * @method notifyPath
     * @param {} path  
     * @param {} value  
     * @param {} fromAbove  
     * 
     * 
     */
    public native void notifyPath(Object path, Object value, Object fromAbove);

    /**
     * 
     *
     * JavaScript Info:
     * @method deserialize
     * @param {} value  
     * @param {} type  
     * 
     * 
     */
    public native void deserialize(Object value, Object type);

    /**
     * 
     *
     * JavaScript Info:
     * @method notifySplices
     * @param {} path  
     * @param {} splices  
     * 
     * 
     */
    public native void notifySplices(Object path, Object splices);

    /**
     * 
     *
     * JavaScript Info:
     * @method debounce
     * @param {} jobName  
     * @param {} callback  
     * @param {} wait  
     * 
     * 
     */
    public native void debounce(Object jobName, Object callback, Object wait);

    /**
     * 
     *
     * JavaScript Info:
     * @method prepareModelNotifyPath
     * @param {} model  
     * 
     * 
     */
    public native void prepareModelNotifyPath(Object model);

    /**
     * 
     *
     * JavaScript Info:
     * @method async
     * @param {} callback  
     * @param {} waitTime  
     * 
     * 
     */
    public native void async(Object callback, Object waitTime);

    /**
     * 
     *
     * JavaScript Info:
     * @method push
     * @param {} path  
     * 
     * 
     */
    public native void push(Object path);

    /**
     * 
     *
     * JavaScript Info:
     * @method unlinkPaths
     * @param {} path  
     * 
     * 
     */
    public native void unlinkPaths(Object path);

    /**
     * 
     *
     * JavaScript Info:
     * @method pop
     * @param {} path  
     * 
     * 
     */
    public native void pop(Object path);

    /**
     * 
     *
     * JavaScript Info:
     * @method shift
     * @param {} path  
     * 
     * 
     */
    public native void shift(Object path);

    /**
     * 
     *
     * JavaScript Info:
     * @method create
     * @param {} tag  
     * @param {} props  
     * 
     * 
     */
    public native void create(Object tag, Object props);

    /**
     * 
     *
     * JavaScript Info:
     * @method queryEffectiveChildren
     * @param {} slctr  
     * 
     * 
     */
    public native void queryEffectiveChildren(Object slctr);

    /**
     * 
     *
     * JavaScript Info:
     * @method getContentChildNodes
     * @param {} slctr  
     * 
     * 
     */
    public native void getContentChildNodes(Object slctr);

    /**
     * 
     *
     * JavaScript Info:
     * @method getContentChildren
     * @param {} slctr  
     * 
     * 
     */
    public native void getContentChildren(Object slctr);

    /**
     * 
     *
     * JavaScript Info:
     * @method queryAllEffectiveChildren
     * @param {} slctr  
     * 
     * 
     */
    public native void queryAllEffectiveChildren(Object slctr);

    /**
     * 
     *
     * JavaScript Info:
     * @method attributeFollows
     * @param {} name  
     * @param {} toElement  
     * @param {} fromElement  
     * 
     * 
     */
    public native void attributeFollows(Object name, Object toElement, Object fromElement);

    /**
     * 
     *
     * JavaScript Info:
     * @method isDebouncerActive
     * @param {} jobName  
     * 
     * 
     */
    public native void isDebouncerActive(Object jobName);

    /**
     * 
     *
     * JavaScript Info:
     * @method flushDebouncer
     * @param {} jobName  
     * 
     * 
     */
    public native void flushDebouncer(Object jobName);

    /**
     * 
     *
     * JavaScript Info:
     * @method reflectPropertyToAttribute
     * @param {} property  
     * @param {} attribute  
     * @param {} value  
     * 
     * 
     */
    public native void reflectPropertyToAttribute(Object property, Object attribute, Object value);

    /**
     * 
     *
     * JavaScript Info:
     * @method resolveUrl
     * @param {} url  
     * 
     * 
     */
    public native void resolveUrl(Object url);

    /**
     * 
     *
     * JavaScript Info:
     * @method cancelAsync
     * @param {} handle  
     * 
     * 
     */
    public native void cancelAsync(Object handle);

    /**
     * 
     *
     * JavaScript Info:
     * @method scopeSubtree
     * @param {} container  
     * @param {} shouldObserve  
     * 
     * 
     */
    public native void scopeSubtree(Object container, Object shouldObserve);

    /**
     * 
     *
     * JavaScript Info:
     * @method $$
     * @param {} slctr  
     * 
     * 
     */
    public native void $$(Object slctr);

    /**
     * 
     *
     * JavaScript Info:
     * @method serialize
     * @param {} value  
     * 
     * 
     */
    public native void serialize(Object value);

    /**
     * 
     *
     * JavaScript Info:
     * @method toggleAttribute
     * @param {} name  
     * @param {} bool  
     * @param {} node  
     * 
     * 
     */
    public native void toggleAttribute(Object name, Object bool, Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method serializeValueToAttribute
     * @param {} value  
     * @param {} attribute  
     * @param {} node  
     * 
     * 
     */
    public native void serializeValueToAttribute(Object value, Object attribute, Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method unlisten
     * @param {} node  
     * @param {} eventName  
     * @param {} methodName  
     * 
     * 
     */
    public native void unlisten(Object node, Object eventName, Object methodName);

    /**
     * 
     *
     * JavaScript Info:
     * @method set
     * @param {} path  
     * @param {} value  
     * @param {} root  
     * 
     * 
     */
    public native void set(Object path, Object value, Object root);

    /**
     * 
     *
     * JavaScript Info:
     * @method unshift
     * @param {} path  
     * 
     * 
     */
    public native void unshift(Object path);

    /**
     * 
     *
     * JavaScript Info:
     * @method setScrollDirection
     * @param {} direction  
     * @param {} node  
     * 
     * 
     */
    public native void setScrollDirection(Object direction, Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method getNativePrototype
     * @param {} tag  
     * 
     * 
     */
    public native void getNativePrototype(Object tag);

    /**
     * 
     *
     * JavaScript Info:
     * @method updateStyles
     * @param {} properties  
     * 
     * 
     */
    public native void updateStyles(Object properties);

    /**
     * 
     *
     * JavaScript Info:
     * @method arrayDelete
     * @param {} path  
     * @param {} item  
     * 
     * 
     */
    public native void arrayDelete(Object path, Object item);

    /**
     * 
     *
     * JavaScript Info:
     * @method attachedCallback
     * 
     * 
     */
    public native void attachedCallback();

    /**
     * 
     *
     * JavaScript Info:
     * @method getEffectiveTextContent
     * 
     * 
     */
    public native void getEffectiveTextContent();

    /**
     * 
     *
     * JavaScript Info:
     * @method getEffectiveChildren
     * 
     * 
     */
    public native void getEffectiveChildren();

    /**
     * 
     *
     * JavaScript Info:
     * @method getEffectiveChildNodes
     * 
     * 
     */
    public native void getEffectiveChildNodes();

    /**
     * 
     *
     * JavaScript Info:
     * @method distributeContent
     * 
     * 
     */
    public native void distributeContent();

    /**
     * 
     *
     * JavaScript Info:
     * @method detachedCallback
     * 
     * 
     */
    public native void detachedCallback();

}
