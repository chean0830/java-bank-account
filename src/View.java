import java.util.List;

public class View {
    
    public View() {}

    public void showMain(String message, int balance) {
        System.out.println();
        System.out.println("- Bank Account");
        System.out.println("--------------------");
        if (!message.isEmpty()) {
            System.out.println(message);
        }
        System.out.println("현재 잔액: " + balance + "원");
        System.out.println("--------------------");
        System.out.println("예금: save 금액|출금: take 금액|송금: send 아이디 금액");
        System.out.println("거래내역: history|종료: exit");
    }

    public void showHistory(List<String> transactions) {
        System.out.println();
        System.out.println("- 거래 내역");
        System.out.println("--------------------");
        
        if (transactions.size() < 1) {
            System.out.println("거래 내역이 없습니다");
        } else {
            for (int i = 0; i < transactions.size(); i++) {
                System.out.println((i + 1) + ". " + transactions.get(i));
            }
        }

        System.out.println("돌아가기: main|종료: exit");
    }
}
