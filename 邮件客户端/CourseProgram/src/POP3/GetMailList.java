package POP3;

import java.io.IOException;

public class GetMailList extends POP3 {
	public static void getMailList() throws IOException {
		String message="";
		String line=null;
		
		pw.println("list");
		line=br.readLine();
		while(!".".equalsIgnoreCase(line)) {
			line=br.readLine().toString();
			if(!".".equals(line))
				message=message+line+"\n";
		}
		System.out.println(message);
	}
}
