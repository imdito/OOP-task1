
import Restaurant.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Menu nasigoreng = new Menu("Nasi Oyeng", 12000, true);
       Menu pisanggoreng = new Menu("hihang hoyeng", 2500, true);
       Menu esteh = new Menu("Es Teh", 3000, true);
       
       Menu listmenu[] = {nasigoreng, pisanggoreng, esteh};
       
       
       Customer customer = new Customer("Shin Tae Yong", "0895123456");
       System.out.println("#DineIn");
       Dinein dinein = new Dinein(1, customer, listmenu);
       dinein.updatetotalharga();
       dinein.proseespembayaran(100000);
       dinein.printnota();
       System.out.println(" ");
       System.out.println(" ");
       
        System.out.println("Takeaway");
        Takeaway takeway = new Takeaway(2, customer, listmenu, "20.00");
        takeway.updatetotalharga();
        takeway.proseespembayaran(50000);
        takeway.printnota();
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("Delivery");
        Delivery delivery = new Delivery(3, customer, listmenu, 5);
        delivery.updatetotalharga();
        delivery.proseespembayaran(50000);
        delivery.printnota();
        System.out.println(" ");
        System.out.println(" ");
       
    }
    
}
