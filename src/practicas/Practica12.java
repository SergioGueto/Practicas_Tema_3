package practicas;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Practica12 {

	public static void main(String[] args) {
		var logger = Logger.getLogger("Mylog");
		logger.info("Dame un numero de hasta 5 digitos y te dire cuantos tiene");
		String num;
		logger.info("Dame un numero");
		Scanner input1 = new Scanner(System.in);
		num = input1.nextLine();
		int length = num.length();
		if (length > 5) {
			logger.info("Este programa solo admite numeros de como maximo 5 digitos");
		}else {
			int numero = Integer.parseInt(num);
			if (numero < 0) {
				logger.log(Level.SEVERE, "El numero tiene {0} ", (length -1) + " digitos");
			}else {
				logger.log(Level.SEVERE, "El numero tiene {0} ", (length) + " digitos");
		

	}

}
}
}