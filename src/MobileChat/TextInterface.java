package MobileChat;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TextInterface {

    TSpace tupleSpace = new TSpace();
    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        TextInterface textI = new TextInterface();
        textI.initializeChat();
    }

    private void addUser(String name) {
        List<Object> attr = new LinkedList<>();
        tupleSpace.out(name, attr);
    }

    private void initializeChat() {
        systemAttr.add("Online");
        tupleSpace.out("System", systemAttr);
        System.out.println("SYSTEM COMMANDS\nADD USER <name>\n");
        System.out.println("USER COMMANDS\nOFFLINE\nONLINE\nPRINT ALL USERS\n" +
                "PRINT ACTIVE USERS\nSEND\n");
    }

    private void allUsers() {
    }
}
