public class Main {
    public static void main(String[] args) {
        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();

        CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(oldCoffeeMachine);

        // Simulate user interaction with the touchscreen
        System.out.println("User selects option 1:");
        adapter.chooseFirstSelection();

        System.out.println("User selects option 2:");
        adapter.chooseSecondSelection();
    }
}