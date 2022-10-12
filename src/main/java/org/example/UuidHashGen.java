package org.example;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.codec.digest.MurmurHash3;

import java.nio.charset.StandardCharsets;

public class UuidHashGen {
    public String genHash(String uuid) {
        long be_hash = MurmurHash3.hash128x64(uuid.getBytes(StandardCharsets.UTF_8))[0];
        long le_hash = Long.reverseBytes(be_hash); //convert to little endian
        String hash = StringUtils.leftPad(Long.toHexString(le_hash),16,"0");

        return hash;
    }
}
