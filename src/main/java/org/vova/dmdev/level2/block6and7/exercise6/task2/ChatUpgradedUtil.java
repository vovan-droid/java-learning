package org.vova.dmdev.level2.block6and7.exercise6.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ChatUpgradedUtil {

    private ChatUpgradedUtil() {
    }

    public static List<User> getUsersOlderThan18(List<ChatUpgraded> chats) {
        List<User> result = new ArrayList<>();

        for (ChatUpgraded chat : chats) {
            for (User user : chat.getUsers()) {
                if (user.getAge() > 18) {
                    result.add(user);
                }
            }
        }
        return result;
    }

    public static double calculateAverageAge(List<User> users) {
        Iterator<User> iterator = users.iterator();

        int sum = 0;
        int count = 0;

        while (iterator.hasNext()) {
            User user = iterator.next();
            sum += user.getAge();
            count++;
        }

        return count == 0 ? 0 : (double) sum / count;
    }
}
