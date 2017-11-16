package de.bhopp;

import com.google.inject.Inject;
import com.vaadin.guice.annotation.GuiceView;
import com.vaadin.navigator.View;
import com.vaadin.ui.Panel;

@GuiceView("")
public class MyStartView extends Panel implements View {

    @Inject
    MyStartView(StartViewContent startViewContent){
        super(startViewContent);
    }
}
