/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colourassignment;
import java.awt.*;
/**
 *
 * @author relindeque
 */
public class ColourAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Create the ColourFrame instance
        ColourFrame cb = new ColourFrame(); // Frame is created and visible

        int red = 255; 
        int green = 0; 
        int blue = 0;

        // write your code here. Do not edit anythign else!

            //Code a for loop to count through a range between 0 and 255, increase its counter with 1 each round.
        
            //In the loop Create a new color, using the appropriate constructor method.
            
            // Increment blue with 1 and decrement red with 1
            

            //code end....

            // Update the color in the frame
            cb.updateColor(a);

            // Add a delay to make the transition visible
            try {
                Thread.sleep(10); // 10 milliseconds delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
