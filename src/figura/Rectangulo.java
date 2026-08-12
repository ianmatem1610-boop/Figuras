package figura;

public class Rectangulo {
    private double base;
    private double altura;

    // ÚNICO CONSTRUCTOR: Con parámetros (Se elimina el constructor por defecto)
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularPerimetro() {
        return (2 * this.base) + (2 * this.altura);
    }

    public double calcularArea() {
        return this.base * this.altura;
    }

    // Getters y Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}