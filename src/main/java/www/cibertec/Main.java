package www.cibertec;

public class Main {

    public static double calcularTotal(double precio, int cantidad) {
        return precio * cantidad;
    }

    public static void main(String[] args) {

        int opcion = 1;
        int cantidad = 2;

        double precio = 0;
        double total;

        String producto = "";

        System.out.println("TIENDA PARA BEBES");
        System.out.println("1. Pañales - S/ 50");
        System.out.println("2. Biberon - S/ 20");
        System.out.println("3. Toallitas - S/ 10");
        System.out.println("4. Shampoo - S/ 15");

        switch (opcion) {

            case 1:
                producto = "Pañales";
                precio = 50;
                break;

            case 2:
                producto = "Biberon";
                precio = 20;
                break;

            case 3:
                producto = "Toallitas";
                precio = 10;
                break;

            case 4:
                producto = "Shampoo";
                precio = 15;
                break;

            default:
                System.out.println("Opcion incorrecta");
        }

        if (opcion >= 1 && opcion <= 4) {

            total = calcularTotal(precio, cantidad);

            System.out.println("");
            System.out.println("Producto: " + producto);
            System.out.println("Precio: S/ " + precio);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Total: S/ " + total);

            if (total >= 100) {
                System.out.println("Compra mayor o igual a S/ 100");
            } else {
                System.out.println("Compra menor a S/ 100");
            }

            System.out.println("");

            for (int i = 1; i <= 3; i++) {
                System.out.println("Gracias por su compra");
            }
        }
    }
}