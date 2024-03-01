package com.viettel.googleoauth2;

import org.apache.commons.codec.binary.Base32;
import java.security.SecureRandom;

public class GenerateSecretKey {
    public static void main(String[] args) {
            SecureRandom random = new SecureRandom();
            byte[] bytes = new byte[20];
            random.nextBytes(bytes);
            Base32 base32 = new Base32();
            System.out.println(base32.encodeToString(bytes));
    }
}