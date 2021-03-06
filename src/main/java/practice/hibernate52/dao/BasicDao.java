package practice.hibernate52.dao;

import java.util.List;

public interface BasicDao {
    <T> T get(Class<T> tClass, long id);
    <T> List<T> get(Class<T> tClass);
    <T> List<T> get(Class<T> tClass, List ids);

    <T> List<T> getHqlResult(String hql);

}
