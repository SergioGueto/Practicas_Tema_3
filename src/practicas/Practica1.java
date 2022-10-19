package practicas;

import java.util.Scanner;
import java.util.logging.Logger;
public class Practica1 {

	public static void main(String[] args) {
		var logger = Logger.getLogger("Mylog");
		logger.info("Este programa te pide 2 numeros y te dice si son multiplos o no\n"+"....................................................................");
		double x;
		double y;
		double resto;
		logger.info("dame 1 numero");
		Scanner input1 = new Scanner(System.in);
		x = input1.nextDouble();
		logger.info("dame otro numero");
		Scanner input2 = new Scanner(System.in);
		y = input2.nextDouble();
		resto = x%y;
		if (resto == 0) {
			logger.info("Los 2 numeros son multiplos");
		}else {
			logger.info("Los 2 numeros no son multiplos");
		}
	}

}
