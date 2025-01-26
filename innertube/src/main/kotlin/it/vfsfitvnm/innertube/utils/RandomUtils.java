package it.vfsfitvnm.innertube.utils;

import java.util.Random;

public class RandomUtils {
    private static final Random numberGenerator = new Random();

    public static String generate(
            final String alphabet,
            final int length,
            final Random random) {
        final StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            stringBuilder.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        return stringBuilder.toString();
    }

    public static String randomVisitorData() {
        final ProtoBuilder pbE2 = new ProtoBuilder();
        pbE2.string(2, "");
        pbE2.varint(4, numberGenerator.nextInt(255) + 1);

        final ProtoBuilder pbE = new ProtoBuilder();
        pbE.string(1, "US");
        pbE.bytes(2, pbE2.toBytes());

        final ProtoBuilder pb = new ProtoBuilder();
        pb.string(1, generate("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", 11, numberGenerator));
        pb.varint(5, System.currentTimeMillis() / 1000 - numberGenerator.nextInt(600000));
        pb.bytes(6, pbE.toBytes());
        return pb.toUrlencodedBase64();
    }
}
