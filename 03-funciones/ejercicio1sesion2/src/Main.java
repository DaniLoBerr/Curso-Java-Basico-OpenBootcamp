import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner damePrecio = new Scanner(System.in);
        System.out.print("Introduzca el precio del artículo: ");
        double precioDado = damePrecio.nextDouble();
        double precioConIVA = devolverPrecioConIVA(precioDado);
        System.out.println("El precio del artículo más IVA es: " + precioConIVA);
    }
    static double devolverPrecioConIVA(double precioDado) {
        double iva = precioDado * 0.21;
        double precioConIVA = precioDado + iva;
        return precioConIVA;
    }
}
