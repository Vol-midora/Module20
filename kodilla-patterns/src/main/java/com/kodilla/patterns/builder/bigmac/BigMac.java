package com.kodilla.patterns.builder.bigmac;


import java.util.ArrayList;
import java.util.List;

public class BigMac {

    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    private BigMac(String roll, int burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BigMacBuilder {
        private String roll = "standard";
        private int burgers = 1;
        private String sauce = "standard";
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder roll(String roll) {
            if (roll == "sesamed") {
                this.roll = "sesamed";
            } else if (roll == "standard") {
                this.roll = "standard";
            } else
                throw new IllegalStateException("Roll may be only <<standard>> or <<sesamed>>");
            return this;
        }

        public BigMacBuilder burgersNumber(int burgers) {
            if (burgers < 0 || burgers > 3) {
                throw new IllegalStateException("Number of burgers must be between 0 and 3");
            } else {
                this.burgers = burgers;
            }
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            switch (sauce) {
                case "standard":
                    this.sauce = sauce;
                    break;
                case "1000 islands":
                    this.sauce = sauce;
                    break;
                case "barbecue":
                    this.sauce = sauce;
                    break;
                default:
                    throw new IllegalStateException("Only standard, 1000 islands or barbecue sauces available");
            }
            return this;
        }

        public BigMacBuilder addIngredient(String ingredient) {
            switch (ingredient) {
                case "salad":
                    this.ingredients.add(ingredient);
                    break;
                case "bacon":
                    this.ingredients.add(ingredient);
                    break;
                case "cucumber":
                    this.ingredients.add(ingredient);
                    break;
                case "chili":
                    this.ingredients.add(ingredient);
                    break;
                case "cheese":
                    this.ingredients.add(ingredient);
                    break;
                case "shrimps":
                    this.ingredients.add(ingredient);
                    break;
                default:
                    throw new IllegalStateException("Ingredient not available");
            }
            return this;
        }

        public BigMac build() {
            return new BigMac(this.roll, this.burgers, this.sauce, this.ingredients);
        }
    }

    @Override
    public String toString() {
        return "Big Mac{" +
                "roll='" + roll + '\'' +
                ", number of burgers ='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}


