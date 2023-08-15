import java.util.Scanner;

public class operaciones {

    private final int MAXIMO = 33000;
    private int ticket;
    private int validar;

    public operaciones() {
        Scanner scan = new Scanner(System.in);
        // Aqui se pedira informacion del cliente.
        // Nombre del comprador
        System.out.println("Ingrese su nombre ");
        String nombre = scan.nextLine();
        // El numero de DPI
        System.out.println("Ingrese su numero de dpi: ");
        int dpi = scan.nextInt();

    }

    public int random() {
        ticket = (int) (Math.random() * MAXIMO) + 1;
        return ticket;
    }

    public int validacionTickets() {
        validar = (int) (Math.random() * 15000) + 1;
        return validar;
    }
    /*
     * public operaciones() {
     * int numeroRan = validar + validar + ticket;
     * if (numeroRan % 2 == 0) {
     * System.out.println(validar);
     * System.out.println(ticket);
     * System.out.
     * println("La suma de los numeros es par por lo que si puede comprar boletos: "
     * );
     * } else {
     * System.out.println(validar);
     * System.out.println(ticket);
     * System.out.println("La suma de los numeros es impar");
     * 
     * }
     * }
     */

}