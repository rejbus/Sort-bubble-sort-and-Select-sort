public class SortList {
   public static void sortList() {
        Data.sortNumberList.add(Data.numberList.get(0));

        for (int i = 1; i < Data.numberList.size(); i++) {
            Integer numberToInsert = Data.numberList.get(i);
            int indexToInsert = findIndexToInsert(numberToInsert);
            Data.sortNumberList.add(indexToInsert, numberToInsert);
        }

    }

    private static int findIndexToInsert(Integer numberToInsert) {
        for (int i = 0; i < Data.sortNumberList.size(); i++) {
            if (numberToInsert < Data.sortNumberList.get(i)) {
                return i;
            }
        }
        return Data.sortNumberList.size();
    }
}
