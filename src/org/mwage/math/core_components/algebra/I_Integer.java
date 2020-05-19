package org.mwage.math.core_components.algebra;
import java.util.ArrayList;
import java.util.List;
import org.mwage.math.core_components.algebra.I_RealNumber.Sign;
import org.mwage.math.core_components.logic.I_Boolean;
import static org.mwage.math.core_components.Util_CommonConstantValues.*;
/**
 * ����ϵͳ�е�������������������һ�֡�
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_Integer extends I_RationalNumber {
	/**
	 * �жϸ������Ƿ�����һ������ȡ�Ӧ�����н����ԡ�
	 * 
	 * @param another
	 *            ��һ��������
	 * @return �棬�����ȣ��٣��������ȣ�NaN�������ֵ���������ֵΪNaN��
	 * @since 1
	 * @version 1
	 */
	default I_Boolean o_equ(I_Integer another) {
		I_Integer a = this, b = another;
		if(p_containNaN(a, b)) {
			return NaN;
		}
		return a.m_toFileString().equals(b.m_toFileString()) ? TRUE : FALSE;
	}
	/**
	 * �ӷ����㡣Ӧ�����пɽ����ԡ�
	 * <p>
	 * ����������ӣ�Ӧ������һ��������
	 * 
	 * @param another
	 *            ������
	 * @return �µ����������μӷ��ĺ͡�
	 * @since 1
	 * @version 1
	 */
	I_Integer o_add(I_Integer another);
	/**
	 * �������㡣 �������������Ӧ������һ��������
	 * 
	 * @param another
	 *            ������
	 * @return �µ����������μ����Ĳ
	 * @since 1
	 * @version 1
	 */
	I_Integer o_sub(I_Integer another);
	/**
	 * �˷����㡣Ӧ�����пɽ����ԡ� ����������ˣ�Ӧ������һ��������
	 * 
	 * @param another
	 *            ������
	 * @return �µ����������γ˷��Ļ���
	 * @since 1
	 * @version 1
	 */
	default I_Integer o_mut(I_Integer another) {
		I_Integer a = this, b = another;
		if(p_containNaN(a, b)) {
			return NaN;
		}
		Sign sgna = a.p_getSign(), sgnb = b.p_getSign();
		Sign sign = sgna.o_mut(sgnb);
		if(sign == Sign.NEUTRAL) {
			return m_create("0");
		}
		String stra = a.p_getAbsString(), strb = b.p_getAbsString();
		String str = Util_Integer.mut(stra, strb);
		return m_create(sign, str);
	}
	/**
	 * �������㡣 �������������Ӧ������һ����������
	 * 
	 * @param another
	 *            ������
	 * @return �µ������������γ������̡�
	 * @since 1
	 * @version 1
	 */
	I_RationalNumber o_div(I_Integer another);
	/**
	 * @return ���������෴����
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_Integer o_inv() {
		if(p_containNaN(this)) {
			return NaN;
		}
		Sign sign = p_getSign();
		if(sign == Sign.NEUTRAL) {
			return this;
		}
		String abs = p_getAbsString();
		sign = sign.o_mut(Sign.NEGATIVE);
		return m_create(sign, abs);
	}
	/**
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_RationalNumber o_abs() {
		if(p_containNaN(this)) {
			return NaN;
		}
		Sign sign = p_getSign();
		if(sign != Sign.NEGATIVE) {
			return this;
		}
		return o_inv();
	}
	/**
	 * һ�����������ֵ�޷���һ���򻯻���㡣
	 * 
	 * @return ������
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_Integer p_calculate() {
		return this;
	}
	/**
	 * �õ������ֲ��ֵ��ַ������������ţ����ţ���
	 * ���Կ�����ȡ����ֵ���ַ�����ʽ��
	 * 
	 * @return �����ֲ��ֵ��ַ�����
	 * @since 1
	 * @version 1
	 */
	String p_getAbsString();
	@Override
	default I_Integer p_getNumerator() {
		return null; // TODO unfinished
	}
	/**
	 * @return ��������Java��������double��ʽ�����ܳ����ڴ淶Χ��
	 *         <p>
	 *         ���������뱾���������㣬��Ϊ��ֵ��������
	 * @since 1
	 * @version 1
	 */
	@Override
	default double m_round(int decimalPlaces) {
		return new Double(m_toFileString());
	}
	/**
	 * @return ���������ַ�����ʽ��
	 *         ����Ǹ��������ַ���ͷ����һ�����š�
	 * @since 1
	 * @version 1
	 */
	@Override
	default String m_toFileString() {
		if(p_isNaN()) {
			return "NaN";
		}
		Sign sign = p_getSign();
		String str = "";
		if(sign == Sign.NEGATIVE) {
			str = operators.get("sub");
		}
		str += p_getAbsString();
		return str;
	}
	/**
	 * �жϸ����ַ����Ƿ�Ϸ���
	 * <p>
	 * �����ַ����Ϸ�ʱ�����Ը��ݸ��ַ�������ֵ�������ã�
	 * <p>
	 * {@code
	 * create(string);
	 * }
	 * <p>
	 * �������Ӧ����{@link #m_toFileString()}���෴������
	 * 
	 * @param string
	 *            �����ַ�����
	 * @return �棬����Ϸ����٣�������Ϸ���
	 * @since 1
	 * @version 1
	 */
	static boolean m_legal(String string) {
		char[] cs = string.toCharArray();
		cs.equals(cs);
		int length = cs.length;
		if(length == 0) {
			return false;
		}
		if((!Character.isDigit(cs[0])) && (cs[0] != '-')) {
			return false;
		}
		for(int i = 1; i < length; i++) {
			if(!Character.isDigit(cs[i])) {
				return false;
			}
		}
		return true;
	}
	/**
	 * ���ݸ������ַ���������һ���µ�������
	 * ������������Ǹ�������������Ļ�ͷ������һ�����š�
	 * 
	 * @param value
	 *            �������ַ�����
	 * @return �����������������У�
	 *         Ϊһ�����������ֵ����������������ַ�����
	 *         һ��NaNֵ����������Ƿ��ַ�����"NaN"�ַ�����
	 * @since 1
	 * @version 1
	 */
	static I_Integer m_create(String value) {
		return null; // TODO unfinished.
	}
	/**
	 * ���ݸ����ķ��ź��ַ���������һ���µ�������
	 * ��������ķ��ſ���������ģ������ַ������ֱ����Ǵ����ֵġ�
	 * 
	 * @param sign
	 *            �����ķ��š�
	 * @param absvalue
	 *            �������ַ�������������ֵ��
	 * @return 0����������ķ���ָ��0��
	 *         һ�����������ֵ����������������ַ�����������������ȴ���ڸ������ţ�
	 *         NaNֵ����������Ƿ��ַ�����"NaN"�ַ�����
	 * @since 1
	 * @version 1
	 */
	static I_Integer m_create(Sign sign, String absvalue) {
		return null; // TODO unfinished.
	}
}
abstract class C_Integer implements I_Integer {
	final Sign sign;
	final String value;
	C_Integer(Sign sign, String value) {
		this.sign = sign;
		this.value = value;
	}
}
class Util_Integer {
	static String add(String a, String b) {
		a = removeStart0(a);
		b = removeStart0(b);
		char[] charsA = a.toCharArray(), charsB = b.toCharArray();
		for(char c : charsA) {
			if(!Character.isDigit(c)) {
				return "NaN";
			}
		}
		for(char c : charsB) {
			if(!Character.isDigit(c)) {
				return "NaN";
			}
		}
		int lengthA = charsA.length, lengthB = charsB.length;
		if(lengthA == 0) {
			return add("0", b);
		}
		if(lengthB == 0) {
			return add(a, "0");
		}
		if(a.equals("0")) {
			return b;
		}
		if(b.equals("0")) {
			return a;
		}
		char[] revA = reverseCharArray(charsA), revB = reverseCharArray(charsB);
		int length;
		if(lengthA > lengthB) {
			length = lengthA;
		}
		else {
			length = lengthB;
		}
		List<Character> newList = new ArrayList<Character>();
		int carry = 0;
		for(int i = 0; i < length; i++) {
			int aa = 0, bb = 0, zz = 0;
			if(i < lengthA) {
				aa = char_int(revA[i]);
			}
			if(i < lengthB) {
				bb = char_int(revB[i]);
			}
			zz = aa + bb + carry;
			if(zz >= 10) {
				zz -= 10;
				carry = 1;
			}
			else {
				carry = 0;
			}
			char c = int_char(zz);
			newList.add(c);
		}
		if(carry == 1) {
			newList.add('1');
		}
		return removeStart0(charArray_string(reverseCharArray(charList_charArray(newList))));
	}
	static String add(String... strings) {
		String r = "0";
		for(String string : strings) {
			r = add(r, string);
		}
		return r;
	}
	static String add(List<String> strings) {
		String r = "0";
		for(String string : strings) {
			r = add(r, string);
		}
		return r;
	}
	static String mut(String a, String b) {
		a = removeStart0(a);
		b = removeStart0(b);
		char[] charsA = a.toCharArray(), charsB = b.toCharArray();
		for(char c : charsA) {
			if(!Character.isDigit(c)) {
				return "NaN";
			}
		}
		for(char c : charsB) {
			if(!Character.isDigit(c)) {
				return "NaN";
			}
		}
		int lengthA = charsA.length, lengthB = charsB.length;
		if(lengthA == 0) {
			return add("0", b);
		}
		if(lengthB == 0) {
			return add(a, "0");
		}
		if(a.equals("0") || b.equals("0")) {
			return "0";
		}
		char[] revA = reverseCharArray(charsA), revB = reverseCharArray(charsB);
		List<String> polynomial = new ArrayList<String>();
		for(int ia = 0; ia < lengthA; ia++) {
			int aa = char_int(revA[ia]);
			for(int ib = 0; ib < lengthB; ib++) {
				int bb = char_int(revB[ib]);
				int zz = aa * bb, num0s = ia + ib;
				polynomial.add(removeStart0(addEnd0(zz + "", num0s)));
			}
		}
		return add(polynomial);
	}
	static String mut(String... strings) {
		String r = "1";
		for(String string : strings) {
			r = mut(r, string);
		}
		return r;
	}
	static String mut(List<String> strings) {
		String r = "1";
		for(String string : strings) {
			r = mut(r, string);
		}
		return r;
	}
	static String addEnd0(String string, int num0) {
		for(int i = 0; i < num0; i++) {
			string += "0";
		}
		return string;
	}
	static String removeStart0(String string) {
		if(string.equals("0")) {
			return string;
		}
		while(string.startsWith("0")) {
			string = string.substring(1);
		}
		return string;
	}
	static char[] reverseCharArray(char[] arrIn) {
		int length = arrIn.length;
		char[] arrOut = new char[length];
		for(int i = 0; i < length; i++) {
			arrOut[i] = arrIn[length - 1 - i];
		}
		return arrOut;
	}
	static String charArray_string(char[] arrIn) {
		String string = "";
		for(char c : arrIn) {
			string += c;
		}
		return string;
	}
	static char[] charList_charArray(List<Character> list) {
		int length = list.size();
		char[] arr = new char[length];
		for(int i = 0; i < length; i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}
	static int char_int(char c) {
		switch(c) {
			case '0' :
				return 0;
			case '1' :
				return 1;
			case '2' :
				return 2;
			case '3' :
				return 3;
			case '4' :
				return 4;
			case '5' :
				return 5;
			case '6' :
				return 6;
			case '7' :
				return 7;
			case '8' :
				return 8;
			case '9' :
				return 9;
		}
		return 0;
	}
	static char int_char(int i) {
		if(i < 0) {
			i = -i;
		}
		while(i >= 10) {
			i -= 10;
		}
		switch(i) {
			case 0 :
				return '0';
			case 1 :
				return '1';
			case 2 :
				return '2';
			case 3 :
				return '3';
			case 4 :
				return '4';
			case 5 :
				return '5';
			case 6 :
				return '6';
			case 7 :
				return '7';
			case 8 :
				return '8';
			case 9 :
				return '9';
		}
		return '0';
	}
}