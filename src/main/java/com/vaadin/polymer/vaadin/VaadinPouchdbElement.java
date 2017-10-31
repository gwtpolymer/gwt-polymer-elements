/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-pouchdb project by Manolo Carrasco Moñino <manolo@apache.org>
 * that is licensed with Apache license.
 */
package com.vaadin.polymer.vaadin;

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
 * 
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class VaadinPouchdbElement extends PolymerElement {

    @JsOverlay public static final String TAG = "vaadin-pouchdb";
    @JsOverlay public static final String SRC = "vaadin-pouchdb/vaadin-pouchdb.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property data
     * @type Array
     * 
     */
    @JsProperty public native <E> Array<E> getData();
    /**
     * 
     *
     * JavaScript Info:
     * @property data
     * @type Array
     * 
     */
    @JsProperty public native <E> void setData(Array<E> value);

    /**
     * 
     *
     * JavaScript Info:
     * @property descending
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getDescending();
    /**
     * 
     *
     * JavaScript Info:
     * @property descending
     * @type Boolean
     * 
     */
    @JsProperty public native  void setDescending(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property noAutoChanges
     * @type boolean
     * 
     */
    @JsProperty public native  boolean getNoAutoChanges();
    /**
     * 
     *
     * JavaScript Info:
     * @property noAutoChanges
     * @type boolean
     * 
     */
    @JsProperty public native  void setNoAutoChanges(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property noAutoSave
     * @type boolean
     * 
     */
    @JsProperty public native  boolean getNoAutoSave();
    /**
     * 
     *
     * JavaScript Info:
     * @property noAutoSave
     * @type boolean
     * 
     */
    @JsProperty public native  void setNoAutoSave(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property attachments
     * @type Object
     * 
     */
    @JsProperty public native  JavaScriptObject getAttachments();
    /**
     * 
     *
     * JavaScript Info:
     * @property attachments
     * @type Object
     * 
     */
    @JsProperty public native  void setAttachments(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property liveSync
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getLiveSync();
    /**
     * 
     *
     * JavaScript Info:
     * @property liveSync
     * @type Boolean
     * 
     */
    @JsProperty public native  void setLiveSync(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property remote
     * @type string
     * 
     */
    @JsProperty public native  String getRemote();
    /**
     * 
     *
     * JavaScript Info:
     * @property remote
     * @type string
     * 
     */
    @JsProperty public native  void setRemote(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property queryString
     * @type String
     * 
     */
    @JsProperty public native  String getQueryString();
    /**
     * 
     *
     * JavaScript Info:
     * @property queryString
     * @type String
     * 
     */
    @JsProperty public native  void setQueryString(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property index
     * @type string
     * 
     */
    @JsProperty public native  String getIndex();
    /**
     * 
     *
     * JavaScript Info:
     * @property index
     * @type string
     * 
     */
    @JsProperty public native  void setIndex(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property status
     * @type String
     * 
     */
    @JsProperty public native  String getStatus();
    /**
     * 
     *
     * JavaScript Info:
     * @property status
     * @type String
     * 
     */
    @JsProperty public native  void setStatus(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property dbname
     * @type string
     * 
     */
    @JsProperty public native  String getDbname();
    /**
     * 
     *
     * JavaScript Info:
     * @property dbname
     * @type string
     * 
     */
    @JsProperty public native  void setDbname(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method getAttachment
     * @param {} docId  
     * @param {} attachmentName  
     * 
     * 
     */
    public native void getAttachment(Object docId, Object attachmentName);

    /**
     * <p>Get all docs matching the query string if provided,<br>otherwise we will use the default index defined as an attribute.</p>
     *
     * JavaScript Info:
     * @method query
     * @param {} query  
     * @param {} conf  
     * 
     * 
     */
    public native void query(Object query, Object conf);

    /**
     * 
     *
     * JavaScript Info:
     * @method createIndex
     * @param {} prop  
     * 
     * 
     */
    public native void createIndex(Object prop);

    /**
     * <p>Close the DB and remove local instance in case</p>
     *
     * JavaScript Info:
     * @method close
     * @param {Boolean} destroy  
     * 
     * 
     */
    public native void close(boolean destroy);

    /**
     * <p>Put</p>
     *
     * JavaScript Info:
     * @method put
     * @param {Object} obj  
     * 
     * @return {DbPromise}
     */
    public native DbPromise put(JavaScriptObject obj);

    /**
     * <p>allDocs</p>
     *
     * JavaScript Info:
     * @method allDocs
     * 
     * @return {DbPromise}
     */
    public native DbPromise allDocs();

    /**
     * <p>Cancel the synchronisation with remote process.</p>
     *
     * JavaScript Info:
     * @method cancelSync
     * 
     * 
     */
    public native void cancelSync();

    /**
     * <p>Cancel observing changes.</p>
     *
     * JavaScript Info:
     * @method cancelChanges
     * 
     * 
     */
    public native void cancelChanges();

    /**
     * <p>Sync</p>
     *
     * JavaScript Info:
     * @method sync
     * @param {Function} fnc  
     * @param {Function} err  
     * @param {} conf  
     * 
     * 
     */
    public native void sync(PolymerFunction fnc, PolymerFunction err, Object conf);

    /**
     * <p>Info</p>
     *
     * JavaScript Info:
     * @method info
     * @param {Object} info  
     * @param {Function} fnc  
     * @param {Function} err  
     * 
     * 
     */
    public native void info(JavaScriptObject info, PolymerFunction fnc, PolymerFunction err);

    /**
     * <p>Subscribe to changes</p>
     *
     * JavaScript Info:
     * @method changes
     * @param {Function} func  
     * @param {} conf  
     * 
     * 
     */
    public native void changes(PolymerFunction func, Object conf);

    /**
     * <p>Remove</p>
     *
     * JavaScript Info:
     * @method remove
     * @param {Object} obj  
     * 
     * @return {DbPromise}
     */
    public native DbPromise remove(JavaScriptObject obj);

    /**
     * <p>Post</p>
     *
     * JavaScript Info:
     * @method post
     * @param {Object} obj  
     * 
     * @return {DbPromise}
     */
    public native DbPromise post(JavaScriptObject obj);

    /**
     * <p>Save</p>
     *
     * JavaScript Info:
     * @method save
     * @param {Object} obj  
     * 
     * @return {DbPromise}
     */
    public native DbPromise save(JavaScriptObject obj);

}
