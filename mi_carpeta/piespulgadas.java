import java.util.Scanner;
public class piepulgadas{
	public static void main(String args[]){
	System.out.println("Ingresa la cantidad que deseas convertir de pies a pulgadas");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int pul=0;
	pul= a*12;
	System.out.println("La cantidad de "+a+" pies es igual a "+pul+" pulgadas.");
	sc.close();
	}
}