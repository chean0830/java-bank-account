import java.util.List;

public class Controller {
    
    private BankAccount bankAccount;
    private View view;

    public Controller(BankAccount bankAccount, View view) {
        this.bankAccount = bankAccount;
        this.view = view;
    }

    public void showBalance() {
        int balance = bankAccount.getBalance();
        view.showMain("", balance);
    }

    public void showHistory() {
        List<String> transactions = bankAccount.getTransactions();
        view.showHistory(transactions);
    }

    public void depositMoney(int amount) {
        bankAccount.deposit(amount);
        int balance = bankAccount.getBalance();
        view.showMain(
            "성공적으로 " + amount + "원을 입금했습니다",
            balance
        );
    }

    public void withdrawMoney(int amount) {
        bankAccount.withdraw(amount);
        int balance = bankAccount.getBalance();
        view.showMain(
            "성공적으로 " + amount + "원을 출금했습니다",
            balance
        );
    }

    public void transferMoney(String name, int amount) {
        bankAccount.transfer(name, amount);
        int balance = bankAccount.getBalance();
        view.showMain(
            "성공적으로 " + name + "님께" + amount + "원을 송금하였습니다",
            balance
        );
    }
}
