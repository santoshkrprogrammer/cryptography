/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoencanddec;



/**
 *
 * @author Dell
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESencryption
{
    private final static int IV_LENGTH = 16;
    private final static String ALGO_RANDOM_NUM_GENERATOR = "SHA1PRNG";
    private final static String ALGO_SECRET_KEY_GENERATOR = "AES";
    private final static String ALGO_VIDEO_ENCRYPTOR = "AES/EBC/NoPadding"; //Just a string

    static String videoPath = "";

  //-------------------------------------------------------------------------------------------------------------------------------------------------

    @SuppressWarnings("resource")
    public static void encrypt(SecretKey key, AlgorithmParameterSpec paramSpec, InputStream in, OutputStream out)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
            InvalidAlgorithmParameterException, IOException, Exception {
                Cipher c = Cipher.getInstance(ALGO_VIDEO_ENCRYPTOR);
                c.init(Cipher.ENCRYPT_MODE, key, paramSpec);
                 out = new CipherOutputStream(out, c);

            int count = 0;
        
            byte[] buffer = new byte[in.hashCode()];
            while ((count = in.read(buffer)) >= 0) {
                out.write(buffer, 0, count);
                EncryptTask task1 = new EncryptTask(key, paramSpec, in, out, c);
                EncryptTask task2 = new EncryptTask(key, paramSpec, in, out, c);
                EncryptTask task3 = new EncryptTask(key, paramSpec, in, out, c);
                EncryptTask task4 = new EncryptTask(key, paramSpec, in, out, c);
                Thread t1 = new Thread((Runnable) task1);
                Thread t2 = new Thread((Runnable) task2);
                Thread t3 = new Thread((Runnable) task3);
                Thread t4 = new Thread((Runnable) task4);
                t1.start();
                t2.start();
                t3.start();
                t4.start();
                t1.join();
                t2.join();
                t3.join();
                t4.join();
    }
}
}