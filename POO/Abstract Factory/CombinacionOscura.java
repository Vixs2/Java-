
public class CombinacionOscura implements IFactory{

    @Override
    public Silla crearSilla() {
        return new SillaOficina();
    }

    @Override
    public Escritorio crearEscritorio() {
        return new EscritorioNegro();
    }
    
}
