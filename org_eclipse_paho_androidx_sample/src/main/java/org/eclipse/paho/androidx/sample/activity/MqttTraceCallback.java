/*******************************************************************************
 * Copyright (c) 1999, 2014 IBM Corp.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution. 
 *
 * The Eclipse Public License is available at 
 *    http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 *   http://www.eclipse.org/org/documents/edl-v10.php.
 */
package org.eclipse.paho.androidx.sample.activity;

import android.util.Log;

import org.eclipse.paho.androidx.service.MqttTraceHandler;


class MqttTraceCallback implements MqttTraceHandler {

    public void traceDebug(String arg0, String arg1) {
        Log.i(arg0, arg1);
    }

    public void traceError(String arg0, String arg1) {
        Log.e(arg0, arg1);
    }

    public void traceException(String arg0, String arg1,
                               Exception arg2) {
        Log.e(arg0, arg1, arg2);
    }

}
