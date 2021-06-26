package org.eclipse.paho.androidx.sample.model;


import org.eclipse.paho.androidx.sample.activity.Connection;

public class NavDrawerItem {
    private boolean showNotify;
    private String title;
    private String handle;

    public NavDrawerItem(Connection connection) {
        this.title = connection.getId();
        this.handle = connection.handle();
    }

    public String getTitle() {
        return title;
    }

    public String getHandle() {
        return handle;
    }

}