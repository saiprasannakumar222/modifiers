class basic_modifier{

public static void main(String[] args){
basic_modifier b = new basic_modifier();
b.dog_sound();
b.cat_sound();
basic_modifier1 b1 = new basic_modifier1();
b1.bike();
b1.car();
}
protected void dog_sound(){
System.out.println("bow bow");
}
private void cat_sound(){
System.out.println("meow meow");
}
}
class basic_modifier1 extends basic_modifier{
public void bike(){
System.out.println("bike has 2 wheels");
}
protected void car(){
System.out.println("car has 4 wheels");
}
}