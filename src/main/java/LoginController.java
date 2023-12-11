import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class LoginController {
    @FXML
    private BorderPane LoginAnchorPane;

    @FXML
    void createAccountClicked(ActionEvent event) throws IOException {
        new SceneSwitch(LoginAnchorPane,"iceproject/CreateAccount.fxml");
    }

    @FXML
    void loginClicked(ActionEvent event) {

    }

}
