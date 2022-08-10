public class Main {

    public static void main(String[] args) {

        double precioConIVA = getPrice(50.00);
        System.out.println("El precio del artículo + IVA es: " + precioConIVA);
    }

    static double getPrice(double precio) {
        double IVA = 2.10;
        return precio + IVA;
    }
}
