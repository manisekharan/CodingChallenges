package amazon;

// Java program to implement LRU cache
// using LinkedHashSet
public class LRUCacheHashMap {
/*
    Map<Integer,Integer> cache;
    int capacity;

    public LRUCacheHashMap(int capacity)
    {
        this.cache = new LinkedHashMap<Integer,Integer>(capacity);
        this.capacity = capacity;
    }

    // This function returns false if key is not
    // present in cache. Else it moves the key to
    // front by first removing it and then adding
    // it, and returns true.
    public boolean get(int key)
    {
        if (!cache.containsKey(key))
            return false;
        System.out.println("Before removing : ");
        display();
        System.out.println();
        cache.remove(key);
        System.out.println("After removing : ");
        display();
        System.out.println();
        //cache.put(key);
        System.out.println("After adding : ");
        display();
        System.out.println();

        return true;
    }

    *//* Refers key x with in the LRU cache *//*
    public void refer(int key)
    {
        if (get(key) == false)
            put(key);
    }

    public void put(int key)
    {
        // If already present, then
        // remove it first. Note that
        // we are going to add later
        if (cache.contains(key))
            cache.remove(key);

            // If cache size is full, remove the least
            // recently used.
        else if (cache.size() == capacity) {
            int firstKey = cache.iterator().next();
            cache.remove(firstKey);
        }

        cache.add(key);
    }

    // display contents of cache
    public void display()
    {
        Iterator<Integer> itr = cache.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    public static void main(String[] args)
    {
        LRUCacheHashMap ca = new LRUCacheHashMap(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();
    }*/
}