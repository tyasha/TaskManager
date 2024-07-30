package org.yakov.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {

    private static List<Integer> idList = new ArrayList<>();

    public static String getRandomId() {
        Random random = new Random();
        int id = random.nextInt(Integer.MAX_VALUE) + 1;
        while (idList.contains(id)) {
            id = random.nextInt(Integer.MAX_VALUE) + 1;
        }
        idList.add(id);
        return String.valueOf(id);
    }
}
