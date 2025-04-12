public class Batalla {
    public static void iniciarBatalla(Criatura c1, Criatura c2) {
        System.out.println("⚔️ Batalla entre " + c1.getNombre() + " y " + c2.getNombre() + " comienza!");
        int turno = 1;
        while (c1.estaViva() && c2.estaViva()) {
            System.out.println("\nTurno " + turno + ":");
            c1.atacar(c2);
            if (!c2.estaViva()) break;
            c2.atacar(c1);
            turno++;
        }
