package practicas;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Practica3 {

	public static void main(String[] args) {
		var logger = Logger.getLogger("Mylog");
		logger.info("Este programa te pide 3 numeros y te los ordenan de mayor a menor\n"+"....................................................................");
		double x;
		double y;
		double z;
		final String frase = "Los numeros ordenados de mayor a menor son: ";
		logger.info("dame 1 numero");
		Scanner input1 = new Scanner(System.in);
		x = input1.nextDouble();
		logger.info("dame otro numero");
		Scanner input2 = new Scanner(System.in);
		y = input2.nextDouble();
		logger.info("dame un tercer numero");
		Scanner input3 = new Scanner(System.in);
		z = input3.nextDouble();
		if (x > y && x > z && y > z) {
			logger.log(Level.SEVERE, "{0}", frase + x+" > "+y+" > "+z);
		}
		if (x > y && x > z && z > y) {
			logger.log(Level.SEVERE, "{0}", frase + x+" > "+z+" > "+y);
		}
		if (z > y && z > x && y > x) {
			logger.log(Level.SEVERE, "{0}", frase + z+" > "+y+" > "+x);
		}
		if (z > y && z > x && x > y) {
			logger.log(Level.SEVERE, "{0}", frase + z+" > "+x+" > "+y);
		}
		if (y > x && y > z && x > z) {
			logger.log(Level.SEVERE, "{0}", frase + y+" > "+x+" > "+z);
		}
		if (y > x && y > z && z > x) {
			logger.log(Level.SEVERE, "{0}", frase + y+" > "+z+" > "+x);
		}
		if (x == y && x == z) {
			logger.info("Los 3 numeros son iguales");
		}

	}

}
