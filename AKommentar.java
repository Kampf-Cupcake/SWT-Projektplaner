package swt_projektplaner;


import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beust
 */
public class AKommentar {               //In UML
     private String text;
    private GregorianCalendar datum;        //In UML
    private int akommentarNr;
    
    protected Arbeitspaket kommentar;
    protected Mitarbeiter verfasser;
  
    public AKommentar (String t, GregorianCalendar d, int aknr){
        this.text = t;
        this.datum = d;
        this.akommentarNr = aknr;
    }
    
    public String toString(){
        return "Verfasst am "+datum+" von "+verfasser+ "\n"+text;   //In UML
    }
}