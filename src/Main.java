import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        try {
            ReadUtil.readUtil();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (Data.sort.get(0).equalsIgnoreCase("BO")){
            BubbleSorting.bubbleSort(Data.numberList);
            System.out.println(Data.numberList);

        }else if (Data.sort.get(0).equalsIgnoreCase("CHO")){
            SelectSort.doSelectionSort(Data.numberList);
            System.out.println(Data.numberList);
        }





    }
}



