package org.mwage.math.core_components.logic;
import org.mwage.math.core_components.I_Expression;
import org.mwage.math.core_components.I_Value;
import static org.mwage.math.core_components.Util_CommonConstantValues.NaN;
/**
 * ��ѧ�߼�ϵͳ�еĲ���ֵ��
 * <p>
 * ���������ܵ�ֵ���桢�٣��Լ������ڣ�NaN����
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_Boolean extends I_LogicExpression, I_Value {
	/**
	 * ����ֵ���档
	 * 
	 * @since 1
	 * @version 1
	 */
	I_Boolean TRUE = new C_Boolean(true);
	/**
	 * ����ֵ���١�
	 * 
	 * @since 1
	 * @version 1
	 */
	I_Boolean FALSE = new C_Boolean(false);
	/**
	 * �����㡣
	 * 
	 * @param another
	 *            ��һ������ֵ��
	 * @return ��������һ������ֵ��
	 * @since 1
	 * @version 1
	 */
	default I_Boolean o_and(I_Boolean another) {
		if(p_containNaN(this, another)) {
			return NaN;
		}
		return (this == TRUE && another == TRUE) ? TRUE : FALSE;
	}
	/**
	 * �����㡣
	 * 
	 * @param another
	 *            ��һ������ֵ��
	 * @return ��������һ������ֵ��
	 * @since 1
	 * @version 1
	 */
	default I_Boolean o_or(I_Boolean another) {
		if(p_containNaN(this, another)) {
			return NaN;
		}
		return (this == TRUE || another == TRUE) ? TRUE : FALSE;
	}
	/**
	 * @return ��������һ������ֵ��
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_Boolean o_not() {
		if(p_containNaN(this)) {
			return NaN;
		}
		return this == TRUE ? FALSE : TRUE;
	}
	/**
	 * ������㡣
	 * 
	 * @param another
	 *            ��һ������ֵ��
	 * @return �棬�������һ������ֵ��ͬ���٣��������һ������ֵ����ͬ��NaN�������ֵ����һ��ֵ��NaN��
	 * @since 1
	 * @version 1
	 */
	default I_Boolean o_equ(I_Boolean another) {
		if(p_containNaN(this, another)) {
			return NaN;
		}
		return this == another ? TRUE : FALSE;
	}
	/**
	 * һ������Ĳ���ֵ�޷���һ���򻯻���㡣
	 * 
	 * @return ����
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_Boolean p_calculate() {
		return this;
	}
	/**
	 * @return "true"��������棻"false"������Ǽ٣�"NaN"�������NaN��
	 * @since 1
	 * @version 1
	 */
	@Override
	default String m_toFileString() {
		if(this == TRUE) {
			return "true";
		}
		if(this == FALSE) {
			return "false";
		}
		return "NaN";
	}
}
class C_Boolean implements I_Boolean {
	private final boolean me;
	C_Boolean(boolean me) {
		this.me = me;
	}
	@Override
	public I_LogicExpression o_equ(I_LogicExpression another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_LogicExpression o_and(I_LogicExpression another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_LogicExpression o_or(I_LogicExpression another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_Boolean o_decide() {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_LogicExpression o_equ(I_Expression another) {
		// TODO �Զ����ɵķ������
		return null;
	}
}
class Util_Boolean {
	
}