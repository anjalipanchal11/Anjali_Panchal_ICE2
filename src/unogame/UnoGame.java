/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;

/**
 *
 * @author Anjali Panchal
 */
public class UnoGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GenerateCard ch = new GenerateCard();
                ch.generateArray();//calls the array to generate 60 cards
           
           for(Card d1 : ch.deck)//reading deck from array
           {
               System.out.println(d1.getSuit()+" "+d1.getValue());
           }

        // TODO code application logic here
    }
    
}
