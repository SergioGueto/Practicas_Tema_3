package practicas;

import java.util.Scanner;
import java.util.logging.Logger;
public class Practica8 {

	public static void main(String[] args) {
		var logger = Logger.getLogger("Mylog");
		int dia;
		logger.info("Dame los numeros 28,30,31 y re dire q meses tienen esos dias");
		Scanner input2 = new Scanner(System.in);
		dia = input2.nextInt();
		switch (dia) {
		case 28:
			logger.info("Febrero");
		break;
		case 30:
			logger.info("Abril, junio, septiembre y noviembre.");
		break;
		case 31:
			logger.info("Enero, marzo, mayo, julio, agosto, octubre y diciembre");
		break;
		default:
		}

	}

}
