package hw1;

import java.nio.file.spi.FileSystemProvider;

public class Homework01 {
	public static void main(String[] args) {
		/*
		 * 請設計一隻Java程式，計算12，6這兩個數值的和與積
		 */
		System.out.println("請設計一隻Java程式，計算12，6這兩個數值的和與積");

		int count01 = 12;
		int count02 = 6;

		int sun = count01 + count02;

		int product = count01 * count02;
		System.out.println("兩個數值的和=" + sun);
		System.out.println("兩個數值的積=" + product);
		System.out.println("===============================");
		/*
		 * 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		 */
		System.out.println("請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)");
		int egg = 200;
		int dozen = egg / 12;
		int remain = egg % 12;

		System.out.println("一共" + dozen + "打加" + remain + "顆蛋");

		System.out.println("===============================");
		
		System.out.println("請由程式算出256559秒為多少天、多少小時、多少分與多少秒");
		
		int second = 256559 ;
		int minute = second /60 ;
		int remainSec = second % 60 ;
		int hour = minute / 60 ;
		int remainHour = minute % 60 ;
		int day = hour / 24 ;
		int remainDay = hour % 24 ;
		
		System.out.println("256559秒為"+ day + "天"+remainDay+"小時"+remainHour +"分"+remainSec+"秒");
		
		System.out.println("===============================");
		
		
		
		System.out.println("請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長");
		
		final double circle = 3.1415 ;
		int radius = 5 ;
		
		double area = radius*radius*circle ;
		double circumference =radius*2*circle;
		
		System.out.printf("圓面積=%.5f, 圓周長=%.5f", area, circumference);
		System.out.println();
		System.out.println("===============================");
		
		System.out.println("某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢");
		
		double principal = 1500000.0;
        double rate = 0.02;
        int years = 10;
        
        double total = principal * Math.pow((1 + rate), years);
        
        System.out.println("總金額為"+  total );
        
		System.out.println("===============================");

		System.out.println(5 + 5);
		//此行維數字int的數字5+5  故等於10
		
		System.out.println(5 + '5');
		//'5'代表Unicode 編碼的紙53,固等int 數字5+53 故等於 58
		
		System.out.println(5 + "5");
		//"5"代表著字串，字串的加號代表著字串的合併，故等於55

		
		
		
		
	}

}
