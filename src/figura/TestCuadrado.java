package figura;

public class TestCuadrado {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE ENCAPSULAMIENTO: CUADRADO ===");

        // la instancia inicial
        Cuadrado c1 = new Cuadrado();

        // Mostrar valor por defecto con  ek getter
        System.out.println("\n--- Valor por defecto (Antes del setter) ---");
        System.out.println("Lado inicial: " + c1.getLado());
        System.out.println("Área inicial: " + c1.calcularArea());
        System.out.println("Perímetro inicial: " + c1.calcularPerimetro());

        // modificar el valor mediante setter
        c1.setLado(5.0);

        //  aqui mostrara el valor modificado con getters
        System.out.println("\n--- Valor modificado (Después del setter) ---");
        System.out.println("Nuevo Lado: " + c1.getLado());
        System.out.println("Nueva Área calculada: " + c1.calcularArea());
        System.out.println("Nuevo Perímetro calculado: " + c1.calcularPerimetro());
    }
}