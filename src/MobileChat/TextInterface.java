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

    /**
     * adds a user to the space with an initial state of online
     * @param name the name of the user
     */
    private void addUser(String name) {
        List<String> initialState = new LinkedList<>();
        initialState.add(name);
        initialState.add("Online");
        tupleSpace.out(name, initialState);
    }

    /**
     * Initiates the chat server with a SYSTEM user for initial commands
     */
    private void initializeChat() {
        tupleSpace.out("System", null);
        System.out.println("SYSTEM COMMANDS\nADD USER <name>\nSHUT DOWN\n");
        System.out.println("USER COMMANDS\nOFFLINE\nONLINE\nPRINT ALL USERS\n" +
                "PRINT ACTIVE USERS\nSEND\n");
    }

    /**
     * prints all of the users regardless of status
     */
    private void printAllUsers() {
        boolean userNames = true;
        List<String> pattern = new LinkedList<>();
        List<String> userName;
        pattern.add("*");
        pattern.add("*");
        while(userNames) {
            userName = tupleSpace.rdp(pattern);
            if(!(userName == null)) {
                System.out.println(userName.get(0));
                tupleSpace.out(userName.get(0), userName);
            } else {
                userNames = false;
            }
        }
    }

    /**
     * prints all of the active users
     */
    private void printActiveUsers() {
        boolean userNames = true;
        List<String> pattern = new LinkedList<>();
        List<String> userName;
        pattern.add("*");
        pattern.add("Online");
        while(userNames) {
            userName = tupleSpace.rdp(pattern);
            if(!(userName == null)) {
                System.out.println(userName.get(0));
                tupleSpace.out(userName.get(0), userName);
            } else {
                userNames = false;
            }
        }
    }
}
