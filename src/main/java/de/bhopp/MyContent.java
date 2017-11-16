package de.bhopp;

import com.google.inject.Inject;
import com.vaadin.guice.annotation.UIScope;
import com.vaadin.ui.*;

@UIScope
public class MyContent extends Composite {

    @Inject
    MyContent(Header header, MyViewContainer myViewContainer){
        final VerticalLayout layout = new VerticalLayout(header, myViewContainer);

        layout.setExpandRatio(myViewContainer, 1);

        setCompositionRoot(layout);
    }
}
