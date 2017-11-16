package de.bhopp;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.vaadin.guice.annotation.Controller;

@Controller(MyUI.class)
public class MyStartViewController {

    @Inject
    MyStartViewController(Provider<MyStartView> myStartViewProvider){

    }
}
