package kr.co.softcampus.beans;

import javax.validation.constraints.Size;

public class DataBean1 {
	@Size(min = 2, max = 10)
	private String data1;

	public String getData1() {
		return data1;
	}

	public void setData1(String data1) {
		this.data1 = data1;
	}

}
