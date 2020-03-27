package com.DBPractice;

import org.junit.Test;

import com.hrms.utils.DbUtils;

public class DbPractice1 {
	@Test
	public void chechDbData() {
	DbUtils.createConnecation();
	DbUtils.storeDataFromDB("select * from ohrm_nationality");
	
	}
}
