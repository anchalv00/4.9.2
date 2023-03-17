public class Lion extends Feline
{
    public Lion(){
        speech = "roar";
    }

    public Lion(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
    }

    public void huntInPack(){
        System.out.println("The lions hunt in a pack");
    }

    
}
