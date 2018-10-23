package objects;

public class Constructor {
int id;
String name;
char symbol;
Constructor(int i, String s){
	id=i;
	name=s;
}
Constructor(){}
Constructor(int i, String s, char c){
	id=i;
	name=s;
	symbol=c;
}
void display(){
	System.out.println(id+" "+name+" "+symbol);
}
public static void main(String[] args){
	
	Constructor a=new Constructor();//12,"rere",'r');
	Constructor b=new Constructor();//a.id,a.name);	
	Constructor c=new Constructor();
	a.display();
	b.display();
	c.display();
}
}