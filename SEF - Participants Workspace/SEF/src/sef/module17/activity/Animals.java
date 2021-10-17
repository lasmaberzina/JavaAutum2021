package sef.module17.activity;
import java.util.ArrayList;

        public Animals() {
        species.add("Dog");
        species.add("Cat");
        species.add("Mouse");
        }
//Create getters and setters for color
public String getColor() {
        return color;
        }
public void setColor(String color) {
        this.color = color;
        }

//Create a setter and getter(int index) for species
public void setSpecies(String species) {
        this.species.add(species);
        }
public String getSpecies(int index) {
        return species.get(index);
        }
//Create a method with name getColorAndSpecies which
// will return text
// "Animals species is: " + this.species.get(index)
// + " and color: " + color
public String getColorAndSpecies(String color, int index) {
        return "Animals species is: " + this.species.get(index) + " and color: " + color;
        }
public ArrayList<String> getSpecies() {
        return species;
        }

public class Animals {
    private ArrayList<String> species = new ArrayList<>();
    private String color;
}