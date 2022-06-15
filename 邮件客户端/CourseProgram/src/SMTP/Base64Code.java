package SMTP;

import java.util.Base64;

public class Base64Code {
	public static String EncodeBase64(byte[] data) {
		String newcode=Base64.getEncoder().encodeToString(data);
		return newcode;
	}
	
	public static String DecodeBase64(byte[] data) {
		byte[] result=Base64.getDecoder().decode(data);
		String newcode = new String(result);
		return newcode;
	}
}
