package jp.co.techCompass;

import java.io.Serializable;
import java.util.Date;

public class FortuneBean implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date today;
    private String fortune;

    public FortuneBean() {};

    /**
     * 
     */
    public void setToday(Date date) {
        this.today = date;
    }

    /**
     * 
     */
    public Date getToday() {
        return this.today;
    }

    /**
    * 
    */
    public void setFortune(String fortune) {
        this.fortune = fortune;
    }

    /**
     * 
     */
    public String getFortune() {
        return this.fortune;
    }
}
