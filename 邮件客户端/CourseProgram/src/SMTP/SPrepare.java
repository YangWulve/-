package SMTP;

import java.io.*;
import java.net.*;

public class SPrepare extends SMTP{
	public void SMTPPrepare(int Choice) {
		try {
			String host="";
			int port=0;
			
			switch(Choice) {
			case 1:
				host+="smtp.126.com";
				port=25;
				break;
			case 2:
				host+="smtp.163.com";
				port=25;
				break;
//			case 3:
//				host+="smtp.qq.com";
//				port=587;
//				break;
			}
			
//			System.out.println(host);
//			System.out.println(port);
			
			socket=new Socket(host,port);
			InputStream inputStream=socket.getInputStream();
			InputStreamReader isr=new InputStreamReader(inputStream);
			br=new BufferedReader(isr);
			
			OutputStream outputStream=socket.getOutputStream();
			pw=new PrintWriter(outputStream,true);
			System.out.println("Server: "+br.readLine());
			
			SayHellow.sayHellow();
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
