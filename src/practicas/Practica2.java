package practicas;

import java.util.Scanner;
import java.util.logging.Logger;

public class Practica2 {

	public static void main(String[] args) {
		var logger = Logger.getLogger("Mylog");
		logger.info("Este programa te pide 2 numeros y te dice cual es mayor\n"+"....................................................................");
		double x;
		double y;
		logger.info("dame 1 numero");
		Scanner input1 = new Scanner(System.in);
		x = input1.nextDouble();
		logger.info("dame otro numero");
		Scanner input2 = new Scanner(System.in);
		y = input2.nextDouble();
		if (x > y) {
			logger.info("El primer numero es mayor");
		}else if (x == y) {
			logger.info("Los 2 numeros son iguales");
		}else{
			logger.info("El segundo numero es mayor");
		}
		

	}

}
