package com.TestdataTypes;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Payment {

	private String pmtType;

	public String getPmtType() {
		return pmtType;
	}

	public void setPmtType(String pmtType) {
		this.pmtType = pmtType;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("pmtType", pmtType).toString();
	}

}
