package cafe;

/**
 * Created by New on 23.03.14.
 */
public class Cafe {

    public static void main (String [] s){

        Cassier cassier = new Cassier();

        Thread client1 = new Thread(new Client(cassier));
        Thread client2 = new Thread(new Client(cassier));
        Thread client3 = new Thread(new Client(cassier));
        Thread client4 = new Thread(new Client(cassier));
        Thread client5 = new Thread(new Client(cassier));
        Thread client6 = new Thread(new Client(cassier));
        Thread client7 = new Thread(new Client(cassier));
        Thread client8 = new Thread(new Client(cassier));
        Thread client9 = new Thread(new Client(cassier));
        Thread client10 = new Thread(new Client(cassier));
        client1.start();
        client2.start();
        client3.start();
        client4.start();
        client5.start();
        client6.start();
        client7.start();
        client8.start();
        client9.start();
        client10.start();


        /*Kitchen kitchen = new Kitchen();
        kitchen.print();
        kitchen.addMeals();
        kitchen.print();
*/




}
}