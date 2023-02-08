package Aula02;

import java.util.Scanner;

public class TESTE {

	public static void main(String[] args) {
float a,b,c,d,e,f,x,y;
		
		Scanner leia = new Scanner (System.in);
 
      System.out.println("\nEntre com o valor de A: ");
      a= leia.nextFloat();
      
      System.out.println("\nEntre com o valor de B: ");
      b= leia.nextFloat();
      
      System.out.println("\nEntre com o valor de C: ");
      c= leia.nextFloat();
      
      System.out.println("\nEntre com o valor de D: ");
      d= leia.nextFloat();
      
      System.out.println("\nEntre com o valor de E: ");
      e= leia.nextFloat();
      
      System.out.println("\nEntre com o valor de F: ");
      f= leia.nextFloat();
      
      x=(c*e-b*f) / (a*e-b*d);
      y=(a*f-c*d) / (a*e-b*d);
      
      System.out.println(" Resultado de x é:, "+x + " Resultado de y é:"+ y);
      
		
		
		
		


	}

}
