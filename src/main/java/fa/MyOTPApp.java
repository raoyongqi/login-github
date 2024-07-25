package fa;

import com.amdelamar.jotp.OTP;
import com.amdelamar.jotp.type.Type;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class MyOTPApp {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, InvalidKeyException {
        // Your secret key
        String secret = "IHPTW6464YB3XWAS"; // Replace with your actual secret key

        // Generate a Time-based OTP from the secret, using Unix-time
        // rounded down to the nearest 30 seconds.
        String hexTime = OTP.timeInHex(System.currentTimeMillis(), 30);
        String code = OTP.create(secret, hexTime, 6, Type.TOTP);
        System.out.println(code);
    }
}
