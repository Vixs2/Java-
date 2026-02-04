package POO.ClaseAbstracta;

public class Circulo extends Figura{

    //Atributo propio de la clase Circulo.
    private double radio;

    //Constructor.
    public Circulo(int x, int y, double radio) {
        super(x, y);

        //Validacion de que el radio sea mayor a 0 y no negativo.
        if(radio < 0){
            throw new IllegalArgumentException("El radio debe ser postivo");
        }
        this.radio = radio; //Este es un else, si es mayor a 0 al hacer la validacion inicial.
                              
    }
    @Override
    public double calcularArea() {
        double resultado = Math.PI * radio * radio;
        return resultado;
    }
}
