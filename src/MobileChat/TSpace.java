package MobileChat;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TSpace {

    private Map<String, List<String>> tupleSpace;
    private String wildCardVal = "*";

    public TSpace(){
        tupleSpace = new LinkedHashMap<>();
    }

    /**
     * adds a tuple to the space if it does not already exist
     * this is the worst given method name ever
     * @param key string value used to directly pull the tuple
     * @param tuple list of object values that define the tuple
     */
    public void out(String key, List<String> tuple) {
        boolean exists = false;
        for(String tempKey : tupleSpace.keySet()) {
            List<String> tempValue = tupleSpace.get(tempKey);
            if (tuple.equals(tempValue)) {
                exists = true;
            }
        }
        if (!exists) {
            tupleSpace.put(key, tuple);
        }
    }

    /**
     * removes a tuple matching the pattern and returns it
     * this method name also sucks
     * @param pattern list of object values
     * @return tuple that matches the pattern
     */
    public List<String> inp(List<String> pattern) {
        int counter = 0;
        for(String key : tupleSpace.keySet()) {
            List<String> value = tupleSpace.get(key);
            if(pattern.size() == value.size()) {
                for(int i = 0; i < pattern.size(); i++) {
                    if(pattern.get(i).equals(wildCardVal)) {
                        counter++;
                    } else if (pattern.get(i).equals(value.get(i))) {
                        counter++;
                    }
                }
                if(counter == pattern.size()) {
                    return tupleSpace.remove(key);
                }
            }
        }
        return null;
    }

    /**
     * returns a tuple matching the pattern to the user
     * this method name is just as bad
     * @param pattern list of object values
     * @return tuple that matches the pattern
     */
    public List<String> rdp(List<String> pattern) {
        int counter = 0;
        for(String key : tupleSpace.keySet()) {
            List<String> value = tupleSpace.get(key);
            if(pattern.size() == value.size()) {
                for(int i = 0; i < pattern.size(); i++) {
                    if(pattern.get(i).equals(wildCardVal)) {
                        counter++;
                    } else if (pattern.get(i).equals(value.get(i))) {
                        counter++;
                    }
                }
                if(counter == pattern.size()) {
                    return tupleSpace.get(key);
                }
            }
        }
        return null;
    }
}
