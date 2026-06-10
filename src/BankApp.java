import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) throws Exception {
        
        BankAccount bankAccount = new BankAccount();
        View view = new View();
        Controller controller = new Controller(bankAccount, view);

        Scanner scanner = new Scanner(System.in);
        Commandhandler commandhandler = new Commandhandler(controller, scanner);

        commandhandler.run();
        scanner.close();
    }
}
