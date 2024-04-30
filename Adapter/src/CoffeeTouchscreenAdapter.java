public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    OldCoffeeMachine oldCoffeeMachine;

    CoffeeTouchscreenAdapter(OldCoffeeMachine oldCoffee) {
        this.oldCoffeeMachine = oldCoffee;
    }

    public void chooseFirstSelection() {
        oldCoffeeMachine.selectA();
    }

    public void chooseSecondSelection() {
        oldCoffeeMachine.selectB();
    }
}