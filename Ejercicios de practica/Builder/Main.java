package Builder;

public class Main {
    public static void main(String[] args){

        //Builder concreto
        BuilderConcretoCasa builder = new BuilderConcretoCasa();

        //Director
        BuilderDirector director = new BuilderDirector(builder);
        director.construirCasaDosPisosMaterial();
        Casa casa1 = builder.obtenerResultado();
        System.out.println("Casa 1: " + casa1);

        director.construirCasaConPiscina();
        Casa casa2 = builder.obtenerResultado();
        System.out.println("Casa 2: " + casa2);

        director.construirCasaMaderaSimple();
        Casa casa3 = builder.obtenerResultado();
        System.out.println("Casa 3: " + casa3);
    }
}
