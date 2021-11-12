package model;

public class BookCard {
    private String id;
    private String bookID;
    private String studentID;
    private String status;
    private String startDay;
    private String endDay;

    public BookCard(String id, String bookID, String studentID, String status, String startDay, String endDay) {
        this.id = id;
        this.bookID = bookID;
        this.studentID = studentID;
        this.status = status;
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }
}
