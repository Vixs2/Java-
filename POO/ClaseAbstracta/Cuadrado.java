package POO.ClaseAbstracta;

public class Cuadrado extends Figura{

    //Atributo propio de la clase.
    private double lado;

    public Cuadrado(int x, int y, double lado){
        super(x, y);    //Esto se encarga de llamar al constructor de Figura.
        this.lado = lado;

        //Validacion de que el lado sea mayor a 0 y no negativo
        if(lado < 0){
            throw new IllegalArgumentException("El lado debe ser mayor a 0 o no negativo");
        }
        this.lado = lado;
    }

    //Sobreescritura del metodo propio de la clase Figura.
    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
}
