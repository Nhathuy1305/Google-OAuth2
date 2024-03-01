package com.viettel.googleoauth2;

import com.google.zxing.WriterException;

import java.io.IOException;
import java.util.Scanner;

public class GoogleOAuth2Application {

    public static void main(String[] args) throws IOException, WriterException {
        String secretKey = "....";
        String email = "admin@viettel.com";
        String companyName = "Viettel High Tech";
        String barCodeUrl = Utils.getGoogleAuthenticatorBarCode(secretKey, email, companyName);
        Utils.createQRCode(barCodeUrl, "QRCode.png", 400, 400);

        System.out.print("Please enter 2fA code here -> ");
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        if (code.equals(Utils.getTOTPCode(secretKey))) {
            System.out.println("Logged in successfully");
        } else {
            System.out.println("Invalid 2FA Code");
        }

    }
}