import java.util.Scanner;
public class Sistemavacacional
{
    public static void main (String Args [])
    {
        Scanner go = new Scanner(System.in);
        String nombre = "";
        int clave = 0, antiguedad = 0;
        
        System.out.println("Bienvenidos al Sistema vacacional CC - Company");
        System.out.println("");
        System.out.println("Ingrese el nombre del trabajador ");
        nombre = go.nextLine();
        System.out.println("Ingrese los anos de servicio del trabajador ");
        antiguedad = go.nextInt();
        System.out.println("Ingrese la clave del departamento del trabajador ");
        clave = go.nextInt();


    }
}