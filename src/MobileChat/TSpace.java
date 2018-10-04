package MobileChat;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class TSpace {

    private Map<String, LinkedList<Object>> tupleSpace;

    public TSpace(){
        tupleSpace = new LinkedHashMap<>();
    }

    /**
     * adds a tuple to the space if it does not already exist
     * this is the worst given method name ever
     * @param key string value used to directly pull the tuple
     * @param tuple list of object values that define the tuple
     */
    public void out(String key, LinkedList<Object> tuple) {

    }

    /**
     * removes a tuple matching the pattern and returns it
     * this method name also sucks
     * @param pattern list of object values
     * @return tuple that matches the pattern
     */
    public LinkedList<Object> inp(LinkedList<Object> pattern) {
        return pattern;
    }

    /**
     * returns a tuple matching the pattern to the user
     * this method name is just as bad
     * @param pattern list of object values
     * @return tuple that matches the pattern
     */
    public LinkedList<Object> rdp(LinkedList<Object> pattern) {
        return pattern;
    }
}
