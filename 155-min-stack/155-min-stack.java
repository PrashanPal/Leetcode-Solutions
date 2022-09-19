class MinStack {
   Stack<Integer> s=new Stack<>();
     // Stack<Integer> m=new Stack<>();
    int m=Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
           if(val<=m){
		s.push(m);//.ie. previous min
		s.push(val);//new min
		m=val;//update current min
		}
        else
         s.push(val);//new min   
    }
    
    public void pop() {
       	   if(s.peek()==m){
			 s.pop();//current min  now gone
			 m=s.pop();// next min
			 }
			 else
			 s.pop();
    }
    
    public int top() {
        return s.peek(); 
    }
    
    public int getMin() {
       return m;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */