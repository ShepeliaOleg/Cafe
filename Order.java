package cafe;

/**
 * Created by New on 01.04.14.
 */
public class Order implements Runnable{


    @Override
    public void run() {
        System.out.println("New order - 10 dish");
    }
}
