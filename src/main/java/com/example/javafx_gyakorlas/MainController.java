package com.example.javafx_gyakorlas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainController {

    @FXML
    private TableView<Termek> filmTable;
    @FXML
    private TableColumn<Termek, Integer> colSorszam;
    @FXML
    private TableColumn<Termek, String> colKodszam;
    @FXML
    private TableColumn<Termek, String> colNev;
    @FXML
    private TableColumn<Termek, Integer> colAr;
    @FXML
    private TableColumn<Termek, Integer> colMennyiseg;
    @FXML
    private TableColumn<Termek, String> colKepUrl;
    @FXML
    private TableColumn<Termek, String> colKategoria;

    @Deprecated
    protected void onHelloButtonClick() {

    }

    @FXML
    public void onHozzaadasButtonClick(ActionEvent actionEvent) {
    }

    @FXML
    public void onModositasButtonClick(ActionEvent actionEvent) {
    }

    @FXML
    public void onTorlesButtonClick(ActionEvent actionEvent) {
    }
}