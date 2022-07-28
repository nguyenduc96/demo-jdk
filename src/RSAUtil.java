import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class RSAUtil {

	private static String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDCYLoeU1+QV9xU7d3MI0OVxOUt" +
			"fdebIfTlC+zZel2n6lcoQM/7eYs8mZqMy/XEQnnsKbVc8deOgfEaOc0ITugRku/T" +
			"WaNVjTGU8my6wLU7P+Rb2wDB8PR5bDQFg5w5qfYhr6ZB50HB1E5ek2ngYQrAsUea" +
			"T3VJc29+CprZPtAynwIDAQAB";
	private static String privateKey = "MIICXgIBAAKBgQDCYLoeU1+QV9xU7d3MI0OVxOUtfdebIfTlC+zZel2n6lcoQM/7" +
			"eYs8mZqMy/XEQnnsKbVc8deOgfEaOc0ITugRku/TWaNVjTGU8my6wLU7P+Rb2wDB" +
			"8PR5bDQFg5w5qfYhr6ZB50HB1E5ek2ngYQrAsUeaT3VJc29+CprZPtAynwIDAQAB" +
			"AoGBAKRDygXGv4PkPDcprb7OLldrRaHkL0jSsXq/UTGYz30P9Qf3fcwvMxPLW2iR" +
			"FOj+pLqHpNUfK+MqvO5E2pii1kpKnseyl9Y4/f9FgwVm9JigRhL/D0MW9iiFyA27" +
			"ZRsFDvNF1dQAuGGvd//EYmryjynlVQqBss5s0IvtzppD5w4BAkEA45/MFwHGjS8O" +
			"3vNvRACs0CD5iHEMmis5/27KnDUR5xokWXOg0+8famQ9yP6uXE/oryxtNaYcm0Dl" +
			"SeZFdTJj/wJBANqb7xH4Tj9VgGb1v/8LTyT2XKQf80kiqdR0YSkQJyjWCNoOkSUD" +
			"3BmzelTkVsnsvmYGsOWbxmEw4sprP8xrsWECQQCY0lBTof2MDGwPg6DQJyPfGERw" +
			"NnYfi6YEuH2PIpJCdmqxI9B2ebS92U8iAttNXtj5wvoPatcJ5SgL1W4MoShBAkAX" +
			"Amata4dA30z+iUtGGvifmVay57IBtqZNeFppqguVHsIbwYDBdqCKC/wKR2ZjJon7" +
			"zyR7ZmQBAtY8HAHBEGzBAkEA2IZKeLm++Ky1eyax9Y3UgGCZUSyFIQbblrjS1+9N" +
			"VnZphHOA/tPJmuS2dPaB7ODzN/htSldKDZBNKt3GMDgYUg==";

	public static PublicKey getPublicKey(String base64PublicKey){
		PublicKey publicKey = null;
		try{
			X509EncodedKeySpec keySpec = new X509EncodedKeySpec(Base64.getDecoder().decode(base64PublicKey.getBytes()));
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			publicKey = keyFactory.generatePublic(keySpec);
			return publicKey;
		} catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static PrivateKey getPrivateKey(String base64PrivateKey){
		PrivateKey privateKey = null;
		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(base64PrivateKey.getBytes()));
		KeyFactory keyFactory = null;
		try {
			keyFactory = KeyFactory.getInstance("RSA");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		try {
			assert keyFactory != null;
			privateKey = keyFactory.generatePrivate(keySpec);
		} catch (InvalidKeySpecException e) {
			e.printStackTrace();
		}
		return privateKey;
	}

	public static byte[] encrypt(String data, String publicKey) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException {
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.ENCRYPT_MODE, getPublicKey(publicKey));
		return cipher.doFinal(data.getBytes());
	}

	public static String decrypt(byte[] data, PrivateKey privateKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		return new String(cipher.doFinal(data));
	}

	public static String decrypt(String data, String base64PrivateKey) throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
		return decrypt(Base64.getDecoder().decode(data.getBytes()), getPrivateKey(base64PrivateKey));
	}

	public static void main(String[] args) throws IllegalBlockSizeException, InvalidKeyException, NoSuchPaddingException, BadPaddingException, NoSuchAlgorithmException {
					String encryptedString = Base64.getEncoder().encodeToString(encrypt("ABC", publicKey));
//		String encryptedString = "MEEa9jPVbzhVl+Q1QjQYT2zsIlgY2BTn/CKy3ULIW7yaTMCYwkhs0YjI7o1wzuCiQ0EHTh3UEm7d5ohjLcozQGv3E978fk00U/nhdCFdCH6auNkggqR4Jb8tDV/XYU5Saj5zztKuIiEMPF5MsY0nquDddeWe0H+6q66uqxh8xpZ63G1awK+2jRoC6nHV5nIEEyIRGTTM6Cl/+lRnOiZ4V8jt6DJ9fRHgaHTketITeneLTW+3z9z7rcYzzfsQXMRGlDoAM9T2ckV9mXtgP9y3oEaVF4EQBLegk0D/eRA+vb0A4wnxuFSH8l7S6jC6qiOlcKzlPL6isGt+BbXft5h3aw==";

		System.out.println(encryptedString);
		String decryptedString = RSAUtil.decrypt(encryptedString, privateKey);
		System.out.println(decryptedString);

	}
	private static final String key = "aesEncryptionKey";
	private static final String initVector = "encryptionIntVec";


	public static String decrypt(String encrypted) {
		try {
			IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
			byte[] original = cipher.doFinal(org.apache.commons.codec.binary.Base64.decodeBase64(encrypted));

			return new String(original);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}
}
