package interview.com;

public class Basicmathematicaloperations {
	
public  static int math(char n,int a,int b ) {
if(n=='+')
{
	return a+b;

}
if(n=='*')
{
	return a*b;

}
if(n=='/')
{
	return a/b;

}
if(n=='-')
{
	return a-b;
}

return 0;
}
public static void main(String[] args) {
	System.out.println(math('*',2,6));
}
}
//"Your task is to create a function that does four basic mathematical operations.The function should take three arguments - operation(string/char), value1(number), value2(number).
//The function should return result of numbers after applying the chosen operation.('+', 4, 7) --> 11
//('-', 15, 18) --> -3
//('*', 5, 5) --> 25
//('/', 49, 7) --> 7