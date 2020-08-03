package com.luffy.test.java.bitOperation;

public class AndOperation {
    private static final int FLAG_SUPPORT_PASSWORD = 0x1;
    private static final int FLAG_SUPPORT_EXPIRY = 0x1 << 1;

    private int mCardElementOption;

    public AndOperation(int mCardElementOption) {
        this.mCardElementOption = mCardElementOption;
    }

    public boolean isNeedCardElement(int option) {
        System.out.println(mCardElementOption + ":" + Integer.toBinaryString(mCardElementOption) + ":" + ((mCardElementOption & option) != 0));
        return ((mCardElementOption & option) != 0);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 17; i++) {
            AndOperation andOperation = new AndOperation(i);
            andOperation.isNeedCardElement(FLAG_SUPPORT_PASSWORD);
        }
        System.out.println("----------------------------");
        for (int i = 1; i < 17; i++) {
            AndOperation andOperation = new AndOperation(i);
            andOperation.isNeedCardElement(FLAG_SUPPORT_EXPIRY);
        }
    }
}
