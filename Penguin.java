public class Penguin extends newAdditions{
    public Penguin(){
        
    }

    public Penguin(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("The Penguin arrives:");
      }

    public void fish(){
        System.out.println("The penguin fishes.");
    }
}
