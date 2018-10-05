package MobileChat;

import java.util.Scanner;

public class TextInterface {

    TSpace tupleSpace = new TSpace();
    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        TextInterface textI = new TextInterface();
        textI.initializeChat();
    }

    private void addUser(String name) {
        tupleSpace.out(name, null);
    }

    private void initializeChat() {
        tupleSpace.out("System", null);
        System.out.println("SYSTEM COMMANDS\nADD USER <name>\n");
        System.out.println("USER COMMANDS\nOFFLINE\nONLINE\nPRINT ALL USERS\n" +
                "PRINT ACTIVE USERS\nSEND\n");
    }

    private void allUsers() {

    }
}
