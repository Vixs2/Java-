package POO.Interfaces;

public class Cuadrado implements Figura, Dibujable{

    //Variable propia de la clase.
    private double lado;

    //Constructor.
    public Cuadrado(double lado){
        this.lado = lado;

        if(lado < 0 ){
            throw new IllegalArgumentException("El lado debe ser mayor a 0 o no negativo.");
        }
    }

     //Sobreescritura del metodo de la interfaz dibujable.
    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un cuadrado....");
    }

    //Sobreescritura del metodo de la interfaz Figura.
    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
    
}
