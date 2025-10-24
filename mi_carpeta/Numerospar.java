import java.util.Scanner;
public class Numerospar
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("PUEDES DARME UN NUMERO:");
		double num = sc.nextDouble();
		
		if(num % 2 == 0)
		{
			System.out.print("EL " + String.format("%.0f",num) + "  ES: PAR");
		}
		else
		{
			System.out.print("EL NUMERO QUE ME DISTE ES IMPAR ");
		}
	}
}