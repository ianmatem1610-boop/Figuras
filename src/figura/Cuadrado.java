package figura;

public class Cuadrado {
    private double lado;

    //  losConstructores
    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //  el Metodo calcularArea
    public double calcularArea() {
        return Math.pow(this.lado, 2); 
    }

    // el Metodo calcularPerimetro
    public double calcularPerimetro() {
        return this.lado * 4;
    }

    // el Getter y Setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}