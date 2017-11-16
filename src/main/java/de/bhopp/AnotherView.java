package de.bhopp;

import com.vaadin.guice.annotation.GuiceView;
import com.vaadin.navigator.View;
import com.vaadin.ui.Label;

@GuiceView("another-view")
public class AnotherView extends Label implements View{
    AnotherView(){
        super("I am another view");
    }
}
