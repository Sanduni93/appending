class Lab6Ex3{
	
	public static void main(String args[]){
	
StringBuffer sb = new StringBuffer("Java is portable language which is suitable for any heterogenous environment.");
//initial
System.out.println("Initial value:"+sb);

//appending
sb.append(" As well it is simple.");
System.out.println("After appending the value:"+sb);

//insert
sb.insert(15," and secure");	
System.out.println("After inserting the value:"+sb);

//reverse
System.out.println(sb.reverse());
		
		
	}


}