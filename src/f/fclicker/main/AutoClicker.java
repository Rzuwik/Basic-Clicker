package f.fclicker.main;

import java.awt.Robot;

public class AutoClicker {
	Robot r;
	int d;
	
	public AutoClicker() {
		try {
			r = new Robot();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public void clickMouse(int button) {
		try {
			r.mousePress(button);
			r.delay(250);
			r.mouseRelease(button);
			r.delay(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void setDelay(int ms) {
		this.d = ms;
	}
}
