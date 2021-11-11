package excercise.repository.impl;

import excercise.bean.Dictionary;
import excercise.repository.IRepo;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RepoImpl implements IRepo {
    static Map<String, Dictionary> dictionaryMap = new TreeMap<>();

    static {
        dictionaryMap.put("Hello", new Dictionary("Xin Chào"));
        dictionaryMap.put("Bye", new Dictionary("Tạm Biệt"));
        dictionaryMap.put("Monday", new Dictionary("Thứ Hai"));
        dictionaryMap.put("Sunday", new Dictionary("Chủ Nhật"));
    }


    @Override
    public Map<String, Dictionary> findAll() {
        return dictionaryMap;
    }
}
