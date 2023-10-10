package exceptions;

public class ParametrosInvalidosException extends Exception {
  public MinhaExcecaoPersonalizada() {
        super("Esta é uma exceção personalizada.");
    }

  public MinhaExcecaoPersonalizada(String mensagem) {
        super(mensagem);
    }
}
