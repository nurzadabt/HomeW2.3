package com.company;

public class BankAccaunt {

    private double amount;


    public BankAccaunt(double amount) {
        this.amount = amount;
    }

    public BankAccaunt() {
    }

    public double getAmount() {


        return amount;

    }


    public double deposit(double sum) {

        amount = amount + sum;
        System.out.println("Ваш счет  " + sum);
        return sum;
    }

    public void withDraw(double sum) throws LimitException {

        if (sum > amount) {
            System.out.println("==================================================");
            throw new LimitException("____Недостаточно средств для снятия!____", getAmount());
        }

        amount = amount - sum;
        System.out.println("===================================================");
        System.out.println("Остаток на счету  " + sum);


    }


}
