package utils;


import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ObfuscationUtil {
  private static final Logger LOGGER = LoggerFactory.getLogger(ObfuscationUtil.class);

  private ObfuscationUtil() {
    throw new IllegalStateException("Obfuscation class");
  }

  public static String obfuscateData(String data) {
    try {
      MessageDigest digest = MessageDigest.getInstance("SHA-256");
      byte[] encodeHash = digest.digest(data.getBytes(StandardCharsets.UTF_8));
      return new String(Hex.encodeHex(encodeHash));
    } catch (Exception e) {
      LOGGER.error("Error hashing data. Outputting empty string instead");
      return "";
    }

  }
}


