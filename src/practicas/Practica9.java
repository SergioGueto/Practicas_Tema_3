package practicas;

import java.util.Scanner;
import java.util.logging.Logger;
public class Practica9 {

	public static void main(String[] args) {
		var logger = Logger.getLogger("Mylog");
		int nota;
		logger.info("Dame la nota en numero y te la devuelvo en letra");
		Scanner input2 = new Scanner(System.in);
		nota = input2.nextInt();
		switch (nota) {
		case 0:
			logger.info("CERO");
		break;
		case 1:
			logger.info("UNO");
		break;
		case 2:
			logger.info("DOS");
		break;
		case 3:
			logger.info("TRES");
		break;
		case 4:
			logger.info("CUATRO");
		break;
		case 5:
			logger.info("CINCO");
		break;
		case 6:
			logger.info("SEIS");
		break;
		case 7:
			logger.info("SIETE");
		break;
		case 8:
			logger.info("OCHO");
		break;
		case 9:
			logger.info("NUEVE");
		break;
		case 10:
			logger.info("DIEZ");
		break;
		default:
		}
		if (nota < 0 || nota > 10) {
			logger.info("Nota no valida");
		}

	}

}
