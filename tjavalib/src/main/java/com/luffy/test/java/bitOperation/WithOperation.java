package com.luffy.test.java.bitOperation;

/**
 * Created by lvlufei on 2020-09-21
 *
 * @name 位与运算
 * <p>
 * Java中的位运算
 * 1，<<     左移          各二进位全部左移若干位，高位丢弃，低位补0
 * 2，>>     右移          各二进位全部右移若干位，正数高位补0，负数高位补1，低位丢弃
 * 3，>>>    无符号右移     各二进位全部右移若干位，高位补0
 * 4，&      位与          两个位都为1时，结果才为1
 * 5，|      位或          两个位都为0时，结果才为0
 * 6，~      位非          0变1，1变0
 * 7，^      位异或        两个位相同是位0，相异时为1
 */
public class WithOperation {
    private static final int FLAG_SUPPORT_PASSWORD = 0x1;
    private static final int FLAG_SUPPORT_EXPIRY = 0x1 << 1;

    private int mCardElementOption;

    public WithOperation(int mCardElementOption) {
        this.mCardElementOption = mCardElementOption;
    }

    public boolean isNeedCardElement(int option) {
        System.out.println(mCardElementOption + ":" + Integer.toBinaryString(mCardElementOption) + ":" + ((mCardElementOption & option) != 0));
        return ((mCardElementOption & option) != 0);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 17; i++) {
            WithOperation withOperation = new WithOperation(i);
            withOperation.isNeedCardElement(FLAG_SUPPORT_PASSWORD);
        }
        System.out.println("----------------------------");
        for (int i = 1; i < 17; i++) {
            WithOperation withOperation = new WithOperation(i);
            withOperation.isNeedCardElement(FLAG_SUPPORT_EXPIRY);
        }
    }
}
