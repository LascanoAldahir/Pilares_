class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;}

    public void mostrarMarca() {
        System.out.println("Marca: " + marca);}}

class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, int numeroPuertas) {
        super(marca);
        this.numeroPuertas = numeroPuertas;}

    public void mostrarDetalles() {
        mostrarMarca();
        System.out.println("Número de puertas: " + numeroPuertas);}}

public class Herencia {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", 4);
        miCoche.mostrarDetalles();}}
