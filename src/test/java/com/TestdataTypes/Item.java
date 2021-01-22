package com.TestdataTypes;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Item {

	private String url;
	private String size;
	private String quantity;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("url", url).append("size", size).append("quantity", quantity)
				.toString();
	}

}
