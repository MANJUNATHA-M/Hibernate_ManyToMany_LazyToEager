package com.hibernate.manytomany.lazytoeager.Many_To_Many_LaztToEager;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class CoconutTree {
	@Id
	private int tCount;
	private double tHight;
	
	 @ManyToMany
	private List<Coconut> cclist=new ArrayList<Coconut>();
	
	
	public List<Coconut> getCc() {
		return cclist;
	}
	public void setCc(List<Coconut> cc) {
		this.cclist = cc;
	}
	public int gettCount() {
		return tCount;
	}
	public void settCount(int tCount) {
		this.tCount = tCount;
	}
	public double gettHight() {
		return tHight;
	}
	public void settHight(double d) {
		this.tHight = d;
	}
	@Override
	public String toString() {
		return "CoconutTree [tCount=" + tCount + ", tHight=" + tHight + "]";
	}
	
}
