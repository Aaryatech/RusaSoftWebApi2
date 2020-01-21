package com.ats.rusasoftapi.accessrights;

import java.util.List;

import com.ats.rusasoftapi.controller.Info;


public class AccessRightModuleList {

	
	List<AccessRightModule> accessRightModuleList;
	
	Info info;

	public List<AccessRightModule> getAccessRightModuleList() {
		return accessRightModuleList;
	}

	public void setAccessRightModuleList(List<AccessRightModule> accessRightModuleList) {
		this.accessRightModuleList = accessRightModuleList;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "AccessRightModuleList [accessRightModuleList=" + accessRightModuleList + ", info=" + info + "]";
	}
	
	
}
