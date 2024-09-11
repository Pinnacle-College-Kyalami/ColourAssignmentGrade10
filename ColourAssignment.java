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
        for (int i = 0; i <= 255; i++) {
            // Create a new color
            Color a = new Color(red, green, blue);
            // Increment blue and decrement red
            blue++;
            red--;

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

}
