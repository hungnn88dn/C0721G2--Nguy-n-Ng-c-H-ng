package _16_io_textfile_java.exercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyText {
   public static  List<String>  myList= new ArrayList<>();
    public static  void readFileText(String filePath) {
      try {
          File file = new File(filePath);
          if(!file.exists()) {
              throw new FileNotFoundException();
          }
          BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
          String line= "";

          while((line = bufferedReader.readLine()) != null){
              myList.add(line);
          }
      }catch (Exception e) {
          System.out.println("Lỗi hệ thống");
      }
    }

    public static void writeFile(String filePath){
        try {
            File file = new File(filePath);
            if(file.exists()) {
                throw new FileNotFoundException("File đã tồn tại");
            }
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            String line= "";
            for (String list: myList) {
                bufferedWriter.write(list);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CopyText.readFileText("src\\_16_io_textfile_java\\exercise\\copy_file_text\\source.txt");
        CopyText.writeFile("src\\_16_io_textfile_java\\exercise\\copy_file_text\\target.txt");
    }
}
