package Client;

import java.util.*;

public class Menu {
	public static void menu(User user) {
		
		Calendar time=Calendar.getInstance();
		
		int hour=time.get(Calendar.HOUR_OF_DAY);
		
		String text="";
		
		if(hour<5||hour>=22) {
			text="夜深了";
		}else if(hour>=5&&hour<8) {
			text="早上好";
		}else if(hour>=8&&hour<11) {
			text="上午好";
		}else if(hour>=11&&hour<14) {
			text="中午好";
		}else if(hour>=14&&hour<18) {
			text="下午好";
		}else if(hour>=18&&hour<22) {
			text="晚上好";
		}
		
		System.out.println(user.getUsername()+text+"欢迎使用本邮件平台：");
		System.out.println("1) 写邮件");
		System.out.println("2) 收件箱");
		System.out.println("3) 退出登录");
		System.out.println("4) 退出");
		System.out.print("请选择您需要使用的功能（请输入对应序号）：");
	}
}
