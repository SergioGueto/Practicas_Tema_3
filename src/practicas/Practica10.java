package practicas;

import java.util.logging.Level;
import java.util.Scanner;
import java.util.logging.Logger;
public class Practica10 {

	public static void main(String[] args) {
		var  logger = Logger.getLogger("Mylog");
		double x;
		double cuadrado;
		logger.info("Dame un numero");
		Scanner input2 = new Scanner(System.in);
		x = input2.nextDouble();
		while (x >= 0) {
			cuadrado = x*x;
			logger.log(Level.SEVERE, "EL CUADRADO ES: {0}", cuadrado);
			logger.info("Dame otro numero");
			Scanner input3 = new Scanner(System.in);
			x = input3.nextDouble();
		}
		if (x < 0) {
			logger.info("Fin del programa");
		}
		

	}

}
