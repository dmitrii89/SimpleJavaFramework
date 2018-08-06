package simple.framework.util;

public class Tupple<K,V> {
    K first;
    V second;

    public Tupple(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "[first: " + first + "; second: " + second + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tupple<?, ?> tupple = (Tupple<?, ?>) o;

        return first != null ? first.equals(tupple.first) : tupple.first == null;
    }

    @Override
    public int hashCode() {
        return first != null ? first.hashCode() : 0;
    }
}
