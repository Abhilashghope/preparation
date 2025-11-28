package DSA.LRU.Cache;

public class Pair<T, R> {
    public T key;
    public R value;

    public Pair(T key, R value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }

}
