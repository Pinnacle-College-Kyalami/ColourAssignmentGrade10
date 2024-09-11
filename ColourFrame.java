/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colourassignment;

/**
 *
 * @author relindeque
 */

import javax.swing.*;
import java.awt.*;

/**
 * ColourFrame is responsible for creating a frame and allowing colour updates.
 * The user will simply call updateColor with their new Color object to see the change.
 */
public class ColourFrame extends JFrame {
    private ColourBlockPanel panel;

    // Constructor sets up the frame
    public ColourFrame() {
        setTitle("Colour Block Display");
        setSize(400, 400); // Set the size of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed
        setLocationRelativeTo(null); // Center the window on the screen

        // Create the ColourBlockPanel
        panel = new ColourBlockPanel(Color.BLACK); // Initialize with default color
        add(panel);
        setVisible(true); // Display the frame
    }

    // Method to update the color
    public void updateColor(Color color) {
        panel.setBlockColor(color); // Update the panel's color
        repaint(); // Repaint the frame with the new color
    }

    // Inner class for the panel that displays the color block
    private class ColourBlockPanel extends JPanel {
        private Color blockColor;

        public ColourBlockPanel(Color initialColor) {
            this.blockColor = initialColor;
            setPreferredSize(new Dimension(400, 400)); // Set the size of the panel
        }

        public void setBlockColor(Color color) {
            this.blockColor = color;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(blockColor != null ? blockColor : Color.BLACK); // Set the colour for the block
            g.fillRect(0, 0, getWidth(), getHeight()); // Draw a filled rectangle
        }
    }
}

