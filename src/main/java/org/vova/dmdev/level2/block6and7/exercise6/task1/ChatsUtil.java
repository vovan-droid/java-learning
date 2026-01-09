package org.vova.dmdev.level2.block6and7.exercise6.task1;

import java.util.Iterator;
import java.util.List;

public final class ChatsUtil {

    private ChatsUtil() {
    }

    public static void deleteChatsUnder1000(List<Chat> chats){
        Iterator<Chat> iterator = chats.iterator();

        while(iterator.hasNext()){
            Chat current = iterator.next();
            if (current.getAmountOfUsers() < 1000) {
                iterator.remove();
            }
        }
    }
}
