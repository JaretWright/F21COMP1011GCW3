package com.example.f21comp1011gcw3;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class CreateCameraViewController implements Initializable {

    @FXML
    private ComboBox<String> makeComboBox;

    @FXML
    private TextField modelTextField;

    @FXML
    private Spinner<Integer> mpSpinner;

    @FXML
    private Slider priceSlider;

    @FXML
    private Label priceLabel;

    @FXML
    private CheckBox digitalCheckBox;

    @FXML
    private CheckBox mirrorlessCheckBox;

    @FXML
    private Label msgLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        List<String> cameraBrands = Arrays.asList("Canon","Nikon","Sony");
        makeComboBox.getItems().addAll(Arrays.asList("Canon","Nikon","Sony"));

        //configure the price slider
        priceSlider.setMin(300);
        priceSlider.setMax(3000);
        priceSlider.setValue(500);
        priceLabel.setText(String.format("$%.2f", priceSlider.getValue()));

        //making an inner class and referring to it
//        priceSlider.valueProperty().addListener(new PriceChangeListener2());

        //creating an anonymous inner class
//        priceSlider.valueProperty().addListener(new ChangeListener<Number>() {
//            @Override
//            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
//                priceLabel.setText(String.format("$%.2f", newValue));
//            }
//        });

        //using a Lamdba expression
        priceSlider.valueProperty().addListener((observableValue, oldValue, newValue) -> {
            priceLabel.setText(String.format("$%.2f", newValue));
        });


    }

    @FXML
    private void submitButton()
    {
        try {
            String make = this.makeComboBox.getSelectionModel().getSelectedItem();
            String model = this.modelTextField.getText();
            ArrayList<String> lenses = new ArrayList<>();
            lenses.addAll(Arrays.asList("70-200 F2.8", "15-50 F1.8", "100-400 F4.5"));
            int mp = 34;
//            double price = Double.parseDouble(this.priceTextField.getText());
            boolean digital = this.digitalCheckBox.isSelected();
            boolean mirrorless = this.mirrorlessCheckBox.isSelected();

//            com.example.f21comp1011gcw3.Camera camera = new com.example.f21comp1011gcw3.Camera(make, model,lenses,mp, price, digital, mirrorless);
//            msgLabel.setText("Created camera: " +camera);
        }catch (Exception e)
        {
            this.msgLabel.setText(e.getMessage());
        }

    }

    public class PriceChangeListener2 implements ChangeListener {
        @Override
        public void changed(ObservableValue observableValue, Object oldValue, Object newValue) {
            priceLabel.setText(String.format("$%.2f", newValue));
        }
    }
}
