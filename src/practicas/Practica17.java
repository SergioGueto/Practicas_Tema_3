package practicas;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.logging.Logger;

public class Practica17 {

	public static void main(String[] args) {
	
		var logger = Logger.getLogger("Mylog");
		SecureRandom secureRandom = new SecureRandom();
		int numero = secureRandom.nextInt(100-1+1)+1;
		int num2;
		logger.info("Este juego trata de que intentar adivinar un numero del 1 al 100");
		do {
		logger.info("Dame un numero");
		Scanner input1 = new Scanner(System.in);
		num2 = input1.nextInt();
		if (num2 > numero) {
			logger.info("El numero generado es menor");
		}else if (num2 < numero) {
			logger.info("El numero generado es mayor");
		}else {
			logger.info("Felicidades, has acertado el numero");
		}
		}while (numero != num2);
	}

}

