package practicas;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Practica13 {


		public static void main(String[] args) {
			var logger = Logger.getLogger("Mylog");
			logger.info("Este programa te dice la probabilidad que tienes de ganar la loteria");
			logger.info("A continuacion se le haran una serie de preguntas");
			logger.info("Ponga 1 si la respuesta es SI o 0 si la respuesta es NO");
			int contador = 0;
			int p1;
			int p2;
			int p3;
			int p4;
			int p5;
			int p6;
			int p7;
			logger.info("¿Ha comprado loteria?");
			Scanner input1 = new Scanner(System.in);
			p1 = input1.nextInt();
			if (p1 == 1 ) {
				contador = contador + 1;
				logger.info("¿Ha comprado mas de un decimo?");
				Scanner input2 = new Scanner(System.in);
				p2 = input2.nextInt();
				if (p2 == 1) {
					contador = contador + 2;
					logger.info("¿Ha comprado en mas de 1 administracion?");
					Scanner input3 = new Scanner(System.in);
					p3 = input3.nextInt();
					if (p3 == 1) {
						contador = contador + 2;
					}
					logger.info("¿En alguna de esas ha tocado algun premio?");
					Scanner input4 = new Scanner(System.in);
					p4 = input4.nextInt();
					if (p4 == 1) {
						contador = contador + 2;
					}
					logger.info("¿Ha comprado loteria algun otro año?");
					Scanner input5 = new Scanner(System.in);
					p5 = input5.nextInt();
					if (p5 == 1) {
						contador = contador + 2;
					}else if (p5 == 0) {
						contador = contador + 1;}
					}else if (p2 == 0) {
						logger.info("¿Ha tocado la loteria alguna vez en la administracion en la que ha comprado la loteria?");
						Scanner input6 = new Scanner(System.in);
						p6 = input6.nextInt();
						if (p6 == 1) {
							contador = contador + 1;
						}
						logger.info("¿Compro loteria el año pasado?");
						Scanner input7 = new Scanner(System.in);
						p7 = input7.nextInt();
						if (p7 == 1) {
							contador = contador + 1;
						}
					}
				logger.log(Level.SEVERE, "Tu probabilidad de ganar la loteria es de {0} ", contador + " sobre 9");
		}else if(p1 == 0) { logger.info("Si no ha comprado un boleto no necesita este programa");

		}
	}
	}


