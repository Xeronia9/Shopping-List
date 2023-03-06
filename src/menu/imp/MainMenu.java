package menu.imp;

import gui_components.imp.WelcomeFrame;
import menu.Menu;

public class MainMenu implements Menu {

	@Override
	public void start() {
		new WelcomeFrame();
	}

}
