package pl.justynababinska.mp3player.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuPaneController implements Initializable{

	@FXML
	private MenuBar fileMenu;

	@FXML
	private MenuItem fileMenuItem;

	@FXML
	private MenuItem dirMenuItem;

	@FXML
	private MenuItem closeMenuItem;

	@FXML
	private MenuItem aboutMenuItem;

	public MenuBar getFileMenu() {
		return fileMenu;
	}

	public MenuItem getFileMenuItem() {
		return fileMenuItem;
	}

	public MenuItem getDirMenuItem() {
		return dirMenuItem;
	}

	public MenuItem getCloseMenuItem() {
		return closeMenuItem;
	}

	public MenuItem getAboutMenuItem() {
		return aboutMenuItem;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	
}
