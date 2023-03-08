package exemplo02;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio r = new Relogio(7, 8,  20);

        r.setHora(99);
        System.out.println("Hora: " + r.getHora());
        System.out.println("Minuto: " + r.getMinuto());
        System.out.println("Segundo: " + r.getSegundo());

    }
}
