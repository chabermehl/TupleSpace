package MobileChat;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TextInterface {

    TSpace tupleSpace = new TSpace();
    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        TextInterface textI = new TextInterface();
    }

    private void addUser(String name, List<Object> attributes) {
        tupleSpace.out(name, attributes);
    }
}
