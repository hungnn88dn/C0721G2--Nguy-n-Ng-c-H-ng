package excercise.service;


import excercise.bean.Dictionary;

import java.util.List;
import java.util.Map;

public interface IService {
    Map<String,Dictionary> findAll();
}
