import java.util.Scanner;
public class Tiendadesc{
	public static void main(String args[]){
	System.out.println("Ingresa la cantidad precio total de tu compra");
	Scanner sc = new Scanner(System.in);
	float Total = sc.nextFloat();
	double descuento = 0;
	descuento = 0.15*Total;
	double Totaldesc = 0;
	Totaldesc = Total-descuento;
	System.out.println("La cantidad de descuento es "+descuento);
	System.out.println("La cantidad total a pagar es "+Totaldesc);
	sc.close();
	}
}