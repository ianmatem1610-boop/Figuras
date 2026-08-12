package figura;

public class Cuadrado {
    private double lado;

    // ÚNICO CONSTRUCTOR: Con parámetros
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return Math.pow(this.lado, 2);
    }

    public double calcularPerimetro() {
        return this.lado * 4;
    }

    // Getter y Setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}