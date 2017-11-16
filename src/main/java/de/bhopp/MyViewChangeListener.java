package de.bhopp;

import com.vaadin.navigator.ViewChangeListener;

import java.util.logging.Logger;

public class MyViewChangeListener implements ViewChangeListener {
    @Override
    public boolean beforeViewChange(ViewChangeEvent viewChangeEvent) {

        Logger.getAnonymousLogger().info("changing view to " + viewChangeEvent.getViewName());

        return true;
    }
}
