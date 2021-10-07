package org.col;

import org.sample.Education;

public class Arts  extends Education {
	
	@Override
	public void ug() {
		System.out.println("in arts ug also viable");
		super.ug();
	
	}
	@Override
	public void pg() {
		System.out.println("in arts pg also aviable");
		super.pg();
	}
	private void be() {
		System.out.println("in arts college this course aviable");

	}
	private void bsc() {
		System.out.println("ag");
		System.out.println("pardha");
		System.out.println("raju");

	}
	public static void main(String[] args) {
		Arts p =new Arts();
		p.be();
		p.bsc();
		p.pg();
		p.ug();
	}
	
	
	
	
	
	
	
	
	

	}


