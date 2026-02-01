import java.util.ArrayList;

public class EjemploDescuento {
    
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Naranja");
        arr.add("Manzana");
        arr.add("Mango");
        arr.add(2, "Pera");

        arr.remove(2);
        System.out.println(arr.size());

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println(arr.contains("Pera"));
        for (String fruta : arr) {
            System.out.println(fruta);
        }
    }
}
