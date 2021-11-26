package exercise.flower.service;

import exercise.flower.model.Flower;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IFlowerService {
    Iterable<Flower> findAll();
    Optional<Flower> findById(Long id);
}
