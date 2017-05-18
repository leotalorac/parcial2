/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Buyer extends User{
    private ArrayList<Artwork> purchases;
    private ArrayList<Payment> payments;

    public Buyer(String Name, String Lname) {
        super(Name, Lname);
    }
    public void Buy(Artwork a,Payment p){
        this.purchases.add(a);
        this.payments.add(p);
    }
    
}
