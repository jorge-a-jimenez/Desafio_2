package Dominio;

public class Freelancer extends Empleado{
    private long valorHora;
    private int horasTrabajadas;
    public Freelancer(String nombre, long valorHora, int horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas=horasTrabajadas;
        this.valorHora=valorHora;
    }

    @Override
    public long calcularSalario() {
        return valorHora*horasTrabajadas;
    }
}
