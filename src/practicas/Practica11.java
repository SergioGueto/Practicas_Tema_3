package practicas;

import java.util.Scanner;
import java.util.logging.Logger;
public class Practica11 {

	public static void main(String[] args) {
		var logger = Logger.getLogger("Mylog");
		logger.info("Dame el dia de la semana en letras y te lo devuelvo en numero");
		logger.info("Dime que dia es");
		String dia;
		Scanner input1 = new Scanner(System.in);
		dia = input1.nextLine();
		switch (dia.toUpperCase()){
		case "LUNES":
			logger.info("El lunes es el 1er dia de la semana");
		break;
		case "MARTES":
			logger.info("El martes es el 2º dia de la semana");
		break;
		case "MIERCOLES":
			logger.info("El miercoles es el 3er dia de la semana");
		break;
		case "JUEVES":
			logger.info("El jueves es el 4º dia de la semana");
		break;
		case "VIERNES":
			logger.info("El viernes es el 5º dia de la semana");
		break;
		case "SABADO":
			logger.info("El sabado es el 6º dia de la semana");
		break;
		case "DOMINGO":
			logger.info("El domingo es el 7º dia de la semana");
		break;
		default:
		}

	}

}
