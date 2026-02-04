package POO.EjercicioPokemon;

/*
    La clase es abstracta debido a que segun requerimientos
    los pokemones tiene atributos y metodos en comun
 */
public abstract class Pokemon {
    
    //Los atributos seran protected para que solo las clases hijas puedan acceder.
    protected int numeroPokedex;
    protected String nombre;
    protected String sexo;
    protected double peso;
    protected int temporada;

    //Metodos que todos tienen en comun.
    public abstract void atacarPlacaje();
    public abstract void atacarMordisco();
    public abstract void atacarRasgunio();
    
}
