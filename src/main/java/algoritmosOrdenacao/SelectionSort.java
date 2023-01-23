package algoritmosOrdenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    public static void selection_sort(List<Integer> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i; j < n; j++) {
                if (lista.get(j) < lista.get(min_index)) {
                    min_index = j;
                }
            }
            if (lista.get(i) > lista.get(min_index)) {
                int aux = lista.get(i);
                lista.set(i, lista.get(min_index));
                lista.set(min_index, aux);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(4,124,2,5,6,23,8,34);
        System.out.println(lista.toString());
        selection_sort(lista);
        System.out.println(lista.toString());


    }

}
