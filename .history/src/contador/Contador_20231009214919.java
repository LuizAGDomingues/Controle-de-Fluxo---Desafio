package contador;
import java.util.Scanner;
import exceptions.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			
			try {
				//chamando o método contendo a lógica de contagem
				contar(parametroUm, parametroDois);
			}catch (ParametrosInvalidosException e) {
				//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
				System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			}
		}
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois){
			System.err.println("O segundo parâmetro deve ser maior que o primeiro");
		} else{
			int contagem = parametroDois - parametroUm;
			for(int index = 0; index < contagem; index++){
				System.out.println("Imprimindo o número " + (index + 1));
			}
		}
	}
}