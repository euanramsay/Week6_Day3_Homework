public class AmphibiousWarriorDecorator extends WarriorDecorator {

   public AmphibiousWarriorDecorator(Warrior decoratedWarrior) {
      super(decoratedWarrior);    
   }

   @Override
   public void fight() {
      decoratedWarrior.fight();         
      setShipType(decoratedWarrior);
   }

   private void setShipType(Warrior decoratedWarrior){
      System.out.println("Attack in Longship");
   }
}