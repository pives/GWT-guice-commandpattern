package com.philadev.cpexample.shared;

import net.customware.gwt.dispatch.shared.Result;

@SuppressWarnings("serial")

public class GetUsersResponse implements Result{

	
	public GetUsersResponse(){}
	
	public GetUsersResponse(String n, String m) {
		this.name=n;
		this.message=m;
	}
	private  String name;
	private  String message;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	

}
