public abstract class WarriorDecorator implements Warrior {
   protected Warrior decoratedWarrior;

   public WarriorDecorator(Warrior decoratedWarrior){
      this.decoratedWarrior = decoratedWarrior;
   }

   public void fight(){
      decoratedWarrior.fight();
   }  
}