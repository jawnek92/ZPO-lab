package zad2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void replaceUsingIterator() {
        List<String> list = new ArrayList<>();
        list.add("qwertyasdfg");
        list.add("zxcvbASDFG");
        list.add("POIuYlkjHG");
        Main.replaceUsingIterator(list);

        List<String> listToBe = new ArrayList<>();
        listToBe.add("QWERTYASDFG");
        listToBe.add("ZXCVBASDFG");
        listToBe.add("POIUYLKJHG");
        assertArrayEquals(list.toArray(), listToBe.toArray());
    }

    @Test
    public void replaceUsingForLoop() {
        List<String> list = new ArrayList<>();
        list.add("qwertyasdfg");
        list.add("zxcvbASDFG");
        list.add("POIuYlkjHG");
        Main.replaceUsingForLoop(list);

        List<String> listToBe = new ArrayList<>();
        listToBe.add("QWERTYASDFG");
        listToBe.add("ZXCVBASDFG");
        listToBe.add("POIUYLKJHG");
        assertArrayEquals(list.toArray(), listToBe.toArray());
    }

    @Test
    public void replaceUsingReplaceAllMethod() {
        List<String> list = new ArrayList<>();
        list.add("qwertyasdfg");
        list.add("zxcvbASDFG");
        list.add("POIuYlkjHG");
        Main.replaceUsingReplaceAllMethod(list);

        List<String> listToBe = new ArrayList<>();
        listToBe.add("QWERTYASDFG");
        listToBe.add("ZXCVBASDFG");
        listToBe.add("POIUYLKJHG");
        assertArrayEquals(list.toArray(), listToBe.toArray());
    }
}