package figura;

public class Rectangulo {
    // Atributos PRIVADOS ,Encapsulamiento
    private double base;
    private double altura;

    //  losConstructores
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Metodos de negocio
    public double calcularPerimetro() {
        return (2 * this.base) + (2 * this.altura);
    }

    public double calcularArea() {
        return this.base * this.altura;
    }

    //  Metodos Getter y Setter
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