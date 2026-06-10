import java.util.Scanner;

public class Commandhandler {
    
    private Controller controller;
    private Scanner scanner;

    public Commandhandler(Controller controller, Scanner scanner) {
        this.controller = controller;
        this.scanner = scanner;
    }

    public void run() {

        controller.showBalance();

        while (true) {
            System.out.print("bank> ");
            String UserInput = scanner.nextLine().trim();
            String[] parseInput = UserInput.split(" ", 2);

            String command = parseInput[0];
            String arg = parseInput.length > 1 ? parseInput[1] : "";

            try {
                switch (command) {
                    case "main" :
                        controller.showBalance();
                        break;
                    case "history" :
                        controller.showHistory();
                        break;
                    case "exit" : 
                        System.out.println("앱을 종료합니다");
                        return;
                    case "save" : 
                        controller.depositMoney(Integer.parseInt(arg));
                        break;
                    case "take" :
                        controller.withdrawMoney(Integer.parseInt(arg));
                        break;
                    case "send" :
                        String[] sendArgs = arg.split(" ");
                        String name = sendArgs[0];
                        int amount = Integer.parseInt(sendArgs[1]);

                        controller.transferMoney(name, amount);
                        break;

                    default : 
                    System.out.println("잘못된 명령어");
                }
            } catch (Exception e) {
                System.out.println("오류: " + e.getMessage());
            }
        }
    }
}
