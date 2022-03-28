package com.company.Day2503;

public class DefaultPair<K,V> implements Pair<K,V>{
   private K key;
   private V value;

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    DefaultPair(K key,V value){
        this.key=key;
        this.value=value;
    }
}
