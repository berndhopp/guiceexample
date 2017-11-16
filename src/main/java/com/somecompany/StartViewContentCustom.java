package com.somecompany;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.Label;
import de.bhopp.StartViewContent;

@UIScope
public class StartViewContentCustom extends Label implements StartViewContent {

    StartViewContentCustom(){
        super("I am the custom StartViewContent");
    }
}
