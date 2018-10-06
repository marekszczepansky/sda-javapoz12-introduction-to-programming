package matematyka;

public class DimensionNotPositiveException extends RuntimeException {
  private String message;

  public DimensionNotPositiveException(String message) {
    super(message);
    this.message = message;
  }

}
