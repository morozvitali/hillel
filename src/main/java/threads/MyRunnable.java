package src.main.java.threads;

public class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }


    public  void run () {
        try {
            for (int i = 50; i < 60; i++) {
                System.out.println(name + " : " + i);
                Thread.sleep(3000);
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
