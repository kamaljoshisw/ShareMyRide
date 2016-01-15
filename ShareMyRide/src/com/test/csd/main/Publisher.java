package com.test.csd.main;

public class Publisher {

	public String submit(PostRideBean postRideBean){
		String msg = "";
		msg = validateMandatory(postRideBean);
		return msg;
	}
	
	private String validateMandatory(PostRideBean postRideBean){
		String msg = "";
		if(postRideBean.getPersonNumber() > 0 && postRideBean.getName() != null && !postRideBean.getName().isEmpty()){
			msg = "Publish Successful";
		}
		return msg;
	}
}
