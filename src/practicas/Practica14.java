package practicas;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Practica14 {

	public static void main(String[] args) {
		var logger = Logger.getLogger("Mylog");
		int dia;
		int mes;
		int ano;
		logger.info("Dame el dia");
		Scanner input1 = new Scanner(System.in);
		dia = input1.nextInt();
		logger.info("Dame el mes");
		Scanner input2 = new Scanner(System.in);
		mes = input2.nextInt();
		logger.info("Dame el año");
		Scanner input3 = new Scanner(System.in);
		ano = input3.nextInt();
		logger.log(Level.SEVERE, "La fecha es {0} ", (dia+1) + "/" + (mes+1) + "/" + (ano+1));

	}

}
