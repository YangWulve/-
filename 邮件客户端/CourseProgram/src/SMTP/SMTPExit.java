package SMTP;

import java.io.*;

public class SMTPExit extends SMTP {
	public void SMTPexit() {
		try {
			pw.println("rset");
			System.out.println(br.readLine());
			pw.println("quit");
			System.out.println(br.readLine());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
