/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

/**
 *
 * @author Estudiante
 */
public class Payment {
    private String Type;
    private int Value;
    private String Bank;
    private Artwork a;

    public Payment(String Type, int Value, String Bank, Artwork a) {
        this.Type = Type;
        this.Value = Value;
        this.Bank = Bank;
        this.a = a;
    }
    
    
    
}
