
public class OptimizaionLambda {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("bye");
            }
            try {
                Thread.sleep(100, 0);
            } catch (Exception e) {

            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("bye");
            }
            try {
                Thread.sleep(100, 0);
            } catch (Exception e) {

            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("is threas alive" + t1.isAlive());
        System.out.println("hey there");
    }

}
