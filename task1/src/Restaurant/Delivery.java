/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;

/**
 *
 * @author pandi
 */
public class Delivery extends Order implements Payment {
    private int jarak_tempuh;
    
    public Delivery(int id, Customer customer, Menu[] menu, int jarak_tempuh) {
        super(id, customer, menu);
        this.jarak_tempuh = jarak_tempuh;
    }

    @Override
    public void updatetotalharga() {
       for(int i = 0; i < menu.length; i++){
            System.out.println(menu[i].harga);
            total_harga = total_harga + menu[i].harga;
        }
       total_harga = total_harga + jarak_tempuh*2500;
        System.out.println("Total Harga dengan ongkir : " + total_harga);
    }

    @Override
    public void proseespembayaran(double uang) {
        double kembalian = uang - total_harga;
        System.out.println("Pembayaran dine in berhasil dengan kembali Rp" + kembalian);
        System.out.println("Driver akan segera berangkat!!");
    
    }
    
}
