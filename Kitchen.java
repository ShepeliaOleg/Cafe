package cafe;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by New on 01.04.14.
 */
public class Kitchen implements Runnable{

    Cassier cassier = new Cassier();
    ArrayList <Meal> meals = new Cassier().meals;

    String menu [] = new String[] {"картошка", "макароны", "гречка",
            "суп", "борщ", "сало", "колбаса", "сосиски", "торт", "компот"};



    public void addMeals () {


        new Cassier().meals.add(new Meal("new meal"));

 }

    void print (){
        Iterator <Meal> iterator = meals.iterator();
        while (iterator.hasNext()){
            Meal meal = iterator.next();
            System.out.println(meal.name);
        }

    }

    @Override
    public void run() {

        System.out.println("new meal");
        new Cassier().meals.add(new Meal("new meal"));

       
    }
}
