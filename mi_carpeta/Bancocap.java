import java.util.Scanner;
public class circunferencia{
	public static void main(String args[]){
	System.out.println("Ingresa la cantidad de capital que deseas ingresar al banco");
	Scanner sc = new Scanner(System.in);
	double Capital = sc.nextDouble();
	double Porcen = 0.02;
	double Cant = 0;
	double CapitalNEW;
	Cant = Porcen*Capital;
	CapitalNEW = Capital+Cant;
	System.out.println("La cantidad de ganancia es "+Cant);
	System.out.println("La cantidad de capital de total es "+CapitalNEW);
	sc.close();
	}
}