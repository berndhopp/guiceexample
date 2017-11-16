package com.somecompany;

import com.vaadin.guice.annotation.Import;
import de.bhopp.StartViewContent;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Import(MyAddonModule.class)
public @interface EnableCustomStartViewContent {
    Class<? extends StartViewContent> value();
}
