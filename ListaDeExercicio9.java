package ListaDeExerciciosPraPraticar;
import java.util.Scanner;

public class ListaDeExercicio9 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// (°F - 32) x 5/9 = °C
		
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		System.out.println("Digite a Temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		double celsius =(fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsius + "°C.");
		
				
		entrada.close();
		
	}

}
