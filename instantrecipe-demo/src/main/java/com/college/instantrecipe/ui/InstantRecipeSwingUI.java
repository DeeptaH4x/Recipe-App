package com.college.instantrecipe.ui;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.util.List;
import java.util.ArrayList;

public class InstantRecipeSwingUI {

    // List to store the user's selected ingredients
    private List<String> selectedIngredients = new ArrayList<>();

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Instant Recipe Finder");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the form elements
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Set the frame visibility to true
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Label for ingredients selection
        JLabel ingredientLabel = new JLabel("Select Ingredients:");
        ingredientLabel.setBounds(10, 20, 200, 25);
        panel.add(ingredientLabel);

        // Checkboxes for some ingredients
        JCheckBox tomatoCheckBox = new JCheckBox("Tomato");
        tomatoCheckBox.setBounds(10, 50, 200, 25);
        panel.add(tomatoCheckBox);

        JCheckBox onionCheckBox = new JCheckBox("Onion");
        onionCheckBox.setBounds(10, 80, 200, 25);
        panel.add(onionCheckBox);

        JCheckBox potatoCheckBox = new JCheckBox("Potato");
        potatoCheckBox.setBounds(10, 110, 200, 25);
        panel.add(potatoCheckBox);

        // Button to submit the selected ingredients
        JButton submitButton = new JButton("Find Recipe");
        submitButton.setBounds(10, 150, 150, 25);
        panel.add(submitButton);

        // Label to display the result
        JLabel resultLabel = new JLabel("Recipe:");
        resultLabel.setBounds(10, 200, 300, 25);
        panel.add(resultLabel);

        // Action Listener for Submit Button
        submitButton.addActionListener((ActionEvent e) -> {
            // Collect the selected ingredients
            List<String> selectedIngredients1 = new ArrayList<>();
            if (tomatoCheckBox.isSelected()) {
                selectedIngredients1.add("Tomato");
            }
            if (onionCheckBox.isSelected()) {
                selectedIngredients1.add("Onion");
            }
            if (potatoCheckBox.isSelected()) {
                selectedIngredients1.add("Potato");
            }
            // Call a method to fetch recipes based on the selected ingredients (stub for now)
            String recipe = findRecipe(selectedIngredients1);
            // Display the recipe in the resultLabel
            resultLabel.setText("Recipe: " + recipe);
        });
    }

    // Stub method to simulate finding a recipe based on ingredients
    private static String findRecipe(List<String> ingredients) {
        // In a real application, you would call your backend API here
        // For now, we are returning a mock recipe
        if (ingredients.contains("Tomato") && ingredients.contains("Onion")) {
            return "Tomato and Onion Soup";
        } else if (ingredients.contains("Potato")) {
            return "Mashed Potatoes";
        } else {
            return "No matching recipe found";
        }
    }

    public List<String> getSelectedIngredients() {
        return selectedIngredients;
    }

    public void setSelectedIngredients(List<String> selectedIngredients) {
        this.selectedIngredients = selectedIngredients;
    }
}
