public class PruebaCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Rojo", "Ford", "Focus", 100, 5, "1234-ABC");
        Coche coche2 = new Coche("Azul", "Toyota", "Corolla", 120, 4, "5678-DEF");

        System.out.println(coche1);
        System.out.println(coche2);

        coche1.setColor("Negro");
        coche2.setMarca("Audi");
        coche2.setModelo("R8");

        System.out.println(coche1);
        System.out.println(coche2);
    }
}
