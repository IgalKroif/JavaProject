 public abstract class Animal {
     private final int numOfLegs;
     protected String favDrink;
     protected String favHobby;

     protected String mood;

     public String getNumOfLegs() {
         return "Animal has" + numOfLegs + "number of legs!";
     }

     public Animal(int numOfLegs, String mood) {

         this.numOfLegs = numOfLegs;
         this.mood = mood;
     }

     public String getMood () {
         return mood;
     }
     public String animalSound() {
         return " Makes a Sound of:";
     }

@Override
public String toString() {
    System.out.println(animalType()  + ", " + livesIn() +  '\n' + makeRegularSound());

    return super.toString();
}

     public abstract void makeSound();

     public abstract String makeRegularSound();
     public abstract String livesIn();
     public abstract String animalType();

     public abstract void greet();

 }

