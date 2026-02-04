package POO.Interfaces;

public class Circulo implements Figura, Dibujable, Rotable{

    //Atributo propio de la clase.
    private double radio;

    //Constructor.
    public Circulo(double radio){
        this.radio = radio;

        if(radio < 0 ){
            throw new IllegalArgumentException("El radio debe ser mayor a 0 o no negativo.");
        }
    }

    //Sobreescritura del metodo de la interfaz Figura.
    @Override
    public double calcularArea() {
        double resultado = 2 * Math.PI * radio;
        return resultado;
    }

    //Sobreescritura del metodo de la interfaz dibujable.
    @Override
    public void dibujar() {
       System.out.println("Hola, estoy dibujando un circulo...");
    }

    //Sobreescritura del metodo de la interfaz rotable.
    @Override
    public void rotar() {
       System.out.println("Hola, estoy rotando el circulo....");
    }
}
