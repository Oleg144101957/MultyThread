public class Main {

    static boolean doPrint = false;

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                if(doPrint){
                    System.out.println("Ready");
                    break;
                }
            }
        }).start();

        try {
            Thread.sleep(100);
            doPrint = true;
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}
