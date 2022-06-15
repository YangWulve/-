package POP3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;

public class PPrepare extends POP3 {
	public void POP3Prepare(int mailNo) {
		String host="";
		int port=0;
		
		switch(mailNo) {
		case 1:
			host+="pop3.126.com";
			port=110;
			break;
		case 2:
			host+="pop3.163.com";
			port=110;
			break;
		}
		
		try {
			socket =new Socket(host,port);
			InputStream inputStream=socket.getInputStream();
			InputStreamReader isr=new InputStreamReader(inputStream);
			br=new BufferedReader(isr);
			
			OutputStream outputStream=socket.getOutputStream();
			pw=new PrintWriter(outputStream,true);
			System.out.println("Server: "+br.readLine());
			
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
