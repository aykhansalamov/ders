package org.example.lesson13;

public class BankAccount {

    //Field private elan olunur ve birbasha elchatan olmur
    private double balance;

    private double sendingMoney;

    private String owner;


        public double getBalance() {
            // Getter - balansi oxumaq uchun
            return balance;
        }

        public String getOwner() {
            return owner;
        }

        // Setter - balansi set etmek (teyin etmek) uchun
        public double setBalance(double userDaxilEtdiyiMebleg) {
            this.sendingMoney = userDaxilEtdiyiMebleg;
            return sendingMoney;
        }
    }
