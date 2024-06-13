package com.library.bean;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lend implements Serializable {

    private long ser_num;
    private long book_id;
    private long reader_id;
    private Date lend_date;
    private Date back_date;

    public long getReaderId() {
        return reader_id;
    }

    public void setReaderId(long reader_id) {
        this.reader_id = reader_id;
    }

    public long getBookId() {
        return book_id;
    }

    public void setBookId(long book_id) {
        this.book_id = book_id;
    }

    public void setSer_num(long ser_num) {
        this.ser_num = ser_num;
    }

    public Date getBackDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String formattedDate = sdf.format(back_date);
        try {
            return sdf.parse(formattedDate);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // 返回null或者自定义处理方式
        }
    }

    public void setBackDate(Date back_date) {
        this.back_date = back_date;
    }

    public Date getLendDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String formattedDate = sdf.format(lend_date);
        try {
            return sdf.parse(formattedDate);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // 返回null或者自定义处理方式
        }
    }

    public void setLendDate(Date lend_date) {
        this.lend_date = lend_date;
    }

    public long getSer_num() {
        return ser_num;
    }
}
