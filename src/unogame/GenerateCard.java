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
public class GenerateCard {
    private int numberofcards = 60;
   
   Card[] deck = new Card[numberofcards];//array of object declaration
   
   //array for generate 60 card in array
   int count = 0;
   
   public void generateArray(){
       
       for(Card.Suit c:Card.Suit.values())//read colors
       {
            
           for(Card.Value v:Card.Value.values())//read values
           {
                deck[count] = new Card(c,v);//constructor
   
                count++;
                
           
           }
                   
       
       }

    }
    
}
