package org.mwage.math.core_components;
import java.util.HashMap;
import org.mwage.math.core_components.logic.I_Boolean;
/**
 * һЩ���õ�ֵ������಻�����κ����㣬ֻ��һ�������
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public final class Util_CommonConstantValues {
	/**
	 * �޷������ֵ��
	 * 
	 * @since 1
	 */
	public static final I_NaN NaN = I_NaN.NaN;
	/**
	 * ����ֵ���档
	 * 
	 * @since 1
	 */
	public static final I_Boolean TRUE = I_Boolean.TRUE;
	/**
	 * ����ֵ���١�
	 * 
	 * @since 1
	 */
	public static final I_Boolean FALSE = I_Boolean.FALSE;
	/**
	 * һ������������Ĺ�ϣ��
	 * 
	 * @since 1
	 */
	public static final HashMap<String, String> operators = new HashMap<String, String>();
	static {
		operators.put("add", "+");
		operators.put("sub", "-");
		operators.put("mut", "*");
		operators.put("div", "/");
		operators.put("equ", "=");
		operators.put("mor", ">");
		operators.put("les", "<");
	}
}