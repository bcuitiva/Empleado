import java.text.DecimalFormat;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente() {
    }
    public Gerente(String cc, String nombre, double salario, String departamento) {
        super(cc, nombre, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                '}';
    }
    DecimalFormat df = new DecimalFormat("0.0");
    @Override
    public void mostrarDetalles(){
        System.out.println("Cedula: " + cc + ", Nombre: " + nombre + ", Salario: " + df.format(salario));
    }
    @Override
    public double calcularBonificacion(){

        return salario * 0.2;
    }
}
