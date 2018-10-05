package MobileChat;

import java.util.List;

public class TextInterface {

    TSpace tupleSpace = new TSpace();

    public static void main(String args[]) {

    }

    private void addUser(String name, List<Object> attributes) {
        tupleSpace.out(name, attributes);
    }
}
