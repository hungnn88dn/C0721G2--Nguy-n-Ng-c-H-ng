package exercise.model;

public class EmailSetting {
    private String language;
    private int size;
    private String spamFilter;
    private String signature;

    public EmailSetting() {
    }

    public String getLanguage() {
        return language;
    }

    public EmailSetting(String language, int size, String spamFilter, String signature) {
        this.language = language;
        this.size = size;
        this.spamFilter = spamFilter;
        this.signature = signature;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(String spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
