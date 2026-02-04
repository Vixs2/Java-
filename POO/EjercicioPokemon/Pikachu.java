package POO.EjercicioPokemon;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu(){

    }

    //Metodos propios de todos los pokemones.
    @Override
    public void atacarPlacaje() {
        System.out.println("Hola, soy pikachu y este es mi ataque placaje");
    }

    @Override
    public void atacarMordisco() {
       System.out.println("Hola, soy pikachu y este es mi ataque mordisco");
    }

    @Override
    public void atacarRasgunio() {
       System.out.println("Hola, soy pikachu y este es mi ataque rasguño");
    }


    //Metodos propios del tipo de pokemon
    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola, soy pikachu y este es mi ataque impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola, soy pikachu y este es mi ataque puño trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Hola, soy pikachu y este es mi ataque rayo");
    }
    
}
