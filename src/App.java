public class App {
   public class Main {
 
    public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		
		double A, B, C, pi = 3.14159;
		double triangulo = 0, circulo = 0, trapezio = 0, quadrado = 0, retangulo = 0;
		
		A = leia.nextDouble();
		B = leia.nextDouble();
		C = leia.nextDouble();
		
		triangulo = (A * C) / 2;
		circulo = pi = 3.14159 * C * C;
		trapezio = ((A + B) * C) / 2;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);
	}
 
}
