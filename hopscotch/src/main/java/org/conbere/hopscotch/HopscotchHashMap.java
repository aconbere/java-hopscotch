package org.conbere.hopscotch;

import java.util.concurrent.ConcurrentMap;
import java.util.Map;
import java.util.Set;
import java.util.AbstractMap;

public class HopscotchHashMap<K,V> extends AbstractMap<K,V> implements ConcurrentMap<K,V>
{
    private int DEFAULT_INITIAL_CAPACITY = 16;

    private Entry<K,V>[] table;

    public HopscotchHashMap() {
        this.table = new Entry [DEFAULT_INITIAL_CAPACITY];
    }

    @Override public Set<Map.Entry<K,V>> entrySet()
    {
        return null;
    }

    @Override public V replace(K key, V value)
    {
        return null;
    }

    @Override public boolean replace(K key, V oldValue, V newValue)
    {
        return true;
    }

    @Override public boolean remove(Object key, Object value)
    {
        return true;
    }

    @Override public V putIfAbsent(K key, V value)
    {
        return null;
    }



    // @Override public V put(K key, V value)
    // {
    //     this.entries[hashCode(key)] = value;
    //     return value;
    // }
}
