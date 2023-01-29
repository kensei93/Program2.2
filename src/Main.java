public class Main {
    public static void main(String[] args) {

        int score = 100; // Счет клиента
        int deposit = 1000; // депозит

        int bonus;

        if (deposit > 1000) {
            bonus = deposit/100;
        } else {
            bonus = 0;
        }
        int all = score + deposit + bonus;
        System.out.println("Ваш счет общий счет:" + all + "руб");
        System.out.println("Ваш бонус:" + bonus + "руб");
    }
}