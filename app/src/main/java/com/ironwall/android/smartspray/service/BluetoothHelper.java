package com.ironwall.android.smartspray.service;

import java.util.UUID;

/**
 * Original code is in "https://github.com/lann/RFDuinoTest/blob/master/src/main/java/com/lannbox/rfduinotest/BluetoothHelper.java"
 */
public class BluetoothHelper {
    public static String shortUuidFormat = "0000%04X-0000-1000-8000-00805F9B34FB";

    public static UUID sixteenBitUuid(long shortUuid) {
        assert shortUuid >= 0 && shortUuid <= 0xFFFF;
        return UUID.fromString(String.format(shortUuidFormat, shortUuid & 0xFFFF));
    }
}

