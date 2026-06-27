package com.example.pbokmnarkotikamerahputih;

import com.example.pbokmnarkotikamerahputih.controller.KnowledgeController;
import com.example.pbokmnarkotikamerahputih.model.Putusan;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.List;


public class DaftarPutusanView {

    private final KnowledgeController controller;
    private final BorderPane root;
    private TableView<PutusanRow> table;
    private Label labelTotal;

    public DaftarPutusanView(KnowledgeController controller) {
        this.controller = controller;
        this.root = new BorderPane();
        root.setStyle("-fx-background-color: #0B1622;");
        build();
        refresh();
    }

    public BorderPane getRoot() { return root; }

    private void build() {
        HBox toolbar = new HBox(10);
        toolbar.setAlignment(Pos.CENTER_LEFT);
        toolbar.setPadding(new Insets(20, 24, 16, 24));
        toolbar.setStyle("-fx-background-color: #0B1622;");

        Label judul = new Label("Daftar Putusan");
        judul.setFont(Font.font("System", FontWeight.BOLD, 18));
        judul.setStyle("-fx-text-fill: #E8F4FD;");

        labelTotal = new Label("Total: 0 putusan");
        labelTotal.setStyle("-fx-text-fill: #5B7B95; -fx-font-size: 12px; -fx-padding: 0 0 0 12;");

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        Button btnRefresh = buatButton("Refresh", "#16273A", "#4FD1C5");
        Button btnHapus   = buatButton("Hapus Terpilih", "#2A1418", "#E05A5A");

        toolbar.getChildren().addAll(judul, labelTotal, spacer, btnRefresh, btnHapus);

        table = new TableView<>();
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        table.setStyle("-fx-background-color: #0F1D2B; -fx-control-inner-background: #0F1D2B;");
        table.setPlaceholder(new Label("Belum ada data putusan."));

        table.getColumns().addAll(
                kolom("No. Perkara",   "nomorPerkara",  170),
                kolom("Terdakwa",      "namaTerdakwa",  170),
                kolom("Pengadilan",    "pengadilan",    150),
                kolom("Narkotika",     "jenisNarkotika", 100),
                kolom("Peran",         "peranTerdakwa",  95),
                kolom("Pasal",         "pasalDilanggar", 170),
                kolom("Vonis (bln)",   "vonisHukuman",   80),
                kolom("Denda",         "vonisDenda",     110),
                kolom("Tanggal",       "tanggalPutusan", 100)
        );

        VBox detailPanel = buildDetailPanel();

        table.getSelectionModel().selectedItemProperty().addListener(
                (obs, old, row) -> {
                    if (row != null) tampilkanDetail(row.getPutusan(), detailPanel);
                }
        );

        btnRefresh.setOnAction(e -> refresh());
        btnHapus.setOnAction(e -> {
            PutusanRow selected = table.getSelectionModel().getSelectedItem();
            if (selected == null) {
                showAlert(Alert.AlertType.WARNING, "Pilih dulu baris yang akan dihapus.");
                return;
            }
            Alert konfirm = new Alert(Alert.AlertType.CONFIRMATION,
                    "Hapus putusan: " + selected.getNomorPerkara() + "?",
                    ButtonType.YES, ButtonType.NO);
            konfirm.setTitle("Konfirmasi Hapus");
            konfirm.showAndWait().ifPresent(bt -> {
                if (bt == ButtonType.YES) {
                    controller.hapusPutusan(selected.getNomorPerkara());
                    refresh();
                    showAlert(Alert.AlertType.INFORMATION, "Putusan berhasil dihapus.");
                }
            });
        });

        BorderPane.setMargin(table, new Insets(0, 24, 16, 24));

        SplitPane split = new SplitPane(table, detailPanel);
        split.setDividerPositions(0.65);
        split.setStyle("-fx-background-color: #0B1622;");

        root.setTop(toolbar);
        root.setCenter(split);
    }

    public void refresh() {
        List<Putusan> list = controller.tampilkanSemua();
        table.setItems(FXCollections.observableArrayList(
                list.stream().map(PutusanRow::new).toList()
        ));
        labelTotal.setText("Total: " + list.size() + " putusan");
    }

    private VBox buildDetailPanel() {
        VBox panel = new VBox(10);
        panel.setPadding(new Insets(16));
        panel.setStyle("-fx-background-color: #0F1D2B;");
        Label placeholder = new Label("Klik baris untuk melihat detail putusan");
        placeholder.setStyle("-fx-text-fill: #5B7B95; -fx-font-size: 13px;");
        placeholder.setWrapText(true);
        panel.getChildren().add(placeholder);
        return panel;
    }

