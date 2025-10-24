import java.util.Scanner;
public class PromedioMat{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int i = 0;
	double mat1=0,mat2=0,mat3=0;
 	while(i<1){
	System.out.println("Ingresa tu promedio de las 3 materias");
	mat1 = sc.nextDouble();
	mat2 = sc.nextDouble();
	mat3 = sc.nextDouble();
	double total = 0;
	total = mat1+mat2+mat3;
	double Promedio = 0;
	Promedio = (total/30)*10;
	System.out.println("Tu primer promedio es "+mat1+" ,el segundo es  "+mat2+" ,el tercero es "+mat3);
	System.out.println("Tu promedio general es "+Promedio);
	System.out.println("Ingresa 0 si quires saber tu promedio o ingresa 1 para finalizar tu sesion");
	i = sc.nextInt();
	}
	
		sc.close();
	}
}