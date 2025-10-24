import java.util.Scanner;
public class circunferencia{
	public static void main(String args[]){
	System.out.println("Ingresa la cantidad de radio de la circunferencia");
	Scanner sc = new Scanner(System.in);
	double rad = sc.nextDouble();
	double pi = 3.14;
	double reslon = 0;
	double area = 0;
	reslon = (2*pi)*rad;
	area = pi*(rad*rad);
	System.out.println("La cantidad de longitud es "+reslon);
	System.out.println("La cantidad de area es "+area);
	sc.close();
	}
}