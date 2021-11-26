package exercise.flower.service;

import exercise.flower.model.Flower;
import exercise.flower.repository.IFlowerRipository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FlowerService implements IFlowerService{
    @Autowired
    private IFlowerRipository flowerRipository;

    @Override
    public Iterable<Flower> findAll() {
        return flowerRipository.findAll();
    }

    @Override
    public Optional<Flower> findById(Long id) {
        return flowerRipository.findById(id);
    }
}
