package by.htp.jd01.unit6.dao.impl;

import java.security.NoSuchAlgorithmException;

/**
 * Created by Fisher on 02.03.2018.
 */
public class EncryptPassword {
    public static byte[] computeHash(String x) throws NoSuchAlgorithmException

    {
        java.security.MessageDigest d =null;
        d = java.security.MessageDigest.getInstance("SHA-1");
        d.reset();
        d.update(x.getBytes());
        return  d.digest();
    }

    public static String byteArrayToHexString(byte[] b){
        StringBuffer sb = new StringBuffer(b.length * 2);
        for (int i = 0; i < b.length; i++){
            int v = b[i] & 0xff;
            if (v < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(v));
        }
        return sb.toString().toUpperCase();
    }
}
