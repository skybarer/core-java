package security;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import org.apache.commons.codec.binary.Base64;

public class Test {
	public static void main(String[] args) throws NoSuchAlgorithmException, IOException{
		
		KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair=keyPairGenerator.generateKeyPair();

        RSAPublicKey publicKey=(RSAPublicKey)keyPair.getPublic();
        RSAPrivateKey privateKey=(RSAPrivateKey)keyPair.getPrivate();

        String base64PubKey = Base64.encodeBase64String(publicKey.getEncoded());
        ByteArrayOutputStream byteOs = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(byteOs);
        dos.writeInt("ssh-rsa".getBytes().length);
        dos.write("ssh-rsa".getBytes());
        dos.writeInt(publicKey.getPublicExponent().toByteArray().length);
        dos.write(publicKey.getPublicExponent().toByteArray());
        dos.writeInt(publicKey.getModulus().toByteArray().length);
        dos.write(publicKey.getModulus().toByteArray());
        String publicKeyEncoded = new String(
                                   Base64.encodeBase64(byteOs.toByteArray()));
        String key =  "ssh-rsa " + publicKeyEncoded + " ";
        System.out.println("Public Key ------");
        System.out.println(key);


        System.out.println("------------------------------");
        System.out.println("Private key");
        System.out.println(Base64.encodeBase64(privateKey.getEncoded()));
		
	}

}
