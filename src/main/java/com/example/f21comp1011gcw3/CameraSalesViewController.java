package com.example.f21comp1011gcw3;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class CameraSalesViewController implements Initializable {

    @FXML
    private BarChart<String, Integer> barChart;

    @FXML
    private CategoryAxis cameraAxis;

    @FXML
    private NumberAxis salesAxis;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //normally this information would come from a DB and we would loop over
        //it to create these data points
        XYChart.Series<String, Integer> sales = new XYChart.Series<>();
        sales.getData().add(new XYChart.Data<>("Camera 1", 67));
        sales.getData().add(new XYChart.Data<>("Camera 2", 102));
        sales.getData().add(new XYChart.Data<>("Camera 3", 38));
        sales.getData().add(new XYChart.Data<>("Camera 4", 97));
        sales.getData().add(new XYChart.Data<>("Camera 5", 55));
        sales.getData().add(new XYChart.Data<>("Camera 6", 250));

        barChart.getData().addAll(sales);
        barChart.setLegendVisible(false);

        cameraAxis.setLabel("Camera Brands");
        salesAxis.setLabel("Number of units sold");
    }
}
