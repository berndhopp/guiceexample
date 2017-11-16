package de.bhopp;

import com.somecompany.EnableCustomStartViewContent;
import com.somecompany.StartViewContentCustom;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.guice.annotation.GuiceUI;
import com.vaadin.guice.annotation.PackagesToScan;
import com.vaadin.guice.server.GuiceVaadinServlet;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

import javax.servlet.annotation.WebServlet;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
@GuiceUI(content = MyContent.class, viewContainer = MyViewContainer.class)
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    }

    @EnableCustomStartViewContent(StartViewContentCustom.class)
    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    @PackagesToScan("de.bhopp")
    public static class MyUIServlet extends GuiceVaadinServlet {
    }
}
