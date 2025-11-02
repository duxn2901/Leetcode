package leetcode;
import java.util.Arrays;

public class P2043SimpleBankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank(new long[]{10, 100, 20, 50, 30});
        System.out.println(bank.transfer(1,2,8));
        System.out.println(bank.withdraw(2,80));
        System.out.println(bank.deposit(3,50));
        System.out.println(bank.deposit(12,8));
        System.out.println(Arrays.toString(bank.accounts));
    }
    
}

class Bank {
    public long[] accounts;
    private int size;

    public boolean isValidAccount(int index) {
        return index > 0 && index <= size;
    }

    public Bank(long[] balance) {
        this.size = balance.length;       
        this.accounts = balance;       
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if (!isValidAccount(account1) || !isValidAccount(account2)) {
            return false;
        }
        if (money > accounts[account1 - 1]) {
            return false;
        }
        accounts[account1 - 1] -= money;
        accounts[account2 - 1] += money;       
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if (!isValidAccount(account)) return false;
        accounts[account - 1] += money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if (!isValidAccount(account)) return false;
        if (money > accounts[account - 1]) {
            return false;
        }
        accounts[account - 1] -= money;
        return true;
    }
}

