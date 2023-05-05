import java.util.Scanner;

public class App {

   public class Main {
 
    public static void main(String[] args){

		Scanner leia = new Scanner(System.in);  //Inicializando scanner
		
		double A, B, C, pi = 3.14159;
		double triangulo = 0, circulo = 0, trapezio = 0, quadrado = 0, retangulo = 0;  //Inicializando os objetos
		
		A = leia.nextDouble();
		B = leia.nextDouble();             //Recebe os dados do usuário
		C = leia.nextDouble();
		
		triangulo = (A * C) / 2;           //Calcular área triangulo
		circulo = pi = 3.14159 * C * C;    //Calculo da área do circulo
		trapezio = ((A + B) * C) / 2;      //Calculo da área do trapezio
		quadrado = B * B;                  //Calculo da área do quadrado
		retangulo = A * B;                 //Calculo da área do retangulo
		
		System.out.printf("TRIANGULO: %.3f\n", triangulo);   //Área do triangulo
		System.out.printf("CIRCULO: %.3f\n", circulo);       //Área do circulo
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);     //Área do trapezio 
		System.out.printf("QUADRADO: %.3f\n", quadrado);     //Área do quadrado
		System.out.printf("RETANGULO: %.3f\n", retangulo);   //Área do retangulo
		}
 
	}
}
