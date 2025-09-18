package repositories;

import java.util.List;

public interface Repository <T,x>{
    void save(T t) throws Exception;
    T findById(x id);
    List<T> findAll();
    void deleteById(x id);
}
