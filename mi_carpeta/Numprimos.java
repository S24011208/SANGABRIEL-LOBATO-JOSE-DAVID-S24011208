import java.util.Scanner;
public class Numprimos
{
	public static void main(String args[])
	{
		Scanner yay = new Scanner(System.in);
		System.out.print( "PUEDES DARME UN NUMERO:");
		double num = yay.nextDouble();
		
		if(num / num == 1 || num / 1 == num)
		{
			System.out.print("EL " + String.format("%.0f",num) + " ES UN NUMERO PRIMO");
		}
		else
		{
			System.out.print("EL NUMERO QUE MEDISTE NO ES UN NUMERO PRIMO");
		}
	}
}