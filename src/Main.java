public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int refillAmount = 150;

        int bonus;
        if (refillAmount > 1000) {
            bonus = refillAmount / 100;
        } else {
            bonus = 0;
        }
        int finalAmount = initialAmount + refillAmount + bonus;
        System.out.println("Итоговый счет: " + finalAmount);
        System.out.println("Бонус: " + bonus);
    }
}