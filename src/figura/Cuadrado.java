package figura;

public class Cuadrado {
    // atributo PRIVADO
    private double lado;

    // Constructores
    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Metodos de negocio
    public double calcularArea() {
        return Math.pow(this.lado, 2);
    }

    public double calcularPerimetro() {
        return this.lado * 4;
    }

    // los metodos Getter y Setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}