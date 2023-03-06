public class Coche {
    private String color;
    private String marca;
    private String modelo;
    private int numCaballos;
    private int numPuertas;
    private String matricula;

    public Coche(String color, String marca, String modelo, int numCaballos, int numPuertas, String matricula) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.numCaballos = numCaballos;
        this.numPuertas = numPuertas;
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumCaballos() {
        return numCaballos;
    }

    public void setNumCaballos(int numCaballos) {
        this.numCaballos = numCaballos;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return "Coche => color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", numCaballos=" + numCaballos
                + "hp" + ", numPuertas=" + numPuertas + ", matricula=" + matricula;
    }
}

