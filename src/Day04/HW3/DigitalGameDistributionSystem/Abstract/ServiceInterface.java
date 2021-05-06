package Day04.HW3.DigitalGameDistributionSystem.Abstract;

public interface ServiceInterface<T> {
    void add(T[] a);

    void update(T[] a);

    void delete(T[] a);
}
