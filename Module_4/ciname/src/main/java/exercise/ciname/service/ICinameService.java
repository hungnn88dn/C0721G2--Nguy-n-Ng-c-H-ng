package exercise.ciname.service;


import exercise.ciname.model.Cinema;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ICinameService {
    public List<Cinema> findAll();
    public Cinema findById(int id);
    Cinema save(Cinema cinema);
    void delete(Cinema cinema);
    void deleteById(int id);
    public Page<Cinema> findAllCinema(Pageable pageable);
    public Page<Cinema> findAllCinemaByFilmID(int id,Pageable pageable);

}
