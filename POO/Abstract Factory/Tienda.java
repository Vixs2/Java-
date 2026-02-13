
public class Tienda {
    
    private IFactory factory;

    //Constructor de la clase.
    public Tienda(IFactory factory){
        this.factory = factory;
    }

    public void mostrarCombinacion(){
        Silla silla = factory.crearSilla();
        Escritorio escritorio = factory.crearEscritorio();

        silla.descripcion();
        escritorio.descripcion();
    }
}
