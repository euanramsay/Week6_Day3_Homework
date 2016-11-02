public class DecoratorPattern {
   public static void main(String[] args) {

      Warrior gaul = new Gaul();
      Warrior amphibiousGaul = new AmphibiousWarriorDecorator(new Gaul());
      Warrior amphibiousViking = new AmphibiousWarriorDecorator(new Viking());
      
      System.out.println("Gaul without ship");
      gaul.fight();

      System.out.println("\nGaul with ship");
      amphibiousGaul.fight();

      System.out.println("\nViking with ship");
      amphibiousViking.fight();
   }
}