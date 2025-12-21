package org.vova.dmdev.level2.block6.exercise6.task2;

import java.util.List;

public class ChatUpgraded {
    private String name;
    private List<User> users;

    public ChatUpgraded(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "ChatUpgraded{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
