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
public class Artwork {
    private String Name;
    private String Description;
    private String Style;
    private int value;

    public Artwork(String Name, String Description, String Style, int value) {
        this.Name = Name;
        this.Description = Description;
        this.Style = Style;
        this.value = value;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public String getStyle() {
        return Style;
    }

    public int getValue() {
        return value;
    }
    
    
}
