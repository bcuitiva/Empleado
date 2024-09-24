import java.text.DecimalFormat;

public class Desarrollador extends Empleado{
    private String lenguaje;

    public Desarrollador() {
    }
    public Desarrollador(String cc, String nombre, double salario, String lenguaje) {
        super(cc, nombre, salario);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }
    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    DecimalFormat df = new DecimalFormat("0.0");
    @Override
    public void mostrarDetalles(){
        System.out.println("Cedula: " + cc + ", Nombre: " + nombre + ", Salario: " + df.format(salario) );
    }
    @Override
    public double calcularBonificacion(){

        return salario * 0.1;
    }
}
