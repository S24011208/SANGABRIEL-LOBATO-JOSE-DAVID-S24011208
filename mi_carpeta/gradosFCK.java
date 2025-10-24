import java.util.Scanner;
public class gradosFCK{
	public static void main(String args[]){
	System.out.println("Ingresa la cantidad de grados centigrados");
	Scanner sc = new Scanner(System.in);
	double Cent = sc.nextDouble();
	double Kelvin = 274;
	double Farenheit = 0;
	Farenheit = (Cent/5)*9+32;
	Kelvin = Kelvin+Cent;
	System.out.println("La cantidad de grados farenheit es °"+Farenheit);
	System.out.println("La cantidad de Grados Kelvin es °"+Kelvin);
	sc.close();
	}
}