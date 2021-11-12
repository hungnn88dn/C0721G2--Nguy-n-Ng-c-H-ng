package repository.impl;

import model.Book;
import model.BookCard;
import model.Student;
import repository.IBookCardRepo;
import service.IBookCardService;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class BookCardRepoImpl implements IBookCardRepo {
    private String jdbcURL = "jdbc:mysql://localhost:3306/library?SSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Blackberry88";

    private static final String INSERT_CARD_SQL = "insert into book_card (id,book_id, stundent_id,`status`,start_day,end_day) " +
            " value (?,?,?,?,?,?);";
    private static final String SELECT_CARD_BY_ID = "select `name`,age,cmnd,salary,phone,email,address," +
            " position_id,level_id,department_id,user_username from employee where id =?";
    private static final String SELECT_ALL_CARD = "select * from book_card;";
    private static final String DELETE_RCARD_SQL = "delete from remises where id = ?;";
    private static final String UPDATE_CARD_SQL = "update remises set name = ?,area= ?, floor = ?,`description` =?, price= ?," +
            " start_day =? ,end_day = ?,status_id = ? ,type_remises_id = ? where id = ?;";
    private static final String SELECT_ALL_STUDENT= "select * from student;";
    private static final String SELECT_ALL_BOOK= "select * from book;";


    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }


    public List<Student> selectAllStudent() {
        List<Student> students = new LinkedList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_STUDENT);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                 int id = Integer.parseInt(rs.getString("id"));
                String name = rs.getString("name");
                String studentClass = rs.getString("class");
                students.add(new Student(id,name ,studentClass));
            }
        } catch (SQLException ignored) {
        }
        return students;
    }

    public List<Book> selectAllBook() {
        List<Book> books = new LinkedList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BOOK);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                 String author = rs.getString("author");
                int amount = Integer.parseInt(rs.getString("amount"));
                String decription = rs.getString("description");
                books.add(new Book(id,name ,author,amount,decription));
            }
        } catch (SQLException ignored) {
        }
        return books;
    }

    @Override
    public void insertBookCard(BookCard bookCard) throws SQLException {
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CARD_SQL)) {
            preparedStatement.setString(1, bookCard.getId());
            preparedStatement.setString(2, bookCard.getBookID());
            preparedStatement.setInt(3, Integer.parseInt(bookCard.getStudentID()));
            preparedStatement.setInt(4, Integer.parseInt(bookCard.getStatus()));
            preparedStatement.setString(5, bookCard.getStartDay());
            preparedStatement.setString(6, bookCard.getEndDay());
            preparedStatement.executeUpdate();
        } catch (SQLException ignored) {
        }
    }

    @Override
    public BookCard selectBookCard(int id) {
        return null;
    }

    @Override
    public List<BookCard> selectAllBookCard() {
        List<BookCard> bookCards = new LinkedList<>();
        List<Student> students = selectAllStudent();
        List<Book> books = selectAllBook();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CARD);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String status_id = rs.getString("status");
                String status= "";
                if (status_id.contains("1")) {
                    status = "Cho Muon";
                } else {
                    status = "Da Tra";
                }
                String start = rs.getString("start_day");
                String end = rs.getString("end_day");
                int studentID = Integer.parseInt(rs.getString("stundent_id"));
                String student = "";
                for (Student s : students) {
                    if (s.getId() == studentID) {
                        student = s.getName();
                    }
                }
                String bookID = rs.getString("book_id");
                String book = "";
                for (Book b : books) {
                    if (b.getId().equals(bookID)) {
                        book = b.getName();
                    }
                }

                bookCards.add(new BookCard(id, book,student,status,start,end));
            }
        } catch (SQLException ignored) {
        }
        return bookCards;
    }

    @Override
    public boolean deleteBookCard(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateBookCard(BookCard bookCard) throws SQLException {
        return false;
    }
}
