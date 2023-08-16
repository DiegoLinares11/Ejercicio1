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

    /*
     * @param
     * 
     * @return ticket
     */
    public int random() {
        ticket = (int) (Math.random() * MAXIMO) + 1;
        return ticket;
    }

    /*
     * 
     * @Param
     * 
     * @Return validar
     */
    public int validacionTickets() {
        validar = (int) (Math.random() * 15000) + 1;
        return validar;
    }

}