package Builder;

//Builder general.
public interface BuilderCasa {

    //Se añaden los metodos de cada uno de los atrubutos del objeto.

    void reiniciar();
    void construirEstructura(String esctructura);
    void construirPisos(int pisos);
    void construirPiscina(boolean siONo);
    void construirJardin(boolean siONo);
    void construirGaraje(boolean siONo);
    void agregarExtras(String extra);
}
