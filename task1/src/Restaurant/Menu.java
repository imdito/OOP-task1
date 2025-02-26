/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;

/**
 *
 * @author pandi
 */
public class Menu {
    public String nama_menu;
    public int harga; 
    public boolean ketersediaan;
    
    public Menu(String nama, int harga, boolean ketersediaan){
        this.nama_menu = nama;
        this.harga = harga;
        this.ketersediaan = ketersediaan;
    }
    
    public void updateketersediaan(boolean ubahketersediaan){
        this.ketersediaan = ubahketersediaan;
        System.out.println("Ketersediaan " + this.nama_menu +
                " Menjadi " + this.ketersediaan );
    }
    
    
}
