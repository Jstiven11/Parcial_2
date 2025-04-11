public class Dragon extends Criatura {

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza * 2;
        System.out.println(nombre + " lanza fuego a " + objetivo.getNombre() + " causando " + daño + " de daño.");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        int dañoRecibido = daño - (fuerza / 3); // el dragón tiene una defensa natural
        salud -= Math.max(dañoRecibido, 0);
        System.out.println(nombre + " recibe " + Math.max(dañoRecibido, 0) + " de daño. Salud actual: " + salud);
    }
}
