package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage)  {
		

	
		 	try {
		 		Parent root= FXMLLoader.load(getClass().getResource("loguin.fxml"));
		 		Scene scene =new Scene(root);
		 		stage.setScene(scene);
		 		stage.show();
		 		System.out.println("Yes!");
		 	}catch(Exception e) {
		 		e.printStackTrace();
		 	}
		 	
		 	Connection con = null;
			String url = "jdbc:mysql://localhost:3306/pokemon";
			String login = "root";
			String password = "";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url, login, password);
				System.out.println("Conexión establecida");

				Entrenador entrenador = new Entrenador("LUIS", "123456");
				
				
				
				System.out.println(entrenador.toString());
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				try {
					con.close();
					System.out.println("Conexión cerrada");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}

}
