public class Main {
    public static void main(String[] args) {
        Criatura dragon = new Dragon("Draco", 150, 25);
        Criatura mago = new Mago("Merlín", 100, 30);
        Criatura guerrero = new Guerrero("Leonidas", 120, 20);

        System.out.println("\n=== Batalla 1: Dragon vs Mago ===");
        Batalla.iniciarBatalla(dragon, mago);

        System.out.println("\n=== Batalla 2: Guerrero vs Dragon ===");
        Batalla.iniciarBatalla(guerrero, dragon);

        System.out.println("\n=== Batalla 3: Mago vs Guerrero ===");
        Batalla.iniciarBatalla(mago, guerrero);
    }
}
