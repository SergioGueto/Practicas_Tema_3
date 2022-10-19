package practicas;

import java.util.Scanner;
import java.util.logging.Logger;
public class Practica5 {

	public static void main(String[] args) {
		var logger = Logger.getLogger("Mylog");
		logger.info("Este programa te pide un numero y te dice si es par o no");
		logger.info("....................................................................");
		int x;
		float resto;
		logger.info("dame 1 numero");
		Scanner input1 = new Scanner(System.in);
		x = input1.nextInt();
		resto = x%2;
		if (resto == 0) {
			logger.info("Este numero es par");
		}else {
			logger.info("Este numero es impar");
		}

	}

}
