package login;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class loginController {
	  @FXML
	    private Button registrarButton;
	 @FXML
	    private ImageView backgroundImg;

	    @FXML
	    private PasswordField password;

	    @FXML
	    private PasswordField txtUsuario;
	    @FXML
		private void eventKey(KeyEvent event) {
			if (event.getCharacter().equals(" ")) {
				event.consume();// Detenemos el evento
			}
		}
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
