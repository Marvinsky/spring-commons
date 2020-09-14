package com.github.damianwajser.model.global.min;

import com.github.damianwajser.validator.annotation.global.Min;
@Deprecated
public class MinPrimitiveObject {

	@Min(min = 2, businessCode = "a-400")
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
