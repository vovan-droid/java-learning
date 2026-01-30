package org.vova.dmdev.level2.block6and7.exercise6.task2;

import java.util.Arrays;
import java.util.List;

public class Task2Runner {

    public static void main(String[] args) {

        User user1 = new User(1, "Alex", 17);
        User user2 = new User(2, "Bob", 27);
        User user3 = new User(3, "Charlie", 11);
        User user4 = new User(4, "Dan", 18);
        User user5 = new User(5, "Eve", 100);
        User user6 = new User(6, "Fred", 0);

        ChatUpgraded chat1 = new ChatUpgraded("Java", Arrays.asList(user1, user2, user3));
        ChatUpgraded chat2 = new ChatUpgraded("Python", Arrays.asList(user4, user5, user6));

        List<ChatUpgraded> chats = Arrays.asList(chat1, chat2);

        List<User> adults = ChatUpgradedUtil.getUsersOlderThan18(chats);
        System.out.println(adults);

        double avg = ChatUpgradedUtil.calculateAverageAge(adults);
        System.out.println(avg);
    }
}
