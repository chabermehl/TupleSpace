package MobileChat;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TextInterface {

    TSpace tupleSpace = new TSpace();
    Scanner scanner = new Scanner(System.in);
    List<Object> systemMessages = new LinkedList<>();

    public static void main(String args[]) {
        TextInterface textI = new TextInterface();
        textI.initializeChat();
    }

    private void addUser(String name) {
        List<Object> messages = new LinkedList<>();
        tupleSpace.out(name, messages);
    }

    private void initializeChat() {
        systemMessages.add("Online");
        tupleSpace.out("System", systemMessages);
        System.out.println("SYSTEM COMMANDS\nADD USER <name>\n");
        System.out.println("USER COMMANDS\nOFFLINE\nONLINE\nPRINT ALL USERS\n" +
                "PRINT ACTIVE USERS\nSEND\nALL MESSAGES\n");
    }

    private void allUsers() {

    }
}
