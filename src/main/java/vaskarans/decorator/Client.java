package vaskarans.decorator;

public class Client {
    public static void main(String[] args) {
        System.out.println("Time to Decorate");
        System.out.println();

        System.out.println("***Using wrappers in different scenarios.***\n");
        System.out.println("Scenario-1: Making a basic home with standard facilities.");
        Home home = new BasicHome();
        System.out.println("Total cost: $" + home.getPrice());

    }

}
