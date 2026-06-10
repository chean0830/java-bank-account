import java.util.ArrayList;
import java.util.List;

class BankAccount {

    private int balance;
    private List<String> transactions = new ArrayList<>();

    // 잔액
    public int getBalance() {
        return balance;
    }
    
    // 거래 내역
    public List<String> getTransactions() {
        return transactions;
    }

    // 입금
    public void deposit(int amount) {
        
        if (amount <= 0) {
            throw new IllegalStateException("입금할 수 없습니다");
        }
        balance += amount;
        transactions.add("입금: " + amount + "원");
    }

    // 출금
    public void withdraw(int amount) {

        if (amount <= 0) {
            throw new IllegalStateException("출금할 수 없습니다");
        }

        if (amount > balance) {
            throw new IllegalStateException("잔액이 부족합니다");
        }
        balance -= amount;
        transactions.add("출금: " + amount + "원");
    }

    // 송금
    public void transfer(String name, int amount) {

        if (amount <= 0) {
            throw new IllegalStateException("송금할 수 없습니다");
        }
        if (amount > balance) {
            throw new IllegalStateException("잔액이 부족합니다");
        }
        balance -= amount;
        transactions.add(name + " 님에게" + amount + "원을 송금하였습니다");
    }
}
