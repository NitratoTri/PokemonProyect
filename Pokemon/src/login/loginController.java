package login;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class loginController {
	@FXML
    private Label lblError;

	
	@FXML
	private Button registrarButton;
	@FXML
	private ImageView backgroundImg;

	@FXML
	private PasswordField password;

	@FXML
	private PasswordField txtUsuario;

	  @FXML
	    private void onKeyTyped(KeyEvent event) {
		  	if(txtUsuario.getText().equals(" "));
		  	event.consume();
	    }

	@FXML
	void close(ActionEvent event) {
		Platform.exit();
	}

	@FXML
	void login(ActionEvent event) {
		
		
		if(txtUsuario.getText().isEmpty()) {
			lblError.setText("Error: Inserta nombre de usuario");
			lblError.setVisible(true);
		}
	}

	@FXML
	void register(ActionEvent event) {
		System.out.println("Registrado maquina");
	}

}
