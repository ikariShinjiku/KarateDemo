package feature;

import com.intuit.karate.junit5.Karate;
import org.testng.annotations.Test;

public class TestRunner {
    @Karate.Test
    Karate testAll(){return Karate.run().relativeTo(getClass());}
}
