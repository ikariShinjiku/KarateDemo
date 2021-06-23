package Get;

import com.intuit.karate.junit5.Karate;

public class runGetAPI {
    @Karate.Test
    Karate testGet(){return Karate.run().relativeTo(getClass());}
}
