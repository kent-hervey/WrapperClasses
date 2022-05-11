package vaskarans.decorator;

public class Client {
    public static void main(String[] args) {
        System.out.println("Time to Decorate");
        System.out.println();

        System.out.println("***Using wrappers in different scenarios.***\n");
        System.out.println("Scenario-1: Making a basic home with standard facilities.");
        Home home = new BasicHome();
        System.out.println("Total cost: $" + home.getPrice());

        //Scenario 2

        System.out.println("\nScenario-2: Making a basic home, then adding a playground.");

        home = new BasicHome();
        home = new Playground(home);
        System.out.println("Total cost: $" + home.getPrice());

        //Scenario 3

        System.out.println("\nScenario-3: Making a basic home, then adding two playgrounds one-by-one.");
        home = new BasicHome();
        home = new Playground(home);
        home = new Playground(home);
        System.out.println("Total cost: $" + home.getPrice());

        //Scenario 4

    }

}
