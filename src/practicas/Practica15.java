package practicas;

import java.util.Scanner;
import java.util.logging.Logger;

public class Practica15 {

	public static void main(String[] args) {
		var logger = Logger.getLogger("Mylog");
		int num;
		String cont;
		Scanner input = new Scanner(System.in);
		
		do {
			logger.info("Deme un numero entre el 1000 y el -1000");
			num = input.nextInt();
			if (num >= -1000 && num < 0) {
				logger.info("El numero es negativo");
			}else if (num >=0 && num <=1000) {
				logger.info("El numero es positivo");
			}else {
				logger.info("numero no valido");
			}
			logger.info("Desea continuar?\n" + "Escriba una de las 2 opciones\n" + "1. CONTINUAR\n" + "2. FINALIZAR");
			Scanner input1 = new Scanner(System.in);
			cont = input1.nextLine();
			cont = cont.toUpperCase();
			} while (cont.contentEquals("CONTINUAR")); 
		
		}

	}


