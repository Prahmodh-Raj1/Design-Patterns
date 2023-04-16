package Client;

import Entities.Buildobj;
public class Driver {
    public static void main(String[] args) {
        Buildobj b1 = new Buildobj.Builder().setbrand("Kookaburra").setmodel("V47").setprice(1000.00).setsize(6).build();
        Buildobj b2 = new Buildobj.Builder().setmodel("G78").setbrand("Newbalance").build();
        System.out.println(b1);
        System.out.println(b2);

    }
}
