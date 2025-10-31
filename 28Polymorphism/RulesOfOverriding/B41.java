class A41{
    P m1(){
	return new P();
    }
}
class B41 extends A41{
    P m1(){
	return new Q();
    }
}