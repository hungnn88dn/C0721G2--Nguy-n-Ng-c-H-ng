package exercise.service;

import exercise.model.Song;

import java.util.List;

public interface SongService {
    List<Song> findAll();

    Song findOne(int id);

    Song save(Song song);

    List<Song> save(List<Song> songs);

    void delete(int id);

    void delete(List<Song> songs);

    public void create(Song song);
}