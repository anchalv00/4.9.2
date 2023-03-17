public class Feline extends Animal
{
    public Feline(){

    }
    
    public Feline(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);

        System.out.println("A feline arrives");

    }

    public void growl(){
        System.out.println("The felines growl");
    }
    public void roar(){
        System.out.println("The felines roar");
    }
}

