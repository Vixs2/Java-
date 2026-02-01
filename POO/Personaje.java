package POO;

public class Personaje {
    
    private String nombre;

    private String tipo;

    private int cantidadVida;

    private int inteligencia;

    private int defensa;

    private int fuerza;

    private int ataque;


    public Personaje(){
        
    }

    public Personaje(String nombre, String tipo, int cantidadVida, int inteligencia, int defensa, int fuerza, int ataque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadVida = cantidadVida;
        this.inteligencia = inteligencia;
        this.defensa = defensa;
        this.fuerza = fuerza;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidadVida() {
        return cantidadVida;
    }

    public void setCantidadVida(int cantidadVida) {
        this.cantidadVida = cantidadVida;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
}
