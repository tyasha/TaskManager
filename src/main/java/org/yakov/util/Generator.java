package org.yakov.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    private static List<String> idList = new ArrayList<>();

    public static String getRandomId(Object object) {
        Random random = new Random();

        int number = random.nextInt(Integer.MAX_VALUE) + 1;
        String prefName = object.getClass().getSimpleName().substring(0, 3);
        String id = prefName + "_" + number;

        while (idList.contains(id)) {
            number = random.nextInt(Integer.MAX_VALUE) + 1;
            id = prefName + "_" + number;
        }

        idList.add(id);
        return id;
    }
}
