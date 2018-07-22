package com.kewenc.kewencmp3encoder;

public class Mp3Encoder {
    static {
        System.loadLibrary("libaudioencoder");
    }
    public native void encode();
}
