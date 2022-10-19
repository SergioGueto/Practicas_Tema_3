package practicas;

import java.util.Scanner;
import java.util.logging.Logger;
public class Practica6 {

	public static void main(String[] args) {
		var logger = Logger.getLogger("Mylog");
		logger.info("Este programa te pide la nota y te dice en el rango en el que esta");
		logger.info("....................................................................");
		int x;
		logger.info("dame 1 numero");
		Scanner input1 = new Scanner(System.in);
		x = input1.nextInt();
		switch (x) {
		case 1,2,3,4:
			logger.info("Insuficiente");
		break;
		case 5:
			logger.info("Suficiente");
		break;
		case 6,7:
			logger.info("bien");
		break;
		case 8:
			logger.info("Notable");
		break;
		case 9,10:
			logger.info("Sobresaliente");
		break;
		default:

		}
	}
}