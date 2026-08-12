package figura;

public class TestCirculo {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA CON CONSTRUCTOR CON PARÁMETROS ===");

        // Instanciación directa con parámetros
        Circulo cir1 = new Circulo(3.0);

        System.out.println("Radio inicial: " + cir1.getRadio());
        System.out.println("Área: " + cir1.calcularArea());
        System.out.println("Perímetro: " + cir1.calcularPerimetro());
    }
}