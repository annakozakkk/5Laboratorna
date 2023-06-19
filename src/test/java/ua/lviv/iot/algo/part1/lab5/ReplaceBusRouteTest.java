package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


class ReplaceBusRouteTest {

    private ReplaceBusRoute replaceBusRoute = new ReplaceBusRoute();
    @BeforeEach
    public void setUp(){
        replaceBusRoute = new ReplaceBusRoute();
    }

    @Test
    public void testIfStringMatchPattern() {
        String input = "I am waiting for bus #45";
        List<String> actualOutput = replaceBusRoute.changeNumbersToBUS_UNKNOWN(input);

        for (String s : actualOutput) {
            Assertions.assertEquals("I am waiting for bus #BUS_UNKNOWN", s);
        }
    }

    @Test
    public void testIfStringIsEmpty() {
        String input = "";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            replaceBusRoute.changeNumbersToBUS_UNKNOWN(input);
        });
    }

    @Test
    public void testIfStringDoesNotMatchPattern() {
        String input = "I am waiting for bus#334A";
        List<String> actualOutput = replaceBusRoute.changeNumbersToBUS_UNKNOWN(input);
        for (String s : actualOutput) {
            Assertions.assertEquals("I am waiting for bus#334A", s);
        }
    }

    @Test
    public void testIfMoreThanOneSubstringMatchPattern() {
        String input = "I am waiting for bus #333 or bus #23";
        List<String> actualOutput = replaceBusRoute.changeNumbersToBUS_UNKNOWN(input);
        for (String s : actualOutput) {
            Assertions.assertEquals("I am waiting for bus #BUS_UNKNOWN or bus #BUS_UNKNOWN", s);
        }
    }
}
