package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class FlyweightFactory {

    private Map<Integer, Flyweight> flyweigtCache;

    public FlyweightFactory() {

        this.flyweigtCache = new HashMap<>();
    }

    public Flyweight getFlyweight(int data) {

        Flyweight flyweight = this.flyweigtCache.get(data);

        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(data);       
            this.flyweigtCache.put(data, flyweight);
        }
        return flyweight; 
    }
}
