
package com.customer.Transaction.model;

import java.io.Serializable;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Profile implements Serializable {

    
    private String dollarAmnt;
    private String rewards;
    private String transactionDate;
    
    
	public String getDollarAmnt() {
		return dollarAmnt;
	}
	public void setDollarAmnt(String dollarAmnt) {
		this.dollarAmnt = dollarAmnt;
	}
	public String getRewards() {
		return rewards;
	}
	public void setRewards(String rewards) {
		this.rewards = rewards;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
    

    
}
