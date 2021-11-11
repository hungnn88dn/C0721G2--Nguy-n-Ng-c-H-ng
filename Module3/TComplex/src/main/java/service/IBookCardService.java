package service;

import model.BookCard;

import java.sql.SQLException;
import java.util.List;

public interface IBookCardService {
    public void insertBookCard(BookCard bookCard) throws SQLException;

    public BookCard selectBookCard(int id);

    public List<BookCard> selectAllBookCard();


    public boolean deleteBookCard(int id) throws SQLException;

    public boolean updateBookCard(BookCard bookCard) throws SQLException;
}
