package _16_io_textfile_java.exercise.read_file_csv;

public class Country {
    private int stt;
    private String countryCode;
    private String countryName;
    Country(){

    }
    public Country(int stt, String countryCode, String countryName) {
        this.stt = stt;
        this.countryCode = countryCode;
        this.countryName = countryName;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return stt+","+countryCode+","+countryName;
    }
}
