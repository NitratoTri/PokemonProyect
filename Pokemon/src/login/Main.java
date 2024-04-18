package login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage)  {
		// TODO Auto-generated method stub
		 	try {
		 		Parent root= FXMLLoader.load(getClass().getResource("loguin.fxml"));
		 		Scene scene =new Scene(root);
		 		stage.setScene(scene);
		 		stage.show();
		 		System.out.println("Yes!");
		 	}catch(Exception e) {
		 		e.printStackTrace();
		 	}
	}

}
