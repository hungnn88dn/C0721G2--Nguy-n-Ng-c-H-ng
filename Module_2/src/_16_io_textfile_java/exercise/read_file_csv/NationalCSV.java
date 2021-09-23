package _16_io_textfile_java.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NationalCSV {

   public static List<String> readNational(String pathFile) {
       List<String>  nationalList= new ArrayList<>();
       try{
          File file = new File(pathFile);
          if(!file.exists()) {
              throw new FileNotFoundException();
          }
           BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
           String line= "";
           while((line = bufferedReader.readLine()) !=null) {
               nationalList.add(line);
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
       return nationalList;
   }

    public static void main(String[] args) {
        List<String> list= NationalCSV.readNational("src\\_16_io_textfile_java\\exercise\\read_file_csv\\list");
        for(String l: list){
            System.out.println(l);
        }
    }
}
