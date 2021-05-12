object q3 extends App{
def func(x:Int):Double={
  if(x<=50){
var cost:Double=(24.95+3)*x*(60.0/100.0);
cost;
  }
else{
var cost:Double=(((24.95+3)*50)+((24.95+0.75)*(x-50)))*(60.0/100.0);
cost;
}
}
println(func(60));

}
