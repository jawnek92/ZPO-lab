package zad1;

import org.junit.Test;

import java.text.Collator;
import java.util.Locale;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
        String[] properNames = {"Agnieszka", "Bolek", "Łukasz", "Órszula", "Stefania",
                "Ścibor", "Zyta"};

        /*Sort string test poprawnosci*/
        String[] names = {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka",
                "Zyta", "Órszula"};
        Main.sortStrings(Collator.getInstance(new Locale("pl")), names);
        assertArrayEquals(properNames, names);

        /*Fast sort strings with anonymous comparator*/
        String[] names1 = {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka",
                "Zyta", "Órszula"};
        Main.fastSortStrings(Collator.getInstance(new Locale("pl")), names1);
        assertArrayEquals(properNames, names1);

        /*Fast sort strings with lambda */
        String[] names2 = {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka",
                "Zyta", "Órszula"};
        Main.fastSortStrings2(Collator.getInstance(new Locale("pl")), names2);
        assertArrayEquals(properNames, names2);
    }

    @Test
    public void test1() {
        String[] names = {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka",
                "Zyta", "Órszula"};

        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }
        System.out.println("===================");
        Main.sortStrings(Collator.getInstance(new Locale("pl")), names);
        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }
        System.out.println("===================");
    }
    @Test
    public void test2(){

        String[] names = {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka",
                "Zyta", "Órszula"};
        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }
        System.out.println("===================");
        Main.fastSortStrings(Collator.getInstance(new Locale("pl")), names);
        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }
        System.out.println("===================");

    }
    @Test
    public void test3(){

        String[] names = {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka",
                "Zyta", "Órszula"};
        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }
        System.out.println("===================");
        Main.fastSortStrings2(Collator.getInstance(new Locale("pl")), names);
        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }
        System.out.println("===================");

    }

    @Test
    public void testWyd1(){
        for (int i = 0; i < 1000; i++) {
            String[] names = {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka",
                    "Zyta", "Órszula"};
            Main.sortStrings(Collator.getInstance(new Locale("pl")), names);
        }
    }
    @Test
    public void testWyd2(){
        for (int i = 0; i < 1000; i++) {
            String[] names = {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka",
                    "Zyta", "Órszula"};
            Main.fastSortStrings(Collator.getInstance(new Locale("pl")), names);
        }
    }
    @Test
    public void testWyd3(){
        for (int i = 0; i < 1000; i++) {
            String[] names = {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka",
                    "Zyta", "Órszula"};
            Main.fastSortStrings2(Collator.getInstance(new Locale("pl")), names);
        }
    }
}
