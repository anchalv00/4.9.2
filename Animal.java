/*
 * Activity 4.9.2
 */
public class Animal
{
  private String food;
  private boolean nocturnal;
  private double aveLifeSpan;
  public String speech;

  public Animal(){

  }
  
  public Animal(String food, boolean nocturnal, double aveLifeSpan)
{
  this.food = food;
  this.nocturnal = nocturnal;
  this.aveLifeSpan = aveLifeSpan;
  System.out.println(this.food + "" + this.nocturnal + "" + this.aveLifeSpan);

}

  public String speak(){
    return speech;
  }

  public void eat() 
  {
    System.out.println("This animal's diet consists of " + food + ".");
  }
  
  public void isNocturnal()
  {
    if (nocturnal)
      System.out.println("This animal is active at night.");
    else
      System.out.println("This animal is active during the day.");
  }
  
  public void getLifeSpan()
  {
     System.out.println("This animal's life span is " + aveLifeSpan + " years.");
  }
  
}