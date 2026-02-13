
public class Main {
    public static void main(String[] args) {
        
        //Se selecciona una de las combinaciones (COLORIDA).
        IFactory factory = new CombinacionColor();


        //Se hace el llamado a la tienda (CLIENTE).
        Tienda tienda = new Tienda(factory);
        tienda.mostrarCombinacion();
    }
}
