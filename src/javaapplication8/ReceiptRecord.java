/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asad
 */
public class ReceiptRecord {

    private List<Receipt> receiptList = new ArrayList<Receipt>();
    Receipt receipt;

    public ReceiptRecord() {
        receipt = new Receipt();

        receiptList = receipt.getrceiptlist();

    }

    public void addToReceiptList(Receipt obj) {
        receiptList.add(obj);
    }
}
