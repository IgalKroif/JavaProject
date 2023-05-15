public class Frog extends Animal{
        private String favDrink;

    protected Frog(int numOfLegs, String mood) {

        super(numOfLegs, mood);
    }

    @Override
    public void makeSound() {

        switch (mood) {
            case "Happy Mood" -> System.out.println("The Frog, is HAPPY: ~Quack Quack Quack~");
            case "Good Mood" -> System.out.println("The Frog is in a good mood: RIBBBITTT");
            case "The Frog is Frightened: Frightened Mood" -> System.out.println("*Plopped into the water*");
            default -> System.out.println("Frog has no mood!");
        }
    }

    @Override
    public String makeRegularSound() {
        return "A Frog" + animalSound() + " Ribbit!";
    }

    @Override
    public String livesIn() {
        return  "Frogs may live on: Land OR IN WATER";
    }

    @Override
    public String animalType() {
        return  "A Frog is of Type: Amphibian (a terrestrial animal),  and belongs to oviparous. ";
    }

    @Override
    public void greet() {
        System.out.println("A Random Frog Greets You : ~RIBBIT~");
    }

    public String getFavDrink(){
        favDrink = "Water";
        return favDrink;
    }
}
