package SMTP;

import java.io.*;

public class SayHellow extends SMTP{
	public static void sayHellow() {
		try {
			pw.println("helo ...");
			String str=br.readLine();
			if(str.charAt(0)!='2'||str.charAt(1)!='5'||str.charAt(2)!='0') {
				System.out.println("Server: "+str);
				System.out.println("HELO ERROR...");
				socket.close();
				System.exit(0);
			}
			System.out.println("Server: "+str);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
