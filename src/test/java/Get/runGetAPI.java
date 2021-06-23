package Get;


import junit5.Karate;

public class runGetAPI {
    @Karate.Test
    Karate testGet(){return Karate.run().relativeTo(getClass());}
}
