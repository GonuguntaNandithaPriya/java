class A{
int a;
}
class B extends A{
int b;
B(){
a=10;
b=20;
}
void sum(){
System.out.println("sum:"+(a+b));
}
}
class Test{
public static void main(String args[])
{
B obj= new B();
obj.sum();
}
}
