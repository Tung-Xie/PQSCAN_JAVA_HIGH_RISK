package com.pqscan.service;

import javax.crypto.Cipher;
import java.security.MessageDigest;
import java.security.KeyPairGenerator;

public class LegacyAuthService {
    public void login() throws Exception {
        // 模擬使用 MD5 處理密碼
        MessageDigest md = MessageDigest.getInstance("MD5");
        // 使用 3DES 加密 Session
        Cipher cipher = Cipher.getInstance("DESede");
        // 使用過時的 RSA 1024 簽章
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(1024);
    }
}
