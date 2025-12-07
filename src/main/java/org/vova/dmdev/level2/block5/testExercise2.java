package org.vova.dmdev.level2.block5;

public class testExercise2 {
    public static void main(String[] args) {
        ATMExercise2 atm = new ATMExercise2(10, 9, 8);
        atm.addBanknotes10ToATM(10);
        System.out.println(atm.getBanknote10Amount());
        atm.moneyWithdraw(230);
        System.out.println(atm.getBanknote10Amount());
        System.out.println(atm.getBanknote20Amount());
        System.out.println(atm.getBanknote50Amount());
        System.out.println(atm.moneyWithdraw(230));

    }
}
