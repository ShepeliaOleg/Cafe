package cafe;

/**
 * Created by New on 23.03.14.
 */
public class Client implements Runnable {

    Cassier cassier;
    public Client(Cassier cassier) {
        this.cassier = cassier;
    }

    @Override
    public void run() {
        synchronized (cassier){
            try {
                cassier.getMeal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
