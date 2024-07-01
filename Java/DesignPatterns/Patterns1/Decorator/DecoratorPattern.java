package Patterns.Decorator;

public class DecoratorPattern {

  public void runDecoratorPattern(){

    IceCream basicIceCream = new BasicIceCream();
    System.out.println("Basic Ice-cream cost $"+ basicIceCream.cost());

    IceCream vanilla = new VanillaIceCream(basicIceCream);
    System.out.println("Adding Vanilla - cost $"+ vanilla.cost());

    IceCream mint = new MintIceCream(vanilla);
    System.out.println("Adding Mint - cost $"+ mint.cost());

  }

}
