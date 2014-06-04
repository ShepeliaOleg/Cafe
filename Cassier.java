package cafe;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by New on 23.03.14.
 */
public class Cassier {

    ArrayList <Meal> meals = new ArrayList<Meal>();

    public Cassier() {
        meals.add(new Meal("картошка"));
        meals.add(new Meal("макароны"));
        meals.add(new Meal("гречка"));
        meals.add(new Meal("суп"));
        meals.add(new Meal("борщ"));
        meals.add(new Meal("сало"));
        meals.add(new Meal("колбаса"));
        meals.add(new Meal("сосиски"));
        meals.add(new Meal("торт"));
        meals.add(new Meal("компот"));
    }

     void getMeal() throws InterruptedException {

               for (int i=0; meals.size()>0; i++){
                   System.out.println(meals.get(0).name.toString());
                   meals.remove(0);
                   Thread.sleep(2000);
                   if (meals.size() == 4){
                       Thread.sleep(3000);
                       order();
                       Thread.interrupted();
                   }
                   
               }


               }

    synchronized void print (){

        Iterator<Meal> iter = meals.iterator();
        while (iter.hasNext()){
            Meal element = iter.next();
            System.out.println(element.name.toString());

        }
    }

   synchronized void order (){

       new Order().run();



   }
}
