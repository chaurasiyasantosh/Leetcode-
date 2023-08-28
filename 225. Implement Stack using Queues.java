class MyStack {
Queue<Integer> q = new LinkedList<>();

public MyStack() {
    
}

public void push(int x) {
    q.add(x);
}

public int pop() {
     
for(int i =  1 ; i<=q.size()-1; i++){
  q.add(q.remove());
}
int val = q.remove();
 return val;
}
public int top() {  // peeck

for(int i =  1 ; i<=q.size()-1; i++){
  q.add(q.remove());
}
int val = q.peek();
  q.add(q.remove());
  return val;
}

public boolean empty() {
    if(q.size()==0) return true;
    else return false;
}
}
