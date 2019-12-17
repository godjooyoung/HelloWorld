package common;

public class BoolenaEcample {
public static void main(String[] args) {
	boolean trueOrFalse = 100>20;
	int var1 =10;
	trueOrFalse = var1>15;
	
	for(int i =0; i<10; i++)
	{var1++;
	trueOrFalse = var1 >15;
	if(trueOrFalse)
		System.out.println(var1 + "=>참일경우에");
	else	
	System.out.println(var1 + "=> 거짓일 경우에");
	}
}
}
