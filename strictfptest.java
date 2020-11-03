public strictfp class strictfptest{

public static void main(String[] args){
strictfptest s = new strictfptest();
double a = s.add();
System.out.println(a);
double obj = s.showvalue();
System.out.println(obj);
double g = s.getValue();
System.out.println(g);

}
public double add(){
return (15.5/2)+(12.3/4);
}
public double showvalue(){
return 20.2/4;
}
public double getValue(){
return 14.5/4;
}
}