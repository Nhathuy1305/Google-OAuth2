## Two-Factor Authentication with Google Authenticator App using JAVA
### Prerequisites
* Java 8+
* Maven ^3.6.0
* Google Authenticator App. Can be downloaded on [App Store](https://apps.apple.com/us/app/google-authenticator/id388497605)
  and [Google Play](https://play.google.com/store/apps/details?id=com.google.android.apps.authenticator2&hl=en&gl=US)

### How to Run & Use
1. Open the terminal on your IDE
2. Clone the repo
```sh
   git clone https://github.com/Nhathuy1305/Google-OAuth2.git
   ```
3. Run the GenerateSecretKey class to generate new 10 characters Secret Key
4. Copy the Secret Key and paste it into the "...." of the 'secretKey' variable in the GoogleOAuth2Application class
5. Run the GoogleOAuth2Application class, the program will ask "Please enter 2fA code here ->"
6. You should see the generated **'QRCode.png'** image in your project root folder.
7. Now open your Google Authenticator app. Press ‘*plus*’ button to add a new entry and select ‘Scan Barcode’.
8. Open the generated **'QRCode.png'** image and scan it.
9. After scanning this QR code you should see a new entry in Google Authenticator entry list
   with 6-digits being regenerated every 30 seconds.
10. Enter 6-digits code from your Google Authenticator App.

### Results
If you did everything correctly then after entering 2fa code to the console you should see the following text message:

`Logged in successfully`

Or if 2FA code is already expired or invalid:

`Invalid 2FA Code`
