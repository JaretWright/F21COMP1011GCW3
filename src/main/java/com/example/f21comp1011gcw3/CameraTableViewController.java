package com.example.f21comp1011gcw3;

import Utilities.DBUtility;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class CameraTableViewController implements Initializable {

    @FXML
    private TableView<Camera> tableView;

    @FXML
    private TableColumn<Camera, Integer> idColumn;

    @FXML
    private TableColumn<Camera, String> makeColumn;

    @FXML
    private TableColumn<Camera, String> modelColumn;

    @FXML
    private TableColumn<Camera, Double> mpColumn;

    @FXML
    private TableColumn<Camera, Double> priceColumn;

    @FXML
    private TableColumn<Camera, Integer> unitsSoldColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //configure the table columns to get the correct information from the model class (Camera)
        idColumn.setCellValueFactory(new PropertyValueFactory<>("cameraId"));
        makeColumn.setCellValueFactory(new PropertyValueFactory<>("make"));
        modelColumn.setCellValueFactory(new PropertyValueFactory<>("model"));
        mpColumn.setCellValueFactory(new PropertyValueFactory<>("megaPixels"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        unitsSoldColumn.setCellValueFactory(new PropertyValueFactory<>("unitsSold"));

        tableView.getItems().addAll(DBUtility.getCameraDetails());
        System.out.println(tableView.getItems());
    }
}

