package POO.EjercicioPokemon;

public class Charmander extends Pokemon implements IFuego{

    public Charmander(){

    }

    //Metodos propios de todos los pokemones.
    @Override
    public void atacarPlacaje() {
        System.out.println("Hola, soy charmander y este es mi ataque placeje");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola, soy charmander y este es mi ataque mordisco");
    }

    @Override
    public void atacarRasgunio() {
        System.out.println("Hola, soy charmander y este es mi ataque rasguño");
    }

    //Metodos propios del tipo de pokemon
    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola, soy charmander y este es mi ataque puño de fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola, soy charmander y este es mi ataque ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola, soy charmander y este es mi ataque lanzallamas");
    }
    
}
