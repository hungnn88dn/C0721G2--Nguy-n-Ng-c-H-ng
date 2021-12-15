package exercise.ciname.service.impl;

import exercise.ciname.model.Cinema;
import exercise.ciname.repository.CinemaRepository;
import exercise.ciname.service.ICinameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaService  implements ICinameService {

    @Autowired
    CinemaRepository cinemaRepository;

    @Override
    public List<Cinema> findAll() {
        return this.cinemaRepository.findAll();
    }

    @Override
    public Cinema findById(int id) {
        return this.cinemaRepository.findById(id).orElse(null);
    }

    @Override
    public Cinema save(Cinema cinema) {
        return this.cinemaRepository.save(cinema);
    }

    @Override
    public void delete(Cinema cinema) {
        this.cinemaRepository.delete(cinema);
    }

    @Override
    public void deleteById(int id) {
        this.cinemaRepository.deleteById(id);
    }

    @Override
    public Page<Cinema> findAllCinema(Pageable pageable) {
        return this.cinemaRepository.findAll(pageable);
    }

    @Override
    public Page<Cinema> findAllCinemaByFilmID(int id, Pageable pageable) {
        return this.cinemaRepository.findAllCinemaByFilmId(id,pageable);
    }

    public boolean existsByShowCode(String showCode) {
      return    this.cinemaRepository.existsByShowCode(showCode);
    }
}
