/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class request_dropped_alert extends peer_alert {
  private long swigCPtr;

  protected request_dropped_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.request_dropped_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(request_dropped_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_request_dropped_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public request_dropped_alert(torrent_handle h, tcp_endpoint ep, sha1_hash peer_id, int block_num, int piece_num) {
    this(libtorrent_jni.new_request_dropped_alert(torrent_handle.getCPtr(h), h, tcp_endpoint.getCPtr(ep), ep, sha1_hash.getCPtr(peer_id), peer_id, block_num, piece_num), true);
  }

  public int type() {
    return libtorrent_jni.request_dropped_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.request_dropped_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.request_dropped_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.request_dropped_alert_message(swigCPtr, this);
  }

  public void setBlock_index(int value) {
    libtorrent_jni.request_dropped_alert_block_index_set(swigCPtr, this, value);
  }

  public int getBlock_index() {
    return libtorrent_jni.request_dropped_alert_block_index_get(swigCPtr, this);
  }

  public void setPiece_index(int value) {
    libtorrent_jni.request_dropped_alert_piece_index_set(swigCPtr, this, value);
  }

  public int getPiece_index() {
    return libtorrent_jni.request_dropped_alert_piece_index_get(swigCPtr, this);
  }

  public final static int alert_type = libtorrent_jni.request_dropped_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.request_dropped_alert_static_category_get();
}