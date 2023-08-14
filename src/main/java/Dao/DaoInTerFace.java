package Dao;

public interface DaoInTerFace<T> {
    public int Add(T t);
    public int Edit(T t);
    public  int Delete(T t);
}
