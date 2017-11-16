package de.bhopp;

import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.Label;

@UIScope
class StartViewContentDefault extends Label implements StartViewContent {

    StartViewContentDefault(){
        super("I am the default StartViewContent");
    }
}
