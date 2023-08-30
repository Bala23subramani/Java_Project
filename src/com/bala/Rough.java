package com.bala;

public class Rough {
	public static void main(String[] arg) {
		int age=30;
        int mark=50;
        int result =(age>=mark)?age:mark;
        System.out.println("result ="+result);
      
        int up=40;
        int down=50;
        int call=(up>down)?up:down;
        System.out.println("Buy at="+call);
        
        int y = 10;
        char m; 
        if (y % 2 == 0) {
            m = 'P';
        } else {
            m = 'Q';
        }
        
        System.out.println(m);
	}

}
