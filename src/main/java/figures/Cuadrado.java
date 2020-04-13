package figures;

public class Cuadrado implements Figura { // La clase implementa la interface Figura

    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float area() {
        return lado * lado;
    }

} //Cierre de la clase ejemplo aprenderaprogramar.com
