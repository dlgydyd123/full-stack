package ex03_polymorphism;

//컴퓨터실
public class ComputerRoom {
 
	//필드에 있는 것이 기본자료형이 아닌 객체변수가 선언
	//String str;
	//Samsung com1;
	//Samsung com2;
	//LZ com1;
	//LZ com2;
	
	Computer com1;
	Computer com2;
	Computer com3;
	
	public void allPowerOn() {
		com1.powerOn();
		com2.powerOn();
		com3.powerOn();
	}
	
	public void allPowerOff() {
		com1.powerOff();
		com2.powerOff();
		com3.powerOff();
	}
}
