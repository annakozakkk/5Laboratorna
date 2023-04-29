package ua.lviv.iot.algo.part1.lab5;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceBusRoute {

    private static final Pattern pattern = Pattern.compile("\\b((bus|BUS) #)\\d{1,3}\\b");

    public List<String> changeNumbersToBUS_UNKNOWN(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Input string is empty");
        }
        List<String> changed = new LinkedList<>();
        Matcher matcher = pattern.matcher(input);
        StringBuilder builder = new StringBuilder();
        while (matcher.find()) {
            matcher.appendReplacement(builder, "$1BUS_UNKNOWN");
        }
        matcher.appendTail(builder);
        String result = builder.toString();
        changed.add(result);

        return changed;
    }


}
