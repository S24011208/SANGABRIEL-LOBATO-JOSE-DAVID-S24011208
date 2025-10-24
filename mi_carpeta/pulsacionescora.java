import java.util.Scanner;
public class pulsacionescora{
	public static void main(String args[]){
	System.out.println("Ingresa la edad de la persona");
	Scanner sc = new Scanner(System.in);
	int edad = sc.nextInt();
	double pulsaciones = 0;
	pulsaciones = (220-edad)/10;
	System.out.println("La cantidad de pulsaciones de corazones  por segundo es "+pulsaciones);
	sc.close();
	}
}