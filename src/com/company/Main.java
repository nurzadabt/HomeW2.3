package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccaunt bankAccaunt = new BankAccaunt();
        bankAccaunt.deposit(10000);

        for (int i = 0; ; i++) {
            try {
                bankAccaunt.withDraw(6000);


            } catch (LimitException e) {
                System.out.println("У вас еще есть деньги   " + bankAccaunt.getAmount());

                bankAccaunt.withDraw((int) bankAccaunt.getAmount());

                System.out.println(e.getMessage());
                System.out.println("======================================================");
                System.out.println("Ваш счет составляет " + bankAccaunt.getAmount() + "____Пополните баланс!____");


                break;


            }

        }


    }
}
