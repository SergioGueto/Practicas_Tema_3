package practicas;

import java.util.Scanner;
import java.util.logging.Logger;
public class Practica4 {

	public static void main(String[] args) {
		var logger = Logger.getLogger("Mylog");
		logger.info("Este programa te pide un numero entre el 1 y el 9999 y te dice cuantas cifras tiene");
		logger.info("....................................................................");
		int x;
		logger.info("dame 1 numero");
		Scanner input1 = new Scanner(System.in);
		x = input1.nextInt();
		if (x>=1 && x<=9) {
			logger.info("El numero tiene 1 cifra");
		}
		if (x>=10 && x<=99) {
			logger.info("El numero tiene 2 cifras");
		}
		if (x>=100 && x<=999) {
			logger.info("El numero tiene 3 cifras");
		}
		if (x>=1000 && x<=9999) {
			logger.info("El numero tiene 4 cifras");
		}

	}

}
