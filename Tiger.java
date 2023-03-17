public class Tiger extends Feline
{
    public Tiger(){
        speech = "grr";
    }

    public Tiger(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
      }

    public void huntAlone(){
        System.out.println("The tiger huns alone");
    }
    public void swim(){
        System.out.println("The tiger swims");
    }

   
}
