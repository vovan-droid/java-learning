package org.vova.dmdev.level2.block4;

public class Task3 {

    public static void main(String[] args) {
        String result = nameInitials("Fyodor", "Lysenko", "Petrovich");
        System.out.println(result);
    }

    public static String nameInitials(String firstName, String lastName, String patronymicName) {
        char firstNameChar = firstName.charAt(0);
        char lastNameChar = lastName.charAt(0);
        char patronymicNameChar = patronymicName.charAt(0);
        return lastNameChar + "." + firstNameChar + "." + patronymicNameChar;
    }
}
