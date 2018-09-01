import java.io.*;
public class ReadUtil {
    public static void readUtil() throws IOException {
        BufferedReader bufferedReader = null;
        try {
            String line = null;
            String line2 = null;
            FileReader fileReader = new FileReader(Data.filePath);
            bufferedReader = new BufferedReader(fileReader);
            line2 = bufferedReader.readLine();
            Data.sort.add(line2);
            while ((line = bufferedReader.readLine()) != null) {
                Data.numberList.add(Integer.parseInt(line));
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        bufferedReader.close();


    }
}
