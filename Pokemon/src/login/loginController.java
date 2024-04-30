package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import crud.DataBaseConnection;
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
		}else if(password.getText().isEmpty()) {
			lblError.setText("Error: Inserta una contraseña");
			lblError.setVisible(true);
		}else {
			String usuario= txtUsuario.getText();
			String pass= password.getText();
			
			String sql= "SELECT COUNT (*)\n"
					+"FROM ENTRENADOR\n"
					+"WHERE  NOM_ENTRENADOR=?\n"
					+"AND PASSWORD = ?";	
			
		DataBaseConnection con= new DataBaseConnection();
		
		Connection conexion =con.getConnection();
		
		try {
			PreparedStatement ps= conexion.prepareCall(sql);
			ps.setString(1, usuario);
			ps.setString(2, pass);
			ResultSet rs= ps.executeQuery(sql);
			
			while(rs.next()) {
				if(rs.getInt(1)==1) {
					System.out.println("Usuario encontrado");
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}
	}

	@FXML
	void register(ActionEvent event) {
		System.out.println("Registrado maquina");
	}

}
