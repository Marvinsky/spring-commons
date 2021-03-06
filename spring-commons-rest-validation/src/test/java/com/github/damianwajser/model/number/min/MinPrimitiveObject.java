package com.github.damianwajser.model.number.min;


import com.github.damianwajser.validator.annotation.number.Min;

public class MinPrimitiveObject {

	@Min(value = 2, businessCode = "a-400")
	private int value;

	public MinPrimitiveObject() {
	}

	public MinPrimitiveObject(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
