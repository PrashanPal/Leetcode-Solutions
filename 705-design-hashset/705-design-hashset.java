class MyHashSet extends HashSet<Integer>{
   boolean b[]=new boolean[10000001];;
       public MyHashSet() {
       //MyHashSet a=new     MyHashSet();
         // b =new boolean[10000001];
          // int p=5;
    }
    
    public void add(int key) {
        b[key]=true;
    }
    
    public void remove(int key) {
        if(b[key]){
            b[key]=false;
        }
    }
    
    public boolean contains(int key) {
       // System.out.print(p+" ");
        return b[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */