package practicas;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Practica18 {

	public static void main(String[] args) {
		var logger = Logger.getLogger("Mylog");
		int num;
		int cont=0;
		logger.info("dame un numero te dare todos los valores desde el 1 hasta ese numero");
		Scanner input1 = new Scanner(System.in);
		num = input1.nextInt();
		for (int i=1; i<=num;i++) {
			logger.log(Level.SEVERE, "\n {0} ",i);
			
			if (i%2==0) {
				cont = cont +1;
			}
		}
		logger.log(Level.SEVERE, "Hay un total de {0} ", cont + " numeros que son divisibles entre 2 en la lista");
	}

}
