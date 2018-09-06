package zad3;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void main() {
        String string = "aksdnakwdnkahwbdkawjhdnkawjd";
        String string2 = "aksdnakwdnkahwbdkawjhdnkawjd";
        List<String> splittedString = Main.function(string, 3);
        List<String> splittedString2 = Lists.newArrayList(Splitter.fixedLength(3).split(string2));

        assertArrayEquals(splittedString.toArray(), splittedString2.toArray());
    }
}