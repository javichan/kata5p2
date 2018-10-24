package kata4.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 public class Histogram<T> {
    private final Map<T ,Integer> map = new HashMap<>();
    
    public int get(T Key){
        return map.get(Key);
    }
    
    public Set<T> keySet(){
        return map.keySet();
    }
    
    public void increment(T Key){
        map.put(Key, map.containsKey(Key)?map.get(Key) + 1 :1);
       }    
    
}