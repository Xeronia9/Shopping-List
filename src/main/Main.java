package main;

import gui_components.imp.WelcomeFrame;
import menu.imp.MainMenu;
import services.FileManagementService;
import services.imp.DefaultFileManagementService;

public class Main {

	public static void main(String[] args) {	
		new MainMenu().start();
	}

}
