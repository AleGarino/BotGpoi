public class BotMain {
    private static int n_bot = 0;
    public static void main(String[] args) {
        System.out.println("hello");
        Bot num1 = new Bot("Primo", 0, null, null);
        System.out.println(num1);

        BotRunnable br = new BotRunnable();
        Thread t1 = new Thread(br);
        Thread t2 = new Thread(br);

        t1.start();
        t2.start();

    }
}
