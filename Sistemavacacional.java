import java.util.Scanner;
public class Sistemavacacional
{
    public static void main (String Args [])
    {
        Scanner go = new Scanner(System.in);
        String nombre = "";
        int clave = 0; 
        int antiguedad = 0;
        
        System.out.println("_____________________________________________________");
        System.out.println("|   Bienvenidos al Sistema vacacional CC - Company  |");
        System.out.println("|___________________________________________________|");
        System.out.println("___________________________________________________________");
        System.out.println("Ingrese el nombre del trabajador  ");
        nombre = go.nextLine();
        System.out.println("Ingrese los anos de servicio del trabajador ");
        antiguedad = go.nextInt();
        System.out.println("Ingrese la clave del departamento del trabajador ");
        clave = go.nextInt();
       

        if (clave == 1)
        {
            if (antiguedad == 1)
            {
                System.out.println("" + nombre + " tiene derecho a 6 dias de vacaciones");
                System.out.println("");
                System.out.println("");
                System.out.println("      ***     ***");
                System.out.println("      |0|     |0|");
                System.out.println("      ***     ***");
                System.out.println("   ");
                System.out.println("          ****");
                System.out.println("");
                System.out.println("    ||              ||");
                System.out.println("     ||            ||");
                System.out.println("      ||          ||");
                System.out.println("        ||||||||||");
                System.out.println("");
                System.out.println("");
            } else if (antiguedad >= 2 && antiguedad <= 6 )
            {
                System.out.println ("" + nombre + " tiene derecho a 14 dias de vacaciones");
                System.out.println("");
                System.out.println("");
                System.out.println("      ***     ***");
                System.out.println("      |0|     |0|");
                System.out.println("      ***     ***");
                System.out.println("   ");
                System.out.println("          ****");
                System.out.println("");
                System.out.println("    ||              ||");
                System.out.println("     ||            ||");
                System.out.println("      ||          ||");
                System.out.println("        ||||||||||");
                System.out.println("");
                System.out.println("");
            } else if (antiguedad == 7)
            {
                System.out.println ("" + nombre + " tiene derecho a 20 dias de vacaciones");
                System.out.println("");
                System.out.println("");
                System.out.println("      ***     ***");
                System.out.println("      |0|     |0|");
                System.out.println("      ***     ***");
                System.out.println("   ");
                System.out.println("          ****");
                System.out.println("");
                System.out.println("    ||              ||");
                System.out.println("     ||            ||");
                System.out.println("      ||          ||");
                System.out.println("        ||||||||||");
                System.out.println("");
                System.out.println("");
            } else
            {
                System.out.println ("" + nombre + "  aun no tiene derecho a vacaciones");
            } 
        } else if (clave == 2)
        {
            if (antiguedad ==1)
            {
                System.out.println ("" + nombre + " Tiene derecho a 7 dias de vacaciones");
                System.out.println("");
                System.out.println("");
                System.out.println("      ***     ***");
                System.out.println("      |0|     |0|");
                System.out.println("      ***     ***");
                System.out.println("   ");
                System.out.println("          ****");
                System.out.println("");
                System.out.println("    ||              ||");
                System.out.println("     ||            ||");
                System.out.println("      ||          ||");
                System.out.println("        ||||||||||");
                System.out.println("");
                System.out.println("");
            } else if (antiguedad >= 2 && antiguedad <=6)
            {
                System.out.println ("" + nombre + " tiene derecho a 15 dias de vacaciones");
                System.out.println("");
                System.out.println("");
                System.out.println("      ***     ***");
                System.out.println("      |0|     |0|");
                System.out.println("      ***     ***");
                System.out.println("   ");
                System.out.println("          ****");
                System.out.println("");
                System.out.println("    ||              ||");
                System.out.println("     ||            ||");
                System.out.println("      ||          ||");
                System.out.println("        ||||||||||");
                System.out.println("");
                System.out.println("");
            } else if (antiguedad == 7)
            {
                System.out.println("" + nombre + " tiene derecho a 22 dias de vacaciones");
                System.out.println("");
                System.out.println("");
                System.out.println("      ***     ***");
                System.out.println("      |0|     |0|");
                System.out.println("      ***     ***");
                System.out.println("   ");
                System.out.println("          ****");
                System.out.println("");
                System.out.println("    ||              ||");
                System.out.println("     ||            ||");
                System.out.println("      ||          ||");
                System.out.println("        ||||||||||");
                System.out.println("");
                System.out.println("");
            } else 
            {
                System.out.println("" + nombre + " aun no tiene derecho a vacaciones");
            }

        } else if (clave ==3)
        {
            if (antiguedad == 1)
            {
                System.out.println("" + nombre + "tiene derecho a 10 dias de vacaciones");System.out.println("");
                System.out.println("");
                System.out.println("      ***     ***");
                System.out.println("      |0|     |0|");
                System.out.println("      ***     ***");
                System.out.println("   ");
                System.out.println("          ****");
                System.out.println("");
                System.out.println("    ||              ||");
                System.out.println("     ||            ||");
                System.out.println("      ||          ||");
                System.out.println("        ||||||||||");
                System.out.println("");
                System.out.println("");

            } else if (antiguedad >= 2 && antiguedad <=6)
            {
                System.out.println(""+ nombre + " tiene derecho a 20 dias de vacaciones");
                System.out.println("");
                System.out.println("");
                System.out.println("      ***     ***");
                System.out.println("      |0|     |0|");
                System.out.println("      ***     ***");
                System.out.println("   ");
                System.out.println("          ****");
                System.out.println("");
                System.out.println("    ||              ||");
                System.out.println("     ||            ||");
                System.out.println("      ||          ||");
                System.out.println("        ||||||||||");
                System.out.println("");
                System.out.println("");
            } else if (antiguedad ==7)
            {
                System.out.println("" + nombre + " tiene derecho a 30 dias de vacaciones");
                System.out.println("");
                System.out.println("");
                System.out.println("      ***     ***");
                System.out.println("      |0|     |0|");
                System.out.println("      ***     ***");
                System.out.println("   ");
                System.out.println("          ****");
                System.out.println("");
                System.out.println("    ||              ||");
                System.out.println("     ||            ||");
                System.out.println("      ||          ||");
                System.out.println("        ||||||||||");
                System.out.println("");
                System.out.println("");
            } else 
            {
                System.out.println("" + nombre + " aun no tiene derecho a vacaciones");
            } 

        } else 
        {
            System.out.println("Lo sentimos la clave del departamento ingresada NO existe");
            System.out.println("");
            System.out.println("      ***     ***");
            System.out.println("      |0|     |0|");
            System.out.println("      ***     ***");
            System.out.println("   ");
            System.out.println("          ****");
            System.out.println("");
            System.out.println("        ||||||||||");
            System.out.println("      ||          ||");
            System.out.println("     ||            ||");
            System.out.println("    ||              ||");
            System.out.println("");
            System.out.println("");
        }
    }
}