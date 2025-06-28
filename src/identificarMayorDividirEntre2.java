import java.util.Scanner;

public class identificarMayorDividirEntre2 {

	public static void main(String[] args) {
		/*Aqui se crea en realidad un manera de identificar un numero que sea mayor
		 que otro (entre solo dos numeros introducidos)*/

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		
		int n1 = sc.nextInt();
		
		System.out.println("Introduce un segundo número, diferente, entero:");
	
		int n2 = sc.nextInt();
		if(n1==n2) {
			System.out.println("Los números no pueden ser de valor igual...");
			System.exit(0);
			/*Aqui se termina el flujo gracias al system.exit
			 Esto pasa solo en caso de que el primer numero sea igual al segundo numero*/
		}
	if(n2>n1) n1 = n2;
	/*el if causa una separación entre n1 y n2, si introduces un numero en n2
	que es mas grande  qie n1, el n1 pasa a tener el valor de n2
	
	5>3? = 5
	3 ya no existe
	
	y asi se hace para poder separar un numero de otro en el caso de 
	que estemos tratando de valores
	
	*/
	if(n1%2==0) System.out.println(" El numero " + n1 +" es par");
	else System.out.println(n1 + " Es impar");
		/*si el numero se divide entre dos en un bucle y su resta es cero, signica que es par*/
	if(n1%5==0) System.out.println(n1 + " Es divisible entre 5");
	else System.out.println(n1 + " no se divide entre 5");
	}

}
/*
English Version

import java.util.Scanner;

public class identificarMayorDividirEntre2 {

   public static void main(String[] args) {

       // Here we create a way to identify a number that is larger than another (among only two entered numbers)

       Scanner sc = new Scanner(System.in);

       System.out.println("Introduce un numero entero:");

       int n1 = sc.nextInt();

       System.out.println("Introduce un segundo número, diferente, entero:");

       int n2 = sc.nextInt();

       if (n1 == n2) {
           System.out.println("Los números no pueden ser de valor igual...");
           System.exit(0);
           // The flow ends here thanks to System.exit
           // This happens only in the case where the first number is equal to the second number
       }

       if (n2 > n1) n1 = n2;
       
        //The if separates n1 and n2, if you input a number in n2 that is larger than n1,
        //n1 takes the value of n2
        
        5 > 3? = 5
        3 no longer exists
        
        //This is how we separate one number from another in the case we are dealing with values.
        

       if (n1 % 2 == 0) 
           System.out.println("El numero " + n1 + " es par");
       else 
           System.out.println(n1 + " es impar");
       // If the number divides by 2 and the remainder is zero, it means it is even

       if (n1 % 5 == 0) 
           System.out.println(n1 + " es divisible entre 5");
       else 
           System.out.println(n1 + " no se divide entre 5");
   }
}
*/

