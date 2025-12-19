package org.vova.dmdev.level2.block6.exercise6.task1;

import java.util.*;

import static org.vova.dmdev.level2.block6.exercise6.task1.ChatsUtil.deleteChatsUnder1000;

public class task1Runner {

    public static void main(String[] args) {
        Chat chat1 = new Chat("abcd", 2000);
        Chat chat2 = new Chat("dcba", 200);
        Chat chat3 = new Chat("ateo", 1000);
        Chat chat4 = new Chat("sky news", 500);
        Chat chat5 = new Chat("bbc news", 1000);
        List<Chat> list = new ArrayList<>(Arrays.asList(chat1, chat2, chat5, chat4, chat3));

        System.out.println(list);
        Collections.sort(list);

        deleteChatsUnder1000(list);
        System.out.println(list);

        Comparator<Chat> byAmountOfUsersAndName = new Comparator<Chat>() {
            @Override
            public int compare(Chat o1, Chat o2) {
                if (o1.getAmountOfUsers() == o2.getAmountOfUsers()) {
                    return o1.getName().compareTo(o2.getName());
                }
                return Integer.compare(o1.getAmountOfUsers(), o2.getAmountOfUsers()) * -1;
            }
        };

        Collections.sort(list, byAmountOfUsersAndName);
        System.out.println(list);
    }
}
