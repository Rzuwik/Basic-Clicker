package f.fclicker.main;

import java.awt.event.InputEvent;
import java.util.Scanner;

public class AutoClickerMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Logger.println("---Clicker---");
		
		Logger.println("Wpisz ilosc cps na sekunde: ");
		int c = scanner.nextInt();
		
		Logger.println("Wpisz ilosc ms na milisekunde: ");
		int d = scanner.nextInt();
		
		Logger.println("Clicker startuje za 3 sekundy");
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		AutoClicker clicker = new AutoClicker();
		clicker.setDelay(d);
		
		for (int i = 0; i < c; i++) {
			clicker.clickMouse(InputEvent.BUTTON1_MASK);
		}
		
		Logger.println("Clicker wystartowal");
	}
}
