public class mained{
public static void main(String[] args){
demo  d = new demo();
d.setName("sai");
System.out.println(d.getName());
}
}
class demo{
private String name;

public String getName(){
return this.name;
}
public void setName(String name){
this.name = name;
}
}