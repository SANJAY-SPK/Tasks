/*5) Wildlife Simulation (Abstract Class & Interface) 
Question: A wildlife simulation needs a flexible way to handle different animals, some of 
which can fly. Build a Java program that: 
1. Declares an abstract class Animal with an abstract method makeSound(). 
2. Declares an interface Flyable with a method fly(). 
3. Implements Animal subclasses (e.g., Lion, Eagle), letting Eagle also 
implement Flyable. 
4. In main(), create and test these animals by calling 
both makeSound() and fly() where applicable.  */

package programs;

public class WildlifeSimulation 
{
    abstract static class Animal 
    {
        public abstract void makeSound();
    }

    interface Flyable 
    {
        void fly();
    }

    static class Lion extends Animal 
    {
        @Override
        public void makeSound() 
        {
            System.out.println("Roar!");
        }
    }

    static class Eagle extends Animal implements Flyable {
        @Override
        public void makeSound() 
        {
            System.out.println("Squawk!");
        }

        @Override
        public void fly() 
        {
            System.out.println("Flies!");
        }
    }

    public static void main(String[] args) 
    {
        Animal lion = new Lion();
        lion.makeSound();

        Animal eagle = new Eagle();
        eagle.makeSound();

        if (eagle instanceof Flyable) 
        {
            ((Flyable) eagle).fly();
        }

        Flyable flyableEagle = new Eagle();
        flyableEagle.fly();
    }
}