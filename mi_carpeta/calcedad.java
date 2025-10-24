import java.util.Scanner;
public class calcedad{
	public static void main(String args[]){
	System.out.println("Ingresa tu año de naciemiento");
	Scanner sc = new Scanner(System.in);
	int año = sc.nextInt();
	int edad1 = 0;
	int edad2 = 0;
	System.out.println("ingresa el numero de mes de tu nacimiento");
	int mes = sc.nextInt();
	edad1 = 2025-año;
	edad2 = mes/10;
	if(edad2>=1){
	edad1 = edad1+1;
	System.out.println("tu edad es "+edad1);
	} else {
	System.out.println("Tu edad es "+edad1);
	}
	sc.close();
	}
}