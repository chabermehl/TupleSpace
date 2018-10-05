package MobileChat;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TextInterface {

    private TSpace tupleSpace = new TSpace();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        TextInterface textI = new TextInterface();
        textI.initializeChat();

        boolean shutDown = false;
        String systemCommand;
        while(!shutDown) {
            System.out.println("System: \n");
            systemCommand = textI.scanner.nextLine();
            if(systemCommand.contains("ADD USER")) {
                systemCommand = systemCommand.replace("ADD USER ", "");
                textI.addUser(systemCommand);
            } else if(systemCommand.contains("SHUT DOWN")) {
                shutDown = true;
            }
            textI.printActiveUsers();
            textI.printAllUsers();
        }
    }

    /**
     * adds a user to the space with an initial state of online
     * @param name the name of the user
     */
    private void addUser(String name) {
        List<String> initialState = new LinkedList<>();
        initialState.add(name);
        initialState.add("Online");
        System.out.println("init" + initialState);
        tupleSpace.out(name, initialState);
    }

    /**
     * Initiates the chat server with a SYSTEM user for initial commands
     */
    private void initializeChat() {
        List<String> baseAttr = new LinkedList<>();
        baseAttr.add("System");
        baseAttr.add("Online");
        tupleSpace.out("System", baseAttr);
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
        List<String> printed = new LinkedList<>();
        List<String> userName;
        pattern.add("*");
        pattern.add("Online");
        while(userNames) {
            userName = tupleSpace.rdp(pattern);
            if(!(userName == null || printed.contains(userName.get(0)))) {
                System.out.println(userName.get(0));
                printed.add(userName.get(0));
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
        List<String> printed = new LinkedList<>();
        List<String> userName;
        pattern.add("*");
        pattern.add("Online");
        while(userNames) {
            userName = tupleSpace.rdp(pattern);
            if(!(userName == null || printed.contains(userName.get(0)))) {
                System.out.println(userName.get(0));
                printed.add(userName.get(0));
            } else {
                userNames = false;
            }
        }
    }

    private void moveThroughActive() {
        boolean userNames = true;
        String userCommand;
        List<String> pattern = new LinkedList<>();
        List<String> userName;
        pattern.add("*");
        pattern.add("Online");
        while(userNames) {
            userName = tupleSpace.rdp(pattern);
            if(!(userName == null)) {
                System.out.println(userName.get(0));
                userCommand = scanner.nextLine();
            } else {
                userNames = false;
            }
        }
    }
}
