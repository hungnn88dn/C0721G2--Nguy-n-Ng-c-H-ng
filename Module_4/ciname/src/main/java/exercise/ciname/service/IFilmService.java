package exercise.ciname.service;

import exercise.ciname.model.Cinema;
import exercise.ciname.model.Film;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IFilmService {
    public List<Film> findAll();
    public Film findById(int id);
}
