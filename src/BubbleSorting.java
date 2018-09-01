import java.util.ArrayList;

public class  BubbleSorting {
    public static void bubbleSort(ArrayList<Integer> list) {

        int temp;
        for (int x = 0; x < list.size(); x++) {

            for (int i = 0; i < list.size() - x - 1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);

                }
            }

        }

    }
}



