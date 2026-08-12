package figura;

public class TestRectangulo {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE ENCAPSULAMIENTO: RECTÁNGULO ===");

        // instancia con constructor por defecto para verificar valores iniciales
        Rectangulo r1 = new Rectangulo();

        // mostrar valores por defecto con getters
        System.out.println("\n--- Valores por defecto (Antes del setter) ---");
        System.out.println("Base inicial: " + r1.getBase());
        System.out.println("Altura inicial: " + r1.getAltura());
        System.out.println("Perímetro inicial: " + r1.calcularPerimetro());

        // asignar nuevos valores utilizando setters
        r1.setBase(4.0);
        r1.setAltura(2.0);

        // Mostrar valores actualizados con getters y validación de cálculos
        System.out.println("\n--- Valores modificados (Después del setter) ---");
        System.out.println("Nueva Base: " + r1.getBase());
        System.out.println("Nueva Altura: " + r1.getAltura());
        System.out.println("Perímetro calculado: " + r1.calcularPerimetro());
    }
}