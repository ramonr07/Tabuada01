import java.util.Scanner;

public class TabuadaInterativa {
	public static void main(String[] args) {
		// Criando uma vari�vel
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Qual Tabuada voc� gostaria de fazer ?");
			int tabuada = teclado.nextInt();
			
			System.out.println("Esta e a tabuada de "+tabuada);
			for(int contador=1; contador<=10; contador++) {
				int resultado = tabuada*contador;
				System.out.println(tabuada+"*"+contador+"="+resultado);
				}
		}
		System.out.println("FIM!!!");
}
}