package de.bhopp;

import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(StartViewContent.class).to(StartViewContentDefault.class);
    }
}
