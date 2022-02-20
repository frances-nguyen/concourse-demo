import functions.HelloWorld;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldTest {
  
  private final HelloWorld helloWorld = new HelloWorld();
  
  @Test
  public void shouldReturnHelloWorld(){
    String str = helloWorld.helloWorld();
    assertThat(str).isEqualTo("Hello World");
  }
}
