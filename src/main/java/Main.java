public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        long expected = 30;
        long actual = service.calculate(1_000, true);
        System.out.println(actual);
    }
}