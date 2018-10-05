/*
Charles Habermehl
10-5-2018
Mobile Chat
used purely for testing
 */
package MobileChat;

import java.util.LinkedList;
import java.util.List;

public class TesterClass {

    public static void main(String args[]) {
        TSpace tupleS = new TSpace();

        List<String> testTuple1 = new LinkedList<>();
        List<String> testTuple2 = new LinkedList<>();
        List<String> testTuple3 = new LinkedList<>();
        List<String> patternTuple = new LinkedList<>();
        List<String> patternTuple1 = new LinkedList<>();

        String testVal1 = "Hello";
        String testVal2 = "Kappa123";
        String testVal3 = "13";
        String testVal4 = "2";
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

        patternTuple1.add(testVal1);
        patternTuple1.add(wildCard);
        patternTuple1.add(testVal3);
        patternTuple1.add(wildCard);

        System.out.println(testTuple1);
        System.out.println(testTuple2);
        System.out.println(testTuple3);
        System.out.println(patternTuple);
        System.out.println(patternTuple1);

        tupleS.out("testTuple1", testTuple1);
        tupleS.out("testTuple2", testTuple2);
        tupleS.out("testTuple3", testTuple3);

//        System.out.println(tupleS.rdp(patternTuple));
//        System.out.println(tupleS.inp(patternTuple));
//        System.out.println(tupleS.inp(patternTuple));
//        System.out.println(tupleS.rdp(patternTuple));

        System.out.println(tupleS.rdp(patternTuple1));
        System.out.println(tupleS.inp(patternTuple1));
        System.out.println(tupleS.inp(patternTuple1));
        System.out.println(tupleS.rdp(patternTuple1));

    }
}
