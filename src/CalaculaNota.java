import java.util.Scanner;

public class CalaculaNota {
    /*
     * consiste en calcular la media de la nota total de un usuario, a partir de
     * tres notas
     * Lo primero sería analizar que necesito para calcular la nota
     */
    public static void main(String[] args) {

        double notaAD, notaEmpresa, notaGestion, notaInterfaces, notaPSP, notaIngles;
        // asigna variables de tipo double por que la nota siempre será un entero, puede
        // ser un numero entero

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nota de Acceso a Datos:  ");
        notaAD = sc.nextInt();

        System.out.println("Introduce tu nota de Empresa: ");
        notaEmpresa = sc.nextInt();

        System.out.println("Introduce tu nota de Gestion: ");
        notaGestion = sc.nextInt();

        System.out.println("Introduce tu nota de Interfaces Graficas: ");
        notaInterfaces = sc.nextInt();

        System.out.println("Introduce tu nota de PSP: ");
        notaPSP = sc.nextInt();

        System.out.println("Introduce tu nota de Ingles: ");
        notaIngles = sc.nextInt();

        double notaTotal = ((notaAD + notaEmpresa + notaGestion + notaInterfaces + notaPSP + notaIngles) / 6);
        System.out.println("Tu media es: " + notaTotal);

        // significado de cada nota, se hace a traves del if, else if y else
        if (notaTotal <= 4) {// si la nota es menor o igual que cuatro = insuficiente
            System.out.println("Has suspendido la evaluacion, tienes un INSUFICENTE");
        } else if (notaTotal == 5) {// igual que cinco es suficiente
            System.out.println("Has aprobado y tu nota es un SUFICIENTE");
        } else if (notaTotal >= 6 && notaTotal <= 8) {// entre 6 y 8 un notable
            System.out.println("Has aprobado y tu nota es un NOTABLE");
        } else if (notaTotal == 9) {// mas que nueve significa sobresaliente
            System.out.println("Muy bien! Has aprobado con un SOBRESALIENTE");
        } else if (notaTotal == 9) {// sacas un diez tienes un total
            System.out.println("Has sacado un TOTAL");
            // es un juego de if e else if que desencadena una respuesta para cada nota
        }
    }

}
/*
 * 
 * English Version
 * 
 * import java.util.Scanner;
 * 
 * public class CalculaNota {
 * 
 * // The program consists of calculating the user's total average grade based
 * on six grades.
 * // The first thing to do would be to analyze what is needed to calculate the
 * grade.
 * 
 * public static void main(String[] args) {
 * 
 * // Assign variables of type double because grades can be decimal values, not
 * just integers.
 * double notaAD, notaEmpresa, notaGestion, notaInterfaces, notaPSP, notaIngles;
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter your grade for Data Access: ");
 * notaAD = sc.nextInt();
 * 
 * System.out.println("Enter your grade for Business: ");
 * notaEmpresa = sc.nextInt();
 * 
 * System.out.println("Enter your grade for Management: ");
 * notaGestion = sc.nextInt();
 * 
 * System.out.println("Enter your grade for Graphical Interfaces: ");
 * notaInterfaces = sc.nextInt();
 * 
 * System.out.println("Enter your grade for PSP: ");
 * notaPSP = sc.nextInt();
 * 
 * System.out.println("Enter your grade for English: ");
 * notaIngles = sc.nextInt();
 * 
 * // Calculate the total average grade by adding all grades and dividing by the
 * number of subjects (6).
 * double notaTotal = ((notaAD + notaEmpresa + notaGestion + notaInterfaces +
 * notaPSP + notaIngles) / 6);
 * System.out.println("Your average grade is: " + notaTotal);
 * 
 * // Determine the meaning of each grade through if, else if, and else
 * statements.
 * if (notaTotal <= 4) {
 * // If the grade is less than or equal to 4, it is considered "Insufficient".
 * System.out.
 * println("You have failed the evaluation, your grade is INSUFFICIENT.");
 * } else if (notaTotal == 5) {
 * // A grade of 5 is considered "Sufficient".
 * System.out.println("You have passed, your grade is SUFFICIENT.");
 * } else if (notaTotal >= 6 && notaTotal <= 8) {
 * // Grades between 6 and 8 are considered "Notable".
 * System.out.println("You have passed, your grade is NOTABLE.");
 * } else if (notaTotal == 9) {
 * // A grade of 9 is considered "Outstanding".
 * System.out.println("Very good! You have passed with an OUTSTANDING grade.");
 * } else if (notaTotal == 10) {
 * // A perfect score of 10 is considered "Perfect".
 * System.out.println("Congratulations! You have achieved a PERFECT score.");
 * }
 * 
 * // The if, else if, and else statements create a flow that triggers a
 * response for each possible grade.
 * } // main
 * 
 * }
 * 
 */
