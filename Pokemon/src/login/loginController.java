package login;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class loginController {

	public void register(ActionEvent e) {
		System.out.println("Registrado maquina");
	}
	public void login(ActionEvent e) {
		System.out.println("Logueado maquina");
	}
	public void close(ActionEvent e) {
		Platform.exit();
	}
}
