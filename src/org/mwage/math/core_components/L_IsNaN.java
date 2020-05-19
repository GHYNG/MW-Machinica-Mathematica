package org.mwage.math.core_components;
public interface L_IsNaN {
	boolean isNaN(I_Value... values);
}
class T {
	L_IsNaN l = (I_Value... values) -> {
		for(I_Value value : values) {
			if(value.p_isNaN()) {
				return true;
			}
		}
		return false;
	};
}