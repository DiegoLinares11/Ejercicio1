import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        operaciones op = new operaciones();
        int num1 = op.random();
        int num2 = op.validacionTickets();

        int numeroRan = num2 + num2 + num1;
        if (numeroRan % 2 == 0) {
            System.out.println("El numero de solicitud de compra es: " + num1);
            System.out.println("El numero de solicitud de compra es: " + num2);
            System.out.println("Su numero es: " + numeroRan);
            System.out.println("La suma de los numeros es par por lo que si puede comprar boletos: \n");

            System.out.println("Tenemos 3 localidades diferentes.");
            System.out.println("Localidad 1: La más barata \nPrecio de entrada: $400");
            System.out.println("Localidad 5: La clase media \nPrecio de entrada: $695");
            System.out.println("Localidad 10: La clase alta \nPrecio de entrada: %2350\n");

            // El presupuesto del cliente.
            System.out.println("Ingrese su presupuesto: ");
            int presupuesto = scan.nextInt();
            if (presupuesto < 400) {
                System.out
                        .println("La entrada más barata es de 400 así que no podras comprar nada con: " + presupuesto);
            }
            // Cantidad de boletos a comprar
            System.out.println("Ingrese la cantidad de boletos a comprar: ");
            int cantidadBoletos = scan.nextInt();
            // Restricciones del paso 6.
            if (cantidadBoletos == 60 && presupuesto > 68900) {
                System.out.println("Estas a punto de comprar los boletos de las 3 localidades.");
                System.out.println("Precio localidad 1 = $400\nPrecio localidad 5 = $695\nPrecio localidad 10 = $2350");
                int totalEntradas = ((400 * 20) + (20 * 695) + (2350 * 20));
                System.out.println("Su total es: " + totalEntradas);
                return;
            } else if (cantidadBoletos > 60) {
                System.out.println("Su compra va a ser imposible, solo podemos vender 60 entradas");
                return;
            } else if (cantidadBoletos > 20 && cantidadBoletos < 60) {
                System.out
                        .println("Por localidad solo esta permitido 20 entradas por lo que no será posible venderle ");
                return;
            } else {
                System.out.println("Se procesara la orden.");
            }
            // PASO 5 DEL EJERCICIO, DE FORMA ALEATORIA SE LE SELECCIONARA UNA LOCALIDAD.
            int numeroAleatorio = random.nextInt(3) + 1;

            System.out.println("Se ha seleccionado aleatoriamente su localidad es la numero: " + numeroAleatorio);
            if (numeroAleatorio == 1) {
                System.out.println("Su Localidad 1: La más barata \nPrecio de entrada: $400");
                int totalLocalidad1 = cantidadBoletos * 400;
                System.out.println("Total de venta de boletos: " + totalLocalidad1);
                if (totalLocalidad1 <= presupuesto) {
                    System.out.println("Su compra de " + cantidadBoletos + " boletos se a efectuado con exito.");
                    return;
                } else {
                    System.out.println(
                            "La cantidad de boletos que quiere con el precio de la entrada es mayor a su presupuesto. \nPor lo que no sera posible la venta.");
                    return;
                }
            } else if (numeroAleatorio == 2) {
                System.out.println("Su Localidad 5: La clase media \nPrecio de entrada: $695");
                int totalLocalidad2 = cantidadBoletos * 695;
                System.out.println("Total de venta de boletos: " + totalLocalidad2);
                if (totalLocalidad2 <= presupuesto) {
                    System.out.println("Su compra de " + cantidadBoletos + " boletos se a efectuado con exito.");
                    return;
                } else {
                    System.out.println(
                            "La cantidad de boletos que quiere con el precio de la entrada es mayor a su presupuesto. \nPor lo que no sera posible la venta.");
                    return;
                }
            } else {
                System.out.println("Su Localidad 10: La clase media \nPrecio de entrada: $2350");
                int totalLocalidad3 = cantidadBoletos * 2350;
                System.out.println("Total de venta de boletos: " + totalLocalidad3);
                if (totalLocalidad3 <= presupuesto) {
                    System.out.println("Su compra de " + cantidadBoletos + " boletos se a efectuado con exito.");
                    return;
                } else {
                    System.out.println(
                            "La cantidad de boletos que quiere con el precio de la entrada es mayor a su presupuesto. \nPor lo que no sera posible la venta.");
                    return;
                }
            }

        } else {
            System.out.println("El numero de solicitud de compra es: " + num1);
            System.out.println("El numero de solicitud de compra es: " + num2);
            System.out.println("Su numero es: " + numeroRan);
            System.out.println("La suma de los numeros es impar \nPor lo que no puede comprar boletos.");

        }
    }
}