import java.util.Stack;

public class stack_sort_ascending{
	static Stack<Integer> r = new Stack<Integer>();
	

	public static void main(String[] args){

		Stack<Integer> s = new Stack<Integer>();
		s.push(5);
		s.push(1);
		s.push(3);
		s.push(6);
		move(s);
		while(!r.isEmpty()){
			System.out.println(r.pop());
		}
	}

	
	public static void move(Stack<Integer> s){
		while(!s.isEmpty()){
			int tmp = s.pop();
			while(!r.isEmpty() && r.peek()>tmp){
				s.push(r.pop());

			}
			r.push(tmp);
		}


	}



}
