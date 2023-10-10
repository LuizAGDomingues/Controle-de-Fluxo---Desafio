package exceptions;

public class ParametrosInvalidosException extends Exception {
  public ParametrosInvalidosException() {
    super("Os parâmetros estão inválidos.");
  }

  public ParametrosInvalidosException(String mensagem) {
    super(mensagem);
  }
}
