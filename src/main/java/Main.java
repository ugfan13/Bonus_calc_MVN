public class Main {
    public static void main(String[] args) {
// создаём объект из класса
        BonusService service = new BonusService();
// вызываем метод и результат присваиваем переменной bonus
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        boolean passed = expected == actual;

        System.out.println(passed);
    }
}