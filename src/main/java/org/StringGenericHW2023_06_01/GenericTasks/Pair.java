package org.StringGenericHW2023_06_01.GenericTasks;

// TODO: Напишите параметризированный класс "Pair",
//  который принимает два различных типа данных в качестве параметров (например, "Pair").
//  Реализуйте методы для получения и установки значений каждого из элементов пары.
public class Pair <K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
