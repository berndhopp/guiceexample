package de.bhopp;

import com.google.inject.Inject;
import com.vaadin.guice.annotation.NavigableViewClasses;
import com.vaadin.guice.annotation.UIScope;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;

import java.util.Map;

@UIScope
public class Header extends HorizontalLayout {

    @Inject
    Header(@NavigableViewClasses Map<String, Class<? extends View>> viewClasses) {
        setWidth("100%");

        for (String uiFragment : viewClasses.keySet()) {
            Button navigationButton = new Button(
                    "navigate to " + uiFragment,
                    e -> UI.getCurrent().getNavigator().navigateTo(uiFragment)
            );

            addComponent(navigationButton);
        }
    }
}
