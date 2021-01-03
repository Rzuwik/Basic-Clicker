package f.fclicker.main;

import java.awt.event.InputEvent;
import java.util.Scanner;

public class AutoClickerMain {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---Clicker---");
		
		System.out.println("Wpisz ilosc cps na sekunde: ");
		int clicks = scanner.nextInt();
		
		System.out.println("Wpisz ilosc ms na milisekunde: ");
		int delay = scanner.nextInt();
		System.out.println();
		
		System.out.println("Clicker startuje za 3 sekundy");
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		AutoClicker clicker = new AutoClicker();
		clicker.setDelay(delay);
		
		for (int i = 0; i < clicks; i++) {
			clicker.clickMouse(InputEvent.BUTTON1_MASK);
		}
		
		System.out.println("Clicker wystartowal");
	}
}
