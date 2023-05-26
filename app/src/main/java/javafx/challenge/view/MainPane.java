package javafx.challenge.view;

import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;

public class MainPane extends GridPane {

    private static final Insets PADDING = new Insets(30, 30, 30, 30);

    public MainPane() {
        setPadding(PADDING);
    }

}
