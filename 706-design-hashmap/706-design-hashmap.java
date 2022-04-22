class MyHashMap {
 ArrayList<Integer> k;
     ArrayList<Integer> v;
    
    public MyHashMap() {
        k=new ArrayList<>();
        v=new ArrayList<>();
    }
    
    public void put(int key, int value) {
        if(k.contains(key)){
            int i=k.indexOf(key);
            v.set(i,value);
        }
        else{
            k.add(key);
            v.add(value);
        }
    }
    
    public int get(int key) {
        if(k.contains(key)){
             int i=k.indexOf(key);
            return v.get(i);
        }
        else return -1;
    }
    
    public void remove(int key) {
         if(k.contains(key)){
            int i=k.indexOf(key);
             k.remove(i);
             v.remove(i);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */