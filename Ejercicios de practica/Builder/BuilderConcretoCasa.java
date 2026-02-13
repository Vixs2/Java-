package Builder;

import java.util.ArrayList;
import java.util.List;

// 3 Builder Concreto.
public class BuilderConcretoCasa implements BuilderCasa {

    private Casa resultado;
    private List<String> extras = new ArrayList<>();

    @Override
    public void reiniciar() {
        this.extras = new ArrayList<>();
    }

    @Override
    public void construirEstructura(String estructura) {
        resultado.setTipoEstructura(estructura);
    }

    @Override
    public void construirPisos(int pisos) {
        resultado.setPisos(pisos);
    }

    @Override
    public void construirPiscina(boolean siONo) {
        resultado.setPiscina(siONo);
    }

    @Override
    public void construirJardin(boolean siONo) {
        resultado.setJardin(siONo);
    }

    @Override
    public void construirGaraje(boolean siONo) {
        resultado.setGaraje(siONo);
    }

    @Override
    public void agregarExtras(String extra) {
        this.extras.add(extra);
        resultado.setExtras(extras);
    }

    //Metodo propio del builder concreto.
    public Casa obtenerResultado(){
        return resultado;
    }
}
