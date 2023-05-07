import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	static Stack<Character> stack;
	static boolean check;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = "";
        check = false;
             a = sc.next();
             Queue<Character> que = new LinkedList<>();
             stack = new Stack<>();
             Stack<Integer> stackInt = new Stack<>();
             for(int i = 0; i<a.length();i++) {
            	 que.add(a.charAt(i));
             }
             
             
             while(!check && !que.isEmpty()) {
            	 
	             char tmp = que.poll();
	             if(tmp ==')') {
	            	 chekchek();
	            	 if(check) break;
	             	 if(stack.peek()=='(') {
	                	stack.pop();
	                	stack.add('*');
	                	stackInt.add(2);
	                }else if(stack.peek()=='*') {
	                	stack.pop();
	                	chekchek();
	                	if(check) break;
	                	if(stack.peek()=='(') {
	                		stack.pop();
	                		int tmpI = stackInt.pop();
	                		stackInt.add(tmpI*2);
	                		stack.add('*');
	                	}else if(stack.peek()=='*') {
	                		int tmpI = stackInt.pop();
	                		tmpI = tmpI+stackInt.pop();
	                		stackInt.add(tmpI);
	                		stack.pop();
	                		chekchek();
	                		if(check) break;
	                		if(stack.peek()=='(') {
	                			stack.pop();
	                			tmpI =stackInt.pop()*2;
	                			stackInt.add(tmpI);
	                			stack.add('*');		 
	                		}else {
	                			System.out.println(0);
	                			check = true;
	                        	break;
	                		}
	                		//stack.add('*');
	                	}else {
	                		check = true;
	                		System.out.println(0);
	                    	break;
	                	}
	                }else {
	                	check = true;
	                	System.out.println(0);
	                	break;
	                }
	               }else if(tmp == ']') {
	            	   chekchek();
	            	   if(check) break;
	                if(stack.peek()=='[') {
	                	stack.pop();
	                	stack.add('*');
	                	stackInt.add(3);
	                }else if(stack.peek()=='*') {
	                	stack.pop();
	                	chekchek();
	                	if(check) break;
	                	if(stack.peek()=='[') {
	                		stack.pop();
	                		int tmpI = stackInt.pop();
	                		stackInt.add(tmpI*3);
	                		stack.add('*');
	                	}else if(stack.peek()=='*') {
	                		int tmpI = stackInt.pop();
	                		tmpI = tmpI+stackInt.pop();
	                		stackInt.add(tmpI);
	                		stack.pop();
	                		chekchek();
	                		if(check) break;
	                		if(stack.peek()=='[') {
	                			stack.pop();
	                			tmpI =stackInt.pop()*3;
	                			stackInt.add(tmpI);
	                			stack.add('*');		 
	                		}else {
	                			check = true;
	                			System.out.println(0);
	                        	break;
	                		}
	                			 //stack.add('*');
	                	}else {
	                		check = true;
	                		System.out.println(0);
	                    	break;
	                	}
	                }else {
	                	check = true;
	                	System.out.println(0);
	                	break;
	                }
	             }else {
	            	if(!stack.isEmpty() && stack.peek()=='*') {
	            		stack.pop();
	            		if(!stack.isEmpty() && stack.peek()=='*') {
	            			int kk = stackInt.pop();
	            			stackInt.add((kk+stackInt.pop()));
	            		}else {
	            			stack.add('*');
	            		}
	            	}
	                stack.add(tmp);
	             }
	            	 //System.out.print(stackInt+"   ");
	            	 //System.out.print(stack);
	            	 //System.out.println();
	         }
             //System.out.println(stack);
             //System.out.println(stackInt);
             int tt = stack.size();
             if(!check) {
            	 for(int i = 0;i<tt;i++) {
                	 if(stack.pop() != '*') {
                		 check = true;
                       	 System.out.println(0);
                       	 break;
                	 }
                 }
             }
             
             
             if(!check) {
            	 int ans = 0;
                 int t = stackInt.size();
                 for(int i = 0; i<t; i++) {
                	 ans = stackInt.pop()+ans;
                 }
                 System.out.println(ans);
             }
        sc.close();
	
	}
	
	public static void chekchek() {
		if(stack.isEmpty()) {
       	 check = true;
       	 System.out.println(0);
        }
	}
}