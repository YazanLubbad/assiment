package view;

import controller.FXML2Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CurrencyConversionView {
    private static final String FXML_FILE = "CurrencyConversion.fxml";
    private static final String TITLE = "Currency Conversion";

    private Stage stage;
    private FXML2Controller currencyConversionController;

    public CurrencyConversionView() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE));
            Parent root = loader.load();
            currencyConversionController = loader.getController();
            stage = new Stage();
            stage.setTitle(TITLE);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getStage() {
        return stage;
    }

    public FXML2Controller getCurrencyConversionController() {
        return currencyConversionController;
    }

    public void close() {
        stage.close();
    }
}
