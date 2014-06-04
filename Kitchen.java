package cafe;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by New on 01.04.14.
 */
public class Kitchen implements Runnable{

    Cassier cassier = new Cassier();
    ArrayList <Meal> arr = new ArrayList<Meal>();

    String menu [] = new String[] {"картошка", "макароны", "гречка",
            "суп", "борщ", "сало", "колбаса", "сосиски", "торт", "компот"};



    public void addMeals () {

        for (int i = 0; i < menu.length/2; i++){
            arr.add(new Meal(menu[i]));
        }


 }

    void print (){
        Iterator <Meal> iterator = arr.iterator();
        while (iterator.hasNext()){
            Meal meal = iterator.next();
            System.out.println(meal.name);
        }

    }

    @Override
    public synchronized void run() {

        try {
            Thread.sleep(2000);
        } catch (Exception e){
            e.getMessage();
        }

        for (int i = 0; i < arr.size(); i++){
            arr.add(new Meal(menu[i]));
            System.out.println(arr.get(i).name);

        }
    }
}
