/*
 * Activity 4.9.2
 */
import java.util.ArrayList;
public class ZooKeeperRunner
{
  public static void hearTheAnimal(Animal a){
    System.out.println(a.speak());
  }
  public static void main(String[] args)
  { 
    System.out.println("Elephant's arrival");
    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    Gorilla gorilla = new Gorilla();
    elephant.trumpet();
    
    elephant.isNocturnal();

    Tiger tiger = new Tiger("meat", true, 17.0);
    tiger.swim();
    tiger.huntAlone();
    tiger.growl();
    tiger.eat();

    Giraffe giraffe = new Giraffe("leaves", false,
                               25.0);
    giraffe.eat();

    //POLYMORPHISM 4.9.5
    Animal animal1 = new Elephant();
    Animal animal2 = new Owl();
    Animal animal3 = new Lion();
    Animal animal4 = new Tiger();

    

    hearTheAnimal(animal1);
    hearTheAnimal(animal2);
    hearTheAnimal(animal3);
    hearTheAnimal(animal4);


    /* 
    ArrayList<Animal> zoo = new ArrayList<Animal>();

    zoo.add(animal1);
    zoo.add(animal2);
    zoo.add(animal3);
    zoo.add(animal4);


    for(Animal a: zoo){
      System.out.println(a.speak());
    }
    */

    /*will not work beecause a no arg constructor is not defined in hippo class 
    Hippo hippo = new Hippo();
    hippo.eat();
  
  */

  Penguin penguin = new Penguin();
  penguin.fish();
  Owl owl = new Owl();
  owl.hunt();
  Owl owl2 = new Owl("mice,insects", true, 4.0);
  owl2.eat();
  }


  

}