import java.util.Scanner;
public class SalarioAum{
	public static void main(String args[]){
	System.out.println("Ingresa tu salario semanal");
	Scanner sc = new Scanner(System.in);
	double Salario = sc.nextDouble();
	double Aumento = 0.25;
	double TotalSalario = 0;
	double TotalAumento = 0;
	TotalAumento = Aumento*Salario;
	TotalSalario = Salario+TotalAumento;
	System.out.println("La cantidad de aumento es "+TotalAumento);
	System.out.println("La cantidad de salario total es "+TotalSalario);
	sc.close();
	}
}