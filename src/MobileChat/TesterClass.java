package MobileChat;

import java.util.LinkedList;
import java.util.List;

public class TesterClass {

    public static void main(String args[]) {
        TSpace tupleS = new TSpace();

        List<Object> testTuple1 = new LinkedList<>();
        List<Object> testTuple2 = new LinkedList<>();
        List<Object> testTuple3 = new LinkedList<>();
        List<Object> patternTuple = new LinkedList<>();

        String testVal1 = "Hello";
        String testVal2 = "Kappa123";
        Integer testVal3 = 13;
        Integer testVal4 = 2;
        String wildCard = "*";

        testTuple1.add(testVal1);
        testTuple1.add(testVal2);
        testTuple1.add(testVal3);
        testTuple1.add(testVal4);

        testTuple2.add(testVal1);
        testTuple2.add(testVal2);
        testTuple2.add(testVal3);
        testTuple2.add(testVal4);

        testTuple3.add(testVal1);
        testTuple3.add(testVal3);

        patternTuple.add(wildCard);
        patternTuple.add(wildCard);
        patternTuple.add(testVal3);
        patternTuple.add(testVal4);

        System.out.println(testTuple1);
        System.out.println(testTuple2);
        System.out.println(testTuple3);
        System.out.println(patternTuple);

        tupleS.out("testTuple1", testTuple1);
        tupleS.out("testTuple2", testTuple2);
        tupleS.out("testTuple3", testTuple3);

        System.out.println(tupleS.inp(patternTuple));
        System.out.println(tupleS.rdp(patternTuple));
    }
}
