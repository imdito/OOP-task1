/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;

/**
 *
 * @author pandi
 */
abstract class Order {
    protected int id;
    protected Customer customer;
    protected Menu menu[];
    protected double total_harga;
    
    public Order(int id, Customer customer, Menu menu[]){
        this.id = id;
        this.customer = customer;
        this.menu = menu;
        this.total_harga = 0;
 
    }
    
    public abstract void updatetotalharga();
    public abstract void printnota();
}
