public class GestorTema {
    private static GestorTema instancia;
    private String temaActual;

    private GestorTema() {
        this.temaActual = "Claro";
    }

    public static GestorTema getInstancia() {
        if (instancia == null) {
            instancia = new GestorTema();
        }
        return instancia;
    }

    public void cambiarTema(String nuevoTema) {
        this.temaActual = nuevoTema;
        System.out.println("Cambiando tema visual a: " + nuevoTema);
    }

    public String getTemaActual() {
        return temaActual;
    }
}