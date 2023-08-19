
class Fruta {
    private String tipo;
    private String color;
    private String sabor;

    public Fruta(String tipo, String color, String sabor) {
        this.tipo = tipo;
        this.color = color;
        this.sabor = sabor;}

    public String getTipo() {
        return tipo;}

    public String getColor() {
        return color;}

    public String getSabor() {
        return sabor;}}

class Manzana extends Fruta {
    public Manzana(String color) {
        super("Manzana", color, "Dulce");}}

class Banana extends Fruta {
    public Banana(String color) {
        super("Banana", color, "Dulce y cremosa");}}
public class Polimorfismo {
    public static void main(String[] args) {
        Fruta manzana = new Manzana("Roja");
        Fruta banana = new Banana("Amarilla");

        mostrarDetallesFruta(manzana);
        mostrarDetallesFruta(banana);}

    static void mostrarDetallesFruta(Fruta fruta) {
        System.out.println("Tipo: " + fruta.getTipo());
        System.out.println("Color: " + fruta.getColor());
        System.out.println("Sabor: " + fruta.getSabor());
        System.out.println("-----------------------------");}}