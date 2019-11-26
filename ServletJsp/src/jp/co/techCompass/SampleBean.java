package jp.co.techCompass;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleBean implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date date;
    private int luckyNumber;

    public SampleBean() {};

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDate() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        return df.format(this.date);
    }

    public void setLuckyNumber(int luckyNumber) {
        this.luckyNumber = luckyNumber;
    }

    public int getLuckyNumber() {
        return this.luckyNumber;
    }
}
