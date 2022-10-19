package practicas;

import java.util.Scanner;
import java.util.logging.Logger;
public class Practica7 {

	public static void main(String[] args) {
		var logger = Logger.getLogger("Mylog");
		logger.info("Este programa te pide la fecha y te dice si esta bien o no\n"+"....................................................................");
		int dia;
		int mes;
		int ano;
		Scanner input = new Scanner(System.in);
		logger.info("dame el dia");
		dia = input.nextInt();
		logger.info("dame el mes");
		mes = input.nextInt();
		logger.info("dame el año");
		ano = input.nextInt();
		if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12 && ano != 0) {
			logger.info("La fecha esta bien");
		}else {
			logger.info("La fecha esta mal");
		}

}
}