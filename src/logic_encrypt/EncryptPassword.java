package logic_encrypt;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
// @author Marlon E. Zambrano Z.

public class EncryptPassword {

    private final String key;
    private byte[] arrayBytes;

    public EncryptPassword(String key) throws Exception {
        this.key = key;
        this.arrayBytes = this.key.getBytes("UTF-8");
    }

    private SecretKeySpec createPassword() throws Exception {
        byte[] other = this.arrayBytes;
        MessageDigest mD = MessageDigest.getInstance("SHA-1");
        other = mD.digest(other);
        other = Arrays.copyOf(other, 16);
        SecretKeySpec sKS = new SecretKeySpec(other, "AES");
        return sKS;
    }

    public String make(boolean encrypt) throws Exception {
        SecretKeySpec instance = createPassword();
        Cipher c = Cipher.getInstance("AES");
        if (encrypt) {
            c.init(Cipher.ENCRYPT_MODE, instance);
            byte[] encrypted = c.doFinal(arrayBytes);
            String string = (Base64.getEncoder()).encodeToString(encrypted);
            return string;
        }
        c.init(Cipher.DECRYPT_MODE, instance);
        byte[] desEncrypted = c.doFinal(arrayBytes);
        String string = Arrays.toString((Base64.getDecoder()).decode(desEncrypted));
        return string;
    }
}
