import static org.junit.jupiter.api.Assertions.assertEquals;
import com.temenos.t24.*;

import org.junit.jupiter.api.Test;

class JUnit5ExampleTest {

  @Test
  void justAnExample() {

    account acc = new  account();
    int result = acc.addition();
    assertEquals(2,result);
  }
}