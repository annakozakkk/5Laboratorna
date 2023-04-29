package ua.lviv.iot.algo.part1.lab5;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fromConsole = in.nextLine();
        ReplaceBusRoute route = new ReplaceBusRoute();
        List<String> changed = route.changeNumbersToBUS_UNKNOWN(fromConsole);
        System.out.println(changed);
    }
}

