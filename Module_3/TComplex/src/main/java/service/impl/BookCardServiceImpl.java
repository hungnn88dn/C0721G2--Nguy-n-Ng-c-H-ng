package service.impl;

import model.BookCard;
import service.IBookCardService;

import java.sql.SQLException;
import java.util.List;

public class BookCardServiceImpl implements IBookCardService {
    @Override
    public void insertBookCard(BookCard bookCard) throws SQLException {

    }

    @Override
    public BookCard selectBookCard(int id) {
        return null;
    }

    @Override
    public List<BookCard> selectAllBookCard() {
        return null;
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
