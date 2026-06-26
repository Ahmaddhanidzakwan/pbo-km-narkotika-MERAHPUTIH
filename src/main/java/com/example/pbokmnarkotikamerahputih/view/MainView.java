
package com.example.pbokmnarkotikamerahputih.view;

import com.example.pbofinal.controller.KnowledgeController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
        import javafx.scene.layout.*;
        import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MainView extends Application {

    private KnowledgeController controller;
    private BorderPane contentArea;
    private DaftarPutusanView daftarView;
    private TambahPutusanView tambahView;
    private CariFilterView    cariView;
    private StatistikView     statView;


    private Button btnDashboard, btnDaftar, btnTambah, btnCari, btnStatistik;

    @Override
    public void start(Stage primaryStage) {
        controller = new KnowledgeController();

        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: #0B1622;");

        root.setTop(buildHeader());
        root.setLeft(buildSidebar());


        daftarView = new DaftarPutusanView(controller);
        tambahView = new TambahPutusanView(controller, daftarView);
        cariView   = new CariFilterView(controller);
        statView   = new StatistikView(controller);

        contentArea = new BorderPane();
        contentArea.setStyle("-fx-background-color: #0B1622;");
        tampilkanStatistik(); // halaman default saat start

        root.setCenter(contentArea);

        Scene scene = new Scene(root, 1300, 800);
        primaryStage.setTitle("KMS Putusan Pengadilan Narkotika");
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(1100);
        primaryStage.setMinHeight(700);
        primaryStage.show();
    }

