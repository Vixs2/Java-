
public class CombinacionColor implements IFactory{

    @Override
    public Silla crearSilla() {
        return new SillaGamer();
    }

    @Override
    public Escritorio crearEscritorio() {
        return new EscritorioDiseño();
    }
    
}
