package com.pqscan;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;
import java.security.spec.ECGenParameterSpec;

public class HighRiskService {
    public void runLegacyCrypto() throws Exception {
        // PKI: RSA-1024 & 2048 (High Risk)
        KeyPairGenerator rsa1 = KeyPairGenerator.getInstance("RSA");
        rsa1.initialize(1024);
        rsa1.generateKeyPair();
        
        KeyPairGenerator rsa2 = KeyPairGenerator.getInstance("RSA");
        rsa2.initialize(2048);
        rsa2.generateKeyPair();

        // Cipher: 3DES & RC4
        Cipher des3 = Cipher.getInstance("DESede/CBC/PKCS5Padding");
        des3.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(new byte[24], "DESede"));
        
        Cipher rc4 = Cipher.getInstance("RC4");
        rc4.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(new byte[16], "RC4"));

        // Hash: MD5 & SHA-1
        MessageDigest.getInstance("MD5").digest("test".getBytes());
        MessageDigest.getInstance("SHA-1").digest();

        // Curves: 弱曲線實例化
        KeyPairGenerator ecGen = KeyPairGenerator.getInstance("EC");
        ecGen.initialize(new ECGenParameterSpec("secp160r1"));
        ecGen.initialize(new ECGenParameterSpec("secp192r1"));
    }
}
