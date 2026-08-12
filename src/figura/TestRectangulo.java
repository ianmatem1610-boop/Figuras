package figura;

public class TestRectangulo {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4.0, 2.0);
        Rectangulo r2 = new Rectangulo(5.5, 3.0);

        double perimetroR1 = r1.calcularPerimetro();
        double perimetroR2 = r2.calcularPerimetro();

        System.out.println("Perímetro Rectángulo 1: " + perimetroR1);
        System.out.println("Perímetro Rectángulo 2: " + perimetroR2);
    }
}