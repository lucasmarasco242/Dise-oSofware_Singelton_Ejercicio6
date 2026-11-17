public class Main {
    public static void main(String[] args) {
        GestorTema t1 = GestorTema.getInstancia();
        GestorTema t2 = GestorTema.getInstancia();

        System.out.println("¿Es la misma instancia?: " + (t1 == t2));
        System.out.println("Tema inicial: " + t1.getTemaActual());

        t1.cambiarTema("Oscuro");
        System.out.println("Tema actual desde t2: " + t2.getTemaActual());
    }
}