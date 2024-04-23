package login;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;

public class loginController {
	 @FXML
	    private ImageView backgroundImg;

	    @FXML
	    private PasswordField password;

	    @FXML
	    private PasswordField txtUsuario;

	    @FXML
	    void close(ActionEvent event) {
	    	Platform.exit();
	    }

	    @FXML
	    void login(ActionEvent event) {
	    	System.out.println("Logueado maquina");
	    }

	    @FXML
	    void register(ActionEvent event) {
	    	System.out.println("Registrado maquina");
	    }

}
