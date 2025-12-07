package org.vova.dmdev.level2.block5;

public class ATMExercise2 {
    private int banknote10Amount;
    private int banknote20Amount;
    private int banknote50Amount;

    ATMExercise2(int banknote10Amount, int banknote20Amount, int banknote50Amount) {
        this.banknote10Amount = banknote10Amount;
        this.banknote20Amount = banknote20Amount;
        this.banknote50Amount = banknote50Amount;
    }

    public int getBanknote10Amount() {
        return banknote10Amount;
    }
    public int getBanknote20Amount() {
        return banknote20Amount;
    }
    public int getBanknote50Amount() {
        return banknote50Amount;
    }

    public void addBanknotes10ToATM(int addAmount) {
        this.banknote10Amount += addAmount;
    }

    public void addBanknotes20ToATM(int addAmount) {
        this.banknote20Amount += addAmount;
    }

    public void addBanknotes50ToATM(int addAmount) {
        this.banknote50Amount += addAmount;
    }

    public boolean moneyWithdraw(int amountToWithdraw) {
        if (amountToWithdraw <= 0 || amountToWithdraw % 10 != 0) {
            return false;
        }
        int need50 = Math.min(amountToWithdraw / 50, banknote50Amount);
        int remaining = amountToWithdraw - need50 * 50;

        int need20 = Math.min(remaining / 20, banknote20Amount);
        remaining -= need20 * 20;

        int need10 = Math.min(remaining / 10, banknote10Amount);
        remaining -= need10 * 10;

        if (remaining != 0) {
            System.out.println("Невозможно выдать сумму " + amountToWithdraw);
            return false;
        }
        banknote50Amount -= need50;
        banknote20Amount -= need20;
        banknote10Amount -= need10;

        System.out.println("Выдано: 50 x " + need50 + ", 20 x " + need20 + ", 10 x " + need10);
        return true;
    }
}
