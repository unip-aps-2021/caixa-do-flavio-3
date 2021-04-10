import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import java.io.IOException;


public class Pagina2Controller {
    private XYChart.Series series1 = new XYChart.Series();
    @FXML private TabPane tabPanePag2;
    @FXML private Tab tabPag1;
    @FXML private APSController apsController;

    @FXML
    private Button aba1;
    @FXML
    private Button aba2;
    @FXML
    private Button aba3;
    @FXML
    private Button aba4;
    @FXML
    private BarChart chart;

//classes -> Rio(nome, longitude, descrição, etc)
//Criar novo Rio, Testando OOP
//Usuário de entrada
    @FXML
    public void initialize() {
        new CategoryAxis().setLabel("Mike");
        new NumberAxis().setLabel("Ueee");
        series1.setName("Unip");
        addChart(series1, "Tio ete", 350);
        addChart(series1, "Pinheiros", 300);
        addChart(series1, "Tamanduatei", 250);
        addChart(series1, "Piracicaba", 150);
        addChart(series1, "Anhangabau", 100);

        chart.getData().addAll(series1);
    }


    @FXML
    private void setAba1(ActionEvent event) {
        System.out.println("BLABLABLABLABLABLA");
    }

    @FXML
    private void setAba2(ActionEvent event) {
        series1 = new XYChart.Series();
        addChart(series1, "Aricanduva", 300);
        addChart(series1, "Rio Grande", 250);
        addChart(series1, "Jacaré-Pepira", 350);
        addChart(series1, "Atibainha", 200);
        addChart(series1, "Peixe", 200);

        chart.getData().addAll(series1);
        System.out.println("BLABLABLALBBLALBALBLALABALLAB");
    }

    private void changeChartByIndex(XYChart.Series series, int index, int valor) {
        XYChart.Data data = (XYChart.Data) series.getData().get(index);
        data.setYValue(valor);
    }

    private void addChart(XYChart.Series series, String nome, int valor) {
        series.getData().add(new XYChart.Data(nome, valor));
    }
}
