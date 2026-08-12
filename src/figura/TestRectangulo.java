package figura;

public class TestRectangulo {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA CON CONSTRUCTOR CON PARÁMETROS ===");

        // Instanciación directa con parámetros
        Rectangulo r1 = new Rectangulo(4.0, 2.0);

        System.out.println("Base inicial: " + r1.getBase());
        System.out.println("Altura inicial: " + r1.getAltura());
        System.out.println("Perímetro: " + r1.calcularPerimetro());
        System.out.println("Área: " + r1.calcularArea());
    }
}