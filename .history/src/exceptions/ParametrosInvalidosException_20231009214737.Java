package exceptions;

public class ParametrosInvalidosException extends Exception {
  public ParametrosInvalidosException() {
    super("Os parâmetros est");
  }

  public ParametrosInvalidosException(String mensagem) {
    super(mensagem);
  }
}
