/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileencanddec;

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
import java.io.File;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Dell
 */
public class AESdecryption {
      public static void decrypt(SecretKey key, AlgorithmParameterSpec paramSpec, InputStream in, OutputStream out)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
            InvalidAlgorithmParameterException, IOException, Exception {
          String ALGO_VIDEO_ENCRYPTOR;
            
                DecryptTask task1 = new DecryptTask(key, paramSpec, in, out);
                DecryptTask task2 = new DecryptTask(key, paramSpec, in, out);
                DecryptTask task3 = new DecryptTask(key, paramSpec, in, out);
                DecryptTask task4 = new DecryptTask(key, paramSpec, in, out);
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
