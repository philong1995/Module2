package exercise;

import java.io.*;

public class CopyClass {

    public static final String ORIGINAL ="/Users/macbookpro/Desktop/Module2/_15_IO_Text_file/src/exercise/OriginalFile.csv";
    public static final String COPY ="/Users/macbookpro/Desktop/Module2/_15_IO_Text_file/src/exercise/FileCopy.csv";

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter(COPY, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            FileReader fileReader = new FileReader(ORIGINAL);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

