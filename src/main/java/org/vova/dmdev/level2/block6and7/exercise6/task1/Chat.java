package org.vova.dmdev.level2.block6and7.exercise6.task1;

public class Chat implements Comparable<Chat> {
    private String name;
    private int amountOfUsers;

    public Chat(String name, int amountOfUsers) {
        this.name = name;
        this.amountOfUsers = amountOfUsers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfUsers() {
        return amountOfUsers;
    }

    public void setAmountOfUsers(int amountOfUsers) {
        this.amountOfUsers = amountOfUsers;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", amountOfUsers=" + amountOfUsers +
                '}';
    }

    @Override
    public int compareTo(Chat o) {
        return this.name.compareTo(o.name);
    }
}
