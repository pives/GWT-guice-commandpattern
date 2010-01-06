package com.philadev.cpexample.server;

import net.customware.gwt.dispatch.server.ActionHandler;
import net.customware.gwt.dispatch.server.ExecutionContext;
import net.customware.gwt.dispatch.shared.ActionException;

import com.philadev.cpexample.shared.GetUsers;
import com.philadev.cpexample.shared.GetUsersResponse;

public class GetUsersHandler implements ActionHandler<GetUsers, GetUsersResponse> {

	public GetUsersResponse execute(GetUsers arg0, ExecutionContext arg1)
			throws ActionException {
		
		return new GetUsersResponse(arg0.getName(), "username returned via GetUsersHandler, edit that class to change.");
	}

	public Class<GetUsers> getActionType() {
		return GetUsers.class;
	}

	public void rollback(GetUsers arg0, GetUsersResponse rg1,
			ExecutionContext arg2) throws ActionException {
		
		
	}

}
