package com.jdh.resourceEnvTest.jasypt;

import com.jdh.resourceEnvTest.config.JasyptConfig;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;

public class JasyptTests {

    private final static String ENC_KEY = "my_jasypt_key";

    @Test
    public void 정보_암호화() {
        String url = "jdbc:log4jdbc:mysql://localhost:3306/test_master?characterEncoding=UTF-8";
        String username = "root";
        String password = "1234";

        System.out.println(jasyptEncoding(url));
        System.out.println(jasyptEncoding(username));
        System.out.println(jasyptEncoding(password));
    }

    public String jasyptEncoding(String value) {
        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWithMD5AndDES");
        pbeEnc.setPassword(ENC_KEY);
        return pbeEnc.encrypt(value);
    }
}
