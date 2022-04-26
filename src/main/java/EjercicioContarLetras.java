import java.util.HashMap;
import java.util.Scanner;

public class EjercicioContarLetras {
    public static void main(String[] args){
        String[] arrayLetras = new String[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrayLetras.length; i++){
            arrayLetras[i] = sc.nextLine();
        }
        System.out.printf(contarLetrasRepetidas(arrayLetras));
    }

    public static String contarLetrasRepetidas(String[] arrayLetras){
        if (arrayLetras == null)
            return null;

        HashMap<String, Integer> map = new HashMap<>();
        for (String letra : arrayLetras){
            if (map.containsKey(letra)){
                Integer value = map.get(letra);
                value++;
                map.replace(letra, value);
            } else {
                map.put(letra, 1);
            }
        }
         return map.toString();
    }
}
