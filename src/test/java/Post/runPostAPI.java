package Post;

import junit5.Karate;

public class runPostAPI {
    @Karate.Test
    Karate testGet(){return Karate.run().relativeTo(getClass());}
}
