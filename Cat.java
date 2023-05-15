public class Cat extends Animal {
        private int numOfWhiskers = 6;
        private String name;
        private String BelongsTo;


    protected Cat(int numOfLegs, String mood) {

        super(numOfLegs, mood);
    }

    @Override
    public void makeSound() {

        if (mood.equals("Happy Mood")) {
            System.out.println("The cat, is HAPPY: meow~");

        } else if (mood.equals("Good Mood")) {

            System.out.println("The Cat is in a good mood: PURRR-PURR");

        } else if (mood.equals("Frightened Mood")) {

            System.out.println("HISSS");

        } else System.out.println("Cat has no mood!");
    }

    @Override
    public String makeRegularSound() {
        return "A Cat" + animalSound() + " Meow!";
    }

    @Override
    public String livesIn() {
       return  "Cats may live on: Land\\with humans!";
    }

    @Override
    public String animalType() {
        return  "A Cat is of Type: Mammalian and Carnivorous";
    }

    @Override
    public void greet() {
        System.out.println("You've been greeted by a cat: ~Meow~");
    }

    public String getFavDrink(){
        this.favDrink = favDrink;
        return favDrink;
    }

    public String getNumOfWhiskers() {
        return "My cat has  " + this.numOfWhiskers + " Whiskers";
    }


}
