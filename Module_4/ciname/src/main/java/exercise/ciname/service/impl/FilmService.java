package exercise.ciname.service.impl;

import exercise.ciname.model.Film;
import exercise.ciname.repository.FilmRepository;
import exercise.ciname.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService implements IFilmService {

    @Autowired
    FilmRepository filmRepository;
    @Override
    public List<Film> findAll() {
        return this.filmRepository.findAll();
    }

    @Override
    public Film findById(int id) {
        return this.filmRepository.findById(id).orElse(null);
    }
}
