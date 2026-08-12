package figura;

public class TestCuadrado {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA CON CONSTRUCTOR CON PARÁMETROS ===");

        // Instanciación directa con parámetros
        Cuadrado c1 = new Cuadrado(5.0);

        System.out.println("Lado inicial: " + c1.getLado());
        System.out.println("Área: " + c1.calcularArea());
        System.out.println("Perímetro: " + c1.calcularPerimetro());
    }
}