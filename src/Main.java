
public class Main {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("12345", "Andres", 18000000, "TI");

        Desarrollador d1 = new Desarrollador("666666", "Laura", 2500000, "Java");

        g1.mostrarDetalles();
        System.out.println("Bonificacion: " + g1.calcularBonificacion());

        d1.mostrarDetalles();
        System.out.println("Bonificacion: " + d1.calcularBonificacion());
    }
}