abstract class Forma {
    abstract double calcularArea();
}

class Circulo extends Forma {
    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class Abstraccion {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}
