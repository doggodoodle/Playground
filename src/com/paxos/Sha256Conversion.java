package com.paxos;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/**
 * Created by u6023478 on 12/1/2016.
 */
public class Sha256Conversion {

    MessageDigest crypt = MessageDigest.getInstance("SHA-256");

    HashMap<String, String> map = new HashMap<>();

    public Sha256Conversion() throws NoSuchAlgorithmException {
    }

    public static void main(String[] args) {
        try {
            Sha256Conversion app = new Sha256Conversion();
            System.out.println(app.update("foo"));
            System.out.println(app.update("foo"));
            System.out.println(app.update("foo"));
            System.out.println(app.getKey("2c26b46b68ffc68ff99b453c1d30413413422d706483bfa0f98a5e886266e7ae"));
            System.out.println(app.getKey("2ss68ff99b453c1d30413413422d706483bfa0f98a5e886266e7ae"));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private String update(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        crypt.update(str.getBytes("UTF-8"));

        String digest =new BigInteger(1, crypt.digest()).toString(16);

        map.put(digest,str);

        return digest;
    }

    private String getKey(String hash){
        return map.get(hash);
    }


}
