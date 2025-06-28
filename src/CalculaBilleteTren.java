import java.util.Scanner;

public class CalculaBilleteTren {

	public static void main(String[] args) {
		/*Esta clase es una introduccion para poder utilizar una condicional mas avanzada ,
		 el switch. Con esta mencionada podemos seleccionar una condicion que dicta una
		 sentencia. Estas condiciones son conocidas como case, se puede seleccionar un case
		 dentro de varios.
		 
		 La seleccion de casos en esta clase se da a billetes de tren, y dependiendo del
		 dia de la semana se aplica un descuento.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de viajeros.");
		int numViajeros = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Indique que dia de la semana va realizar su viaje.");
		String fechaViaje = sc.nextLine();
		
		System.out.println("Quiere añadir su carnet joven para un descuento? (si/no)");
		String carnetJoven = sc.nextLine();
		
		double precio;
		
		switch(fechaViaje.toLowerCase()) {/*TOLOEWRCASE es para que se valide el 
											string siendo la primera mayuscula o no*/
		
		case "lunes": precio=numViajeros*2;
		break; 
		
		/*el martes se cobrara una tarifa especial por ser el dia de san valentin, 
		 entonces se cobrará por parejas
		 
		 para ello necesito saber si es numero par el numViajeros*/
		case "martes": if(numViajeros%2==0) {/*si dividimos el numero de viajeros entre 2
												y nos sobra 0, signica que es par*/
			precio=(numViajeros/2)*6;/*asi cada persona va pagar 6 euros si va en pareja*/
			
		}else {
			precio=(numViajeros/2)*6;//lo mismo(pero como no hay parejas)
			precio+=9;//el numero se va sumar 9 euros
			}
		break;//termino de la condicional case
		default://si no entonces... 
			precio = numViajeros*9;
		
		}
		//Ahora la creación de un herramienta que identifica que tenemos un carnet joven
		if(carnetJoven.toLowerCase().equals("si")) {/*el equals(). analiza si el contenido
		 											en las diferentes entradas es igual*/ 
			precio-=(precio*0.10);
		}
		
		System.out.println("Has comprado "+numViajeros +" billetes."
				+ ". Y el precio total a pagar es: "+precio);
	}

}

/*
English Version

import java.util.Scanner;

public class CalculaBilleteTren {

    public static void main(String[] args) {

        // This class is an introduction to using a more advanced conditional, the switch statement.
        // With this, we can select a condition that dictates a sentence.
        // These conditions are known as cases, and you can select one case out of several.

        // In this class, the selection of cases is applied to train tickets, and depending on
        // the day of the week, a discount is applied.

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of travelers.");
        int numViajeros = sc.nextInt();
        sc.nextLine();

        System.out.println("Indicate which day of the week you will travel.");
        String fechaViaje = sc.nextLine();

        System.out.println("Would you like to add your youth card for a discount? (yes/no)");
        String carnetJoven = sc.nextLine();

        double precio;

        // TOLOWERCASE is used to validate the string regardless of whether the first letter is uppercase or not.
        switch (fechaViaje.toLowerCase()) {

            case "lunes": 
                precio = numViajeros * 2;
                break;

            
             // On Tuesday, a special fare is charged because it's Valentine's Day,
             //so it will be charged per couple.
             
             // To do this, I need to know if the number of travelers is even.
            
            case "martes":
                if (numViajeros % 2 == 0) { // If we divide the number of travelers by 2 and there is no remainder, it means it's even.
                    precio = (numViajeros / 2) * 6; // This way, each person will pay 6 euros if they travel in pairs.
                } else {
                    precio = (numViajeros / 2) * 6; // The same (but since there are no pairs)
                    precio += 9; // The remaining traveler will be charged 9 euros.
                }
                break; // End of the case condition.
            default:
                // If it's not the specific case, the price will be calculated at 9 euros per traveler.
                precio = numViajeros * 9;
        }

        // Now the creation of a tool that checks if we have a youth card.
        if (carnetJoven.toLowerCase().equals("si")) { 
            // The equals() method checks if the content of the different inputs is the same.
            precio -= (precio * 0.10); // Apply a 10% discount if the youth card is used.
        }

        System.out.println("You have purchased " + numViajeros + " tickets."
                + " The total price to pay is: " + precio);
    }
}

 */



