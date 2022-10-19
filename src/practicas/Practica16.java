package practicas;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Practica16 {

	public static void main(String[] args) {
		var logger = Logger.getLogger("Mylog");
		int num;
		int num2;
		int cont = 0;
		boolean salir = false;
		logger.info("Deme un numero y te dire si es par o impar, ademas al finl del programa te dire la cantidad total de numeros que has introducido.\n"+"Si el numero es igual al anterior dado o a 0 el programa acaba");
		do {
			logger.info("dame un numero");
			Scanner input1 = new Scanner(System.in);
			num = input1.nextInt();
			if (num == 0) {
				salir = true;
			} else {
				if (num%2 == 0) {
					logger.info("El numero es par");
				}else {
					logger.info("El numero es impar");
				}
				num2 = num;
				logger.info("dame otro numero");
				Scanner input2 = new Scanner(System.in);
				num = input2.nextInt();
				if (num == num2 || num == 0) {
					salir = true;
					}else {
						if (num%2 == 0) {
							logger.info("El numero es par");
						}else {
							logger.info("El numero es impar");
				}
						cont = cont + 1;
				}
				
			}
			cont = cont + 1;
		}while (!salir);
		logger.log(Level.SEVERE, "has introducido {0} ", cont + " numeros");
	}

}
