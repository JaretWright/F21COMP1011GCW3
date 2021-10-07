package com.example.f21comp1011gcw3;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CameraTableViewController {

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

}

