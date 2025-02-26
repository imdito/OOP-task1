/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;

/**
 *
 * @author pandi
 */
public class Takeaway extends Order implements Payment {
    
    private String waktuambil;
    
    public Takeaway(int id, Customer customer, Menu[] menu, String waktu) {
        super(id, customer, menu);
        this.waktuambil = waktu;
    }

    @Override
    public void updatetotalharga() {
        for(int i = 0; i < menu.length; i++){
            System.out.println(menu[i].harga);
            total_harga = total_harga + menu[i].harga;
        }
        System.out.println("Total Harga : " + total_harga);
    }

    @Override
    public void proseespembayaran(double uang) {
         double kembalian = uang - total_harga;
        System.out.println("Pembayaran take away berhasil dengan kembali Rp" + kembalian);
        System.out.println("Harap ambil pada " + waktuambil);
    }
    
}
