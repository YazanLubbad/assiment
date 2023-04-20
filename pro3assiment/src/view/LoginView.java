package view;

import controller.FXMLController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginView extends Stage {
    private static final String FXML_FILE = "FXMLController.fxml";
    private static final String TITLE = "Login";

    private Stage stage;
    private FXMLController loginController;

    public LoginView() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE));
            Parent root = loader.load();
            loginController = loader.getController();
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

    public FXMLController getLoginController() {
        return loginController;
    }

    public void close() {
        stage.close();
    }
    
       
}
