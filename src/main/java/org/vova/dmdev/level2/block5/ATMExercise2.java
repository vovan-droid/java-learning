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
        this.banknote50Amount = this.banknote50Amount - (amountToWithdraw / 50);
        this.banknote20Amount = this.banknote20Amount - (amountToWithdraw % 50 / 20);
        this.banknote10Amount = this.banknote10Amount - (amountToWithdraw % 50 % 20 / 10);

        if (this.banknote10Amount < 0 || this.banknote20Amount < 0 || this.banknote50Amount < 0) {
            return false;
        }
        return true;
    }
}
