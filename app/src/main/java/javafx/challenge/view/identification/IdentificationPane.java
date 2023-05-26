package javafx.challenge.view.identification;

import javafx.challenge.view.components.MyLabel;
import javafx.challenge.view.components.MyTextField;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;

public class IdentificationPane extends GridPane {

    private final TextField firstNameField = new MyTextField();
    private final TextField lastNameField = new MyTextField();
    private final TextField emailField = new MyTextField();

    public IdentificationPane() {
        buildGUI();
    }

    private void buildGUI() {
        add(createForm(), 0, 0);
    }

    private Node createForm() {
        GridPane formGrid = new GridPane();
        formGrid.setHgap(10);
        formGrid.setVgap(10);
        formGrid.setPadding(new Insets(10, 10, 10, 10));

        int row = 0;

        formGrid.add(new MyLabel("First Name:"), 0, row);
        formGrid.add(firstNameField, 1, row);

        formGrid.add(new MyLabel("Last name:"), 0, ++row);
        formGrid.add(lastNameField, 1, row);

        formGrid.add(new MyLabel("Email:"), 0, ++row);
        formGrid.add(emailField, 1, row);

        TitledPane titledPane = new TitledPane("Personal Info", formGrid);

        titledPane.setCollapsible(false);

        return titledPane;
    }

}
