package POO.ClaseAbstracta;

public abstract class Figura {
    
    //1. Atributos base de una clase abstracta.
    private int x;
    private int y;


    //2. Constructor privado.
    protected Figura(int x, int y){
        this.x = x;
        this.y = y;
    }

    //3. Metodo abstracto minimo que tiene que tener la clase abstracta.
    public abstract double calcularArea();
}
