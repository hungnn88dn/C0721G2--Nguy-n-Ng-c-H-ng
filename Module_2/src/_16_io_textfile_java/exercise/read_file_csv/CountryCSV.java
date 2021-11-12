package _16_io_textfile_java.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountryCSV {

   public static List<Country> readNational(String pathFile) {
       ArrayList<Country>  countryList= new ArrayList<>();
       try{
          File file = new File(pathFile);
          if(!file.exists()) {
              throw new FileNotFoundException();
          }
           BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
           String line= "";
           while((line = bufferedReader.readLine()) !=null) {
               String[] lineSplit=  line.split(",");
               Country country= new Country(Integer.parseInt(lineSplit[0]),lineSplit[1],lineSplit[2]);
               countryList.add(country);
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
       return countryList;
   }

    public static void main(String[] args) {
        List<Country> list= CountryCSV.readNational("src\\_16_io_textfile_java\\exercise\\read_file_csv\\list");
        for(Country l: list){
            System.out.println(l);
        }

    }
}
