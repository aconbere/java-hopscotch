package org.conbere.hopscotch;

import java.util.concurrent.ConcurrentMap;
import java.util.Map;
import java.util.Set;
import java.util.AbstractMap;

public class HopscotchHashMap<K,V> extends AbstractMap<K,V> implements ConcurrentMap<K,V>
{
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    static final int DEFAULT_CONCURRENCY_LEVEL = 16;
    static final int DEFAULT_CACHE_LINE_SIZE = 16;
    static final boolean DEFAULT_IS_OPTIMIZE_CACHE_LINE = true;
    static final int DEFAULT_HOP_RANGE = 16;

    private Entry<K,V>[] table;

    final Segment<K,V>[] segments;

    final int segmentShift;
    final int segmentMask;
    final int bucketMask;
    final int hopRange;

    public HopscotchHashMap(int initialCapacity, int concurrencyLevel, int cacheLineSize, boolean isOptimizeCacheline, int hopRange)
    {
        this.table = new Entry [initialCapacity];
        this.segments = new Segment [initialCapacity];
        this.segmentShift = 0;
        this.segmentMask = 0;
        this.bucketMask = 0;

        this.hopRange = hopRange;
    }

    public HopscotchHashMap()
    {
        this(DEFAULT_INITIAL_CAPACITY, DEFAULT_CONCURRENCY_LEVEL, DEFAULT_CACHE_LINE_SIZE, DEFAULT_IS_OPTIMIZE_CACHE_LINE, DEFAULT_HOP_RANGE);
    }

    private Segment<K,V> getSegment(int hash)
    {
        return null;
    }

    private Bucket<K,V> getBucket(Segment<K,V> segment, int hash)
    {
        return null;
    }

    private int hash(K key)
    {
        return 0;
    }

    @Override public Set<Map.Entry<K,V>> entrySet()
    {
        return null;
    }

    @Override public V put(K key, V value)
    {
        int hash = hash(key);
        Segment<K,V> segment = getSegment(hash);
        Bucket<K,V> bucket = getBucket(segment, hash);
        return value;
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

    private class Segment<K,V>
    {
    }

    private class Bucket<K,V>
    {
    }
}
