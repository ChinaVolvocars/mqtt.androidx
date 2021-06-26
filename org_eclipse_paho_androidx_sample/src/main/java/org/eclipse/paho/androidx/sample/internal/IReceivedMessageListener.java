package org.eclipse.paho.androidx.sample.internal;


import org.eclipse.paho.androidx.sample.model.ReceivedMessage;

public interface IReceivedMessageListener {

    void onMessageReceived(ReceivedMessage message);
}