/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;

/**
 *
 * @author pandi
 */
public class Dinein extends Order implements Payment {

    public Dinein(int id, Customer customer, Menu[] menu) {
        super(id, customer, menu);
    }

    @Override
    public void updatetotalharga() {
        for(int i = 0; i < menu.length; i++){
            System.out.println(menu[i].harga);
            total_harga = total_harga + menu[i].harga;
        }// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void proseespembayaran(double uang) {
        double kembalian = uang - total_harga;
        System.out.println("Pembayaran dine in berhasil dengan kembali Rp" + kembalian);
    }

    @Override
    public void printnota() {
        System.out.println("Nama Customer   : " + customer.nama);
        System.out.println("Pesanan         : ");
        
        for (int i = 0; i < menu.length; i++) {
          System.out.println("                  " + menu[i].nama_menu + "  " + menu[i].harga); 
        }
        System.out.println("Total           : " + total_harga);
    }

}
