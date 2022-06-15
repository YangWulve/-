package POP3;

import java.io.IOException;

public class POP3Exit extends POP3 {
	public static void POP3exit() {
		try {
			pw.println("QUIT");
			System.out.println(br.readLine());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
