# MultyThread
MultyThread Experiments


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
            Thread.sleep(5);
            doPrint = true;
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
    
    
    В консоль ничего не выведется, так как поток закешировал значение переменной doPrint, и не знает о том, что переменную поменяли. Что бы решить проблему нажно пометить переменную ключевым словом volatile 

