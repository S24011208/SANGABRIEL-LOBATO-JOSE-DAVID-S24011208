import java.util.Scanner;
public class promAlum{
	public static void main(String args[]){
	System.out.println("Ingresa la cantidad de chicos que hay en el salon");
	Scanner sc = new Scanner(System.in);
	float Niños = sc.nextInt();
	System.out.println("Ingresa la cantidad de chicas que hay en el salon");
	float Niñas = sc.nextInt();
	float promcos = 0;
	float promcas = 100;
	float Total = 0;
	Total = Niños + Niñas;
	promcos = (Niños/Total)*100;
	promcas = promcas-promcos;
	System.out.println("El promedio de chicos es "+promcos+"%");
	System.out.println("El promedio de chicas es "+promcas+"%");
	sc.close();
	}
}