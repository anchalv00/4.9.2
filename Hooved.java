/*
 * Activity 4.9.2
 */
public class Hooved extends Animal
{

  private String food;
  private double height;

  public Hooved(){
    
  } 

  public Hooved(String food, double height){
    this.food = food;
    this.height = height;
  }

  public Hooved(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
  }

  public void forage()
  {
    System.out.println("The hooved animal forages for food.");
  }
}