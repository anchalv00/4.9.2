public class Owl extends newAdditions{
    public Owl(){
        speech = "hoo";
    }

    public Owl(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("The Owl arrives:");
      }

    public void hunt(){
        System.out.println("The owl hunts.");
    }

}
