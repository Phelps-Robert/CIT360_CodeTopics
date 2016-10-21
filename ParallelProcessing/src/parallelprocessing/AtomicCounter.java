
package parallelprocessing;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    AtomicInteger value = new AtomicInteger();
    
    public int next() {
        return value.incrementAndGet();
    }
}
