package zad3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MergeTest {
    String text = "FULL TIME That's one of the best games you're ever going to see. Spain showed real character to battle back twice and take the lead, but ultimately it's Ronaldo magic that steals the headlines.\n" +
            "\n" +
            "Group B is wide open now, with Spain facing Iran and Portugal taking on Morocco in the second round of group matches.";
    String[] splited = text.split(" ");
    Map<String, Integer> mapToTest = new HashMap<>();
    Map<String, Integer> mapToTest2 = new HashMap<>();
    Map<String, Integer> mapToTest3 = new HashMap<>();
    Map<String, Integer> mapToTest4 = new HashMap<>();


    @Test
    public void mainTest(){
        for(String s: splited){
            Merge.mergeContainsKey(mapToTest,s);
            Merge.mergeWithGetAndNullCheck(mapToTest2, s);
            Merge.mergeWithGetOrDefault(mapToTest3, s);
            Merge.mergePutIfAbsent(mapToTest4, s);
        }

        assertArrayEquals(mapToTest.keySet().toArray(), mapToTest2.keySet().toArray());
        assertArrayEquals(mapToTest.values().toArray(), mapToTest2.values().toArray());
        assertArrayEquals(mapToTest3.keySet().toArray(), mapToTest4.keySet().toArray());
        assertArrayEquals(mapToTest3.values().toArray(), mapToTest4.values().toArray());
        assertArrayEquals(mapToTest2.keySet().toArray(), mapToTest3.keySet().toArray());
        assertArrayEquals(mapToTest2.values().toArray(), mapToTest3.values().toArray());
        assertArrayEquals(mapToTest.keySet().toArray(), mapToTest4.keySet().toArray());
        assertArrayEquals(mapToTest.values().toArray(), mapToTest4.values().toArray());

    }



    @org.junit.Test
    public void mergeContainsKey() {
        for(String s: splited) {
            Merge.mergeContainsKey(mapToTest, s);
        }
    }

    @org.junit.Test
    public void mergeWithGetAndNullCheck() {
        for(String s: splited) {
            Merge.mergeWithGetAndNullCheck(mapToTest, s);
        }
    }

    @org.junit.Test
    public void mergeWithGetOrDefault() {
        for(String s: splited) {
            Merge.mergeWithGetOrDefault(mapToTest, s);
        }
    }

    @org.junit.Test
    public void mergePutIfAbsent() {
        for(String s: splited) {
            Merge.mergePutIfAbsent(mapToTest, s);
        }
    }
}
