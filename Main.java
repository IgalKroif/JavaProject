
public  class Main {
    public static void main(String[]args){

        //MOODS: Happy Mood, Good Mood, Frightened Mood (Make different Noises from Cat class!)
        Cat myCat = new Cat(4, "Frightened Mood");

        //System.out.println(myCat.isInGoodMood());
        System.out.println(myCat.getMood());
        myCat.livesIn();
        myCat.makeSound();
        System.out.println(myCat.makeRegularSound());
        myCat.animalType();
        System.out.println(myCat.getNumOfWhiskers());
        myCat.toString();
        myCat.greet();
        System.out.println("\n");

        Dog myDog = new Dog(4, "Happy Mood");
        System.out.println(myDog.livesIn());
        System.out.println(myDog.getNumOfLegs());
        myDog.toString();

        System.out.println("\n");
        Frog myFrog = new Frog(2, "Good Mood");
        myFrog.greet();
        System.out.println(myFrog.getFavDrink());
        myFrog.toString();

    }
}
