package repository;

import model.Book;
import model.BookCard;
import service.IBookCardService;

import java.sql.SQLException;
import java.util.List;

public interface IBookCardRepo extends IBookCardService {
    public void insertBookCard(BookCard bookCard) throws SQLException;

    public BookCard selectBookCard(int id);

    public List<BookCard> selectAllBookCard();
    public List<Book> selectAllBook();

    public boolean deleteBookCard(int id) throws SQLException;

    public boolean updateBookCard(BookCard bookCard) throws SQLException;
}
