import java.util.ArrayList;

public class SelectSort {
    public static void doSelectionSort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int pos = i;
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(pos))
                    pos = j;
            }
            int min = arr.get(pos);
            arr.set(pos, arr.get(i));
            arr.set(i, min);




        }

    }
}