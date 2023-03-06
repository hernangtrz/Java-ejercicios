public class PruebaHabitacion {
    public static void main(String[] args) {
        Habitacion habitacion = new Habitacion(5, 4, 3);
        habitacion.setLargo(10);
        System.out.println("Dimensiones de la habitación:");
        System.out.println("Largo: " + habitacion.getLargo() + " metros");
        System.out.println("Ancho: " + habitacion.getAncho() + " metros");
        System.out.println("Altura: " + habitacion.getAltura() + " metros");
        System.out.println("Metros cuadrados requeridos para el enchape del piso: " + habitacion.calcularAreaPiso() + " Metros cuadrados");
        System.out.println("Metros cuadrados requeridos para el tapizado de las paredes: " + habitacion.calcularAreaParedes() + " Metros cuadrados");
    }
}