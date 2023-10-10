package exceptions;

public class ParametrosInvalidosException extends Exception {
  public ParametrosInvalidosException() {
    super("Esta é uma exceção personalizada.");
  }

  public ParametrosInvalidosException(String mensagem) {
      super(mensagem);
    }
}
