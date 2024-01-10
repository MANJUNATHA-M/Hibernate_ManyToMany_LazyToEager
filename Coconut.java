package com.hibernate.manytomany.lazytoeager.Many_To_Many_LaztToEager;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Coconut {
	
	@Id
	private int cCount;
	private int cPrice;
	
	@ManyToMany(mappedBy = "cclist")
	private List<CoconutTree> cttlist=new ArrayList<CoconutTree>();
	
	public List<CoconutTree> getCtt() {
		return cttlist;
	}
	public void setCtt(List<CoconutTree> ctt) {
		this.cttlist = ctt;
	}
	public int getcCount() {
		return cCount;
	}
	public void setcCount(int cCount) {
		this.cCount = cCount;
	}
	public int getcPrice() {
		return cPrice;
	}
	public void setcPrice(int cPrice) {
		this.cPrice = cPrice;
	}
	@Override
	public String toString() {
		return "Coconut [cCount=" + cCount + ", cPrice=" + cPrice + "]";
	}
	
}
