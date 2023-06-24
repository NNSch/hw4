public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 1000;
        long expected = 30;

        long actual = service.calculate(amount, true);
        System.out.println("1. " + expected + " == ? == " + actual);

        amount = 1_000_000;
        expected = 500;

        actual = service.calculate(amount, true);
        System.out.println("2. " + expected + " == ? == " + actual);

        amount = 1000;
        expected = 10;

        actual = service.calculate(amount, false);
        System.out.println("3. " + expected + " == ? == " + actual);

        amount = 1_000_000;
        expected = 500;

        actual = service.calculate(amount, false);
        System.out.println("4. " + expected + " == ? == " + actual);
    }
}
