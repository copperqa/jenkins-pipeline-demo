public class App {

    public static void main(String[] args) throws Exception {

        while(true) {

            System.out.println("Hello Jenkins");

            Thread.sleep(30000);
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
