public class Dog  extends Animal{
        private String name;
        private String BelongsTo;

    protected Dog(int numOfLegs, String mood) {

        super(numOfLegs, mood);
    }

    @Override
    public void makeSound() {

        if (mood.equals("Happy Mood")) {
            System.out.println("The Dog, is HAPPY: *~Wags his tails~*");

        } else if (mood.equals("Good Mood")) {

            System.out.println("The Dog is in a good mood: WOOF-WOOF");

        } else if (mood.equals("Frightened Mood")) {

            System.out.println("The Dog is Frightened: BRRRRRRRRR!");

        } else System.out.println("Dog has no mood!");
    }

    @Override
    public String makeRegularSound() {
        return "A Dog" + animalSound() + " WOOF!";
    }

    @Override
    public String livesIn() {
        return  "Dogs may live on: Land\\with humans!";
    }

    @Override
    public String animalType() {
        return  "A Dog is of Type: Mammalian and Carnivorous and is Terrestrial!";
    }

    @Override
    public void greet() {
        System.out.println("~Wags His Tails~");
    }

    public String getFavDrink(){
        favDrink = "Water";
        return favDrink;
    }

}
