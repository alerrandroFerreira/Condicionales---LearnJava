import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

public class primeroYUltimaCifraNumero {

	public static void main(String[] args) {
		/*Repara en que el if que se utiliza en este código no esta condicionado en corchetes
		 if(n<10)System.out.println("Es un numero que contiene una sola cifra, es decir,"
				+ "tiene la misma cifra que la ultima");
				
		cuando solo quieres realizar una funcion con el if, no hace falta iniciarlo con corchetes
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quiero un numero positivo con maximo 3 cifras: ");
		int n = sc.nextInt();
		int nUsuario = n;
		
		
		if(n<0 || n>999) { 
			/*if que filtra que se cumple el requerimiento de datos, en caso de que no pueda 
			 realizar la tarea se muestra: */
			System.out.println("El número no cumple con los requisitos");
			System.exit(0);//variable auxuliar para identificar la primera cifra del numero
		}
		System.out.println("La última cifra "+n+" es: "+n%10);
		/*
		 *Con esta HERRAMIENTA lógica puedes verificar la ultima cifra del numero
		 de manera simple. 
		 
		 *Ten en cuenta que este y los anteriores ejercicios del 
		 modulo a los que subo en gitHub, son ejercicios reducibles.
		 Por ejemplo esta clase se podría hacer perfectamente con un bucle ahorrando código
		 
		 *Lo importante ahora es adquirir una lógica de programación sólida, asi que 
		 este y mas ejercicios simple son, base y fundamentales  */
		
		if(n<10)System.out.println("Es un numero que contiene una sola cifra, es decir,"
				+ "tiene la misma cifra que la ultima");//HERRAMIENTA para identificar una cifra
		/*Si se puede reducir el tamaño de la línea de código es mejor optar por ello para 
		una mejor lecutra*/
		
		
		/*ELSE IF es una continuación a la condicional, también es una condicional que se realiza 
		 despues de que se ejecute el primero. */
		else if(n<100) {
			nUsuario/=10;
			/*Entiende que se divide el numero entre 10, por ejemplo si 
			 n = 86
			 n se reconoce como 8.6 pero se representa como 8 por ser de valor decimal = int*/
			System.out.println("La primera cifra de "+n+" es: "+nUsuario%10);
			/*aqui nos va a mostrar basicamente el ultimo numero del resultado de la resta, 
			el ultimo numero de 8 es 8...Si, es una chapuza, pero no deja de ser funcional*/
		}else if(n<1000) {
			nUsuario/=100;
			System.out.println("La primera cifra de "+n+" es: "+nUsuario%10);
		}else {
			nUsuario/=1000;
		}/*Listo, este número solo entra dentro del else si su valor equivale a 3 cifras*/
		
		

	}

}
/*
English Version

import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

public class primeroYUltimaCifraNumero {

    public static void main(String[] args) {
        
        // Note that the if statement used in this code does not require braces
        // If(n<10) System.out.println("It's a number that contains only one digit, meaning it has the same digit as the last one");
        // When you only want to perform one action with the if, there is no need to start it with braces.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("I want a positive number with a maximum of 3 digits: ");
        int n = sc.nextInt();
        int nUsuario = n;

        if (n < 0 || n > 999) { 
            // If statement that filters to check the data requirement; if it can't perform the task, it shows:
            System.out.println("The number does not meet the requirements");
            System.exit(0); // Auxiliary variable to identify the first digit of the number
        }

        System.out.println("The last digit of " + n + " is: " + n % 10);
        // With this logical tool, you can verify the last digit of the number 
        // in a simple way.
        // Keep in mind that this and the previous exercises from the module I 
        // upload to GitHub are reducible exercises.
        // For example, this class could be perfectly done with a loop to save code.
        // The important thing now is to acquire a solid programming logic, so this 
        // and more simple exercises are basic and fundamental.
        
        if (n < 10) System.out.println("It's a number that contains only one digit, meaning it has the same digit as the last one."); // TOOL to identify a digit
        // If the size of the line of code can be reduced, it is better to opt for that for better readability.
        
        //ELSE IF is a continuation of the conditional; it is also a conditional that is executed 
         // after the first one. 

        else if (n < 100) {
            nUsuario /= 10;
            // Understand that the number is divided by 10; for example, if 
            // n = 86, n is recognized as 8.6 but represented as 8 since it's a decimal value = int
            System.out.println("The first digit of " + n + " is: " + nUsuario % 10);
            // Here it will basically show the last number of the result of the division, 
            // the last number of 8 is 8... Yes, it's a hack, but it still works.
        } else if (n < 1000) {
            nUsuario /= 100;
            System.out.println("The first digit of " + n + " is: " + nUsuario % 10);
        } else {
            nUsuario /= 1000;
        } // This number only enters the else if its value equals 3 digits.
    }
}
*/


