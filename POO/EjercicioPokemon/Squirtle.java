package POO.EjercicioPokemon;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle(){
        
    }

    //Metodos propios de todos los pokemones.
    @Override
    public void atacarPlacaje() {
       System.out.println("Hola soy squirtle y este es mi ataque placeje");
    }

    @Override
    public void atacarMordisco() {
      System.out.println("Hola, soy squirtle y este es mi ataque mordisco");
    }

    @Override
    public void atacarRasgunio() {
        System.out.println("Hola, soy squirtle y este es mi ataque rasguño");
    }

    //Metodos propios del tipo de pokemon
    @Override
    public void atacarHidrobomba() {
       System.out.println("Hola, soy squirtle y este es mi ataque Hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
       System.out.println("Hola, soy squirtle y este es mi ataque Pistola de agua");
    }

    @Override
    public void atacarBurbuja() {
       System.out.println("Hola, soy squirtle y este es mi ataque burbuja");
    }  
}
