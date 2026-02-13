package Builder;

import java.util.ArrayList;
import java.util.List;

//Objeto a construir.
public class Casa {
    
    private String tipoEstructura;
    private int pisos;
    private boolean piscina;
    private boolean jardin;
    private boolean garaje;
    private List<String> extras = new ArrayList<>();


    public void setTipoEstructura(String tipoEstructura) {
        this.tipoEstructura = tipoEstructura;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    
    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public void setGaraje(boolean garaje) {
        this.garaje = garaje;
    }

    public void setExtras(List<String> extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "Casa [tipoEstructura=" + tipoEstructura + ", pisos=" + pisos + ", piscina=" + piscina + ", jardin="
                + jardin + ", garaje=" + garaje + ", extras=" + extras + "]";
    }
}
