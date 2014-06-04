package cafe;

/**
 * Created by New on 01.04.14.
 */
public class Kitchen implements Runnable{

    Cassier cassier = new Cassier();


    String menu [] = new String[] {"картошка", "макароны", "гречка",
            "суп", "борщ", "сало", "колбаса", "сосиски", "торт", "компот"};


    @Override
    public synchronized void run() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; cassier.meals.size() != 10; i++){
            cassier.addMeal(menu[i]);
        }

    }

    public void addM (String s){
        cassier.addMeal(s);
    }
}
