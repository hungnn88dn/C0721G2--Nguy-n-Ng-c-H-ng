package excercise.repository;

import excercise.bean.Dictionary;

import java.util.List;
import java.util.Map;

public interface IRepo {
      Map<String, Dictionary> findAll();
}
