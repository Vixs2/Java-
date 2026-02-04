package POO.EjercicioPokemon;

public class Bulbasaur extends Pokemon implements IPlanta{

  public Bulbasaur(){
    
  }

    //Metodos propios de todos los pokemones.
    @Override
    public void atacarPlacaje() {
       System.out.println("Hola, soy bulbasaur y este es mi ataque placaje");
    }

    @Override
    public void atacarMordisco() {
       System.out.println("Hola, soy bulbasaur y este es mi ataque mordisco");
    }

    @Override
    public void atacarRasgunio() {
       System.out.println("Hola, soy bulbasaur y este es mi ataque rasguño");
    }

    //Metodos propios del tipo de pokemon
    @Override
    public void atacarParalizar() {
      System.out.println("Hola, soy bulbasaur y este es mi ataque paralizar");
    }

    @Override
    public void atacarDrenaje() {
      System.out.println("Hola, soy bulbasaur y este es mi ataque drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
      System.out.println("Hola, soy bulbasaur y este es mi ataque hoja afilada");
    }
    
}
