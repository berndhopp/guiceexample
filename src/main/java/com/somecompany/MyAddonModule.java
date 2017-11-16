package com.somecompany;

import com.google.inject.AbstractModule;
import com.vaadin.guice.annotation.OverrideBindings;
import de.bhopp.StartViewContent;

@OverrideBindings
public class MyAddonModule extends AbstractModule {

    private final Class<? extends StartViewContent> implementationClass;

    MyAddonModule(EnableCustomStartViewContent annotation){
        this.implementationClass = annotation.value();
    }

    @Override
    protected void configure() {
        bind(StartViewContent.class).to(implementationClass);
    }
}
