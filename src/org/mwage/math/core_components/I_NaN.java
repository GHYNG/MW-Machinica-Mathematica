package org.mwage.math.core_components;
import org.mwage.math.core_components.algebra.I_AlgebraicBinaryOperator;
import org.mwage.math.core_components.algebra.I_AlgebraicExpression;
import org.mwage.math.core_components.algebra.I_Integer;
import org.mwage.math.core_components.algebra.I_RationalNumber;
import org.mwage.math.core_components.algebra.I_RealNumber;
import org.mwage.math.core_components.logic.I_Boolean;
import org.mwage.math.core_components.logic.I_LogicExpression;
/**
 * ������ֵ��һ�������ֵ�������κ�����ֵһ�����㶼��õ�����
 * <p>
 * NaN���д�Ⱦ�ԣ��κ�����������в���ΪNaN�����ؽ������ҲΪNaN��
 * <p>
 * NaN�Ǹ����﷨�Ϸ��������Ƿ��Ĳ������أ��������²�����{@code a/0}������{@code 0}Ϊĳ������
 * <p>
 * ����NaNֵ�������Ǹ�����ֵ���͵ĳ�Ա����������Ӧ�ñ���������Щ����������Ա��ͬ�࣬���磺
 * NaNֵ��������һ��I_Integer���͵ģ���NaN������������κ�λ���ϡ�
 * ��˿��Խ�NaN�����Ǹ���ֵ��ռλ����
 * <p>
 * NaN���ļ��ַ���Ϊ��NaN����
 * ��ԭ���ϣ��κΡ�NaN���ַ����������ΪNaNֵ��
 * ע�⣺NaNֵ���޷������ģ�
 * ��Ϊ�ڽӿ����Ѿ��ṩ��һ��NaNʵ����
 * �����ʵ������ȫ������Ψһһ��NaNʵ����
 * ������ˣ������ṩ��һ��{@code m_create(string)}�����Ի��ʵ����
 * ������������ؽӿ���������е�ʵ����
 * 
 * @author GHYNG
 * @since 1
 * @version 1
 */
public interface I_NaN extends I_Value, I_Integer, I_Boolean {
	/**
	 * ������ֵ����
	 * 
	 * @since 1
	 * @version 1
	 */
	I_NaN NaN = new C_NaN();
	/**
	 * @return NaN��
	 * @since 1
	 * @version 1
	 */
	@Override
	default I_NaN o_equ(I_Expression another) {
		return NaN;
	}
	/**
	 * @return �ַ���"NaN"��
	 */
	@Override
	default String m_toFileString() {
		return "NaN";
	}
	/**
	 * ������ֵ�޷���һ���򻯡�
	 * 
	 * @return ����
	 */
	@Override
	I_NaN p_calculate();
	/**
	 * @return true��
	 * @since 1
	 * @version 1
	 */
	@Override
	default boolean p_isNaN() {
		return true;
	}
}
class C_NaN implements I_NaN {
	@Override
	public String toString() {
		return "NaN";
	}
	@Override
	public I_Integer o_add(I_Integer another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_Integer o_sub(I_Integer another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_Integer o_mut(I_Integer another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_RationalNumber o_div(I_Integer another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_RationalNumber o_add(I_RationalNumber another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_RationalNumber o_sub(I_RationalNumber another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_RationalNumber o_mut(I_RationalNumber another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_RationalNumber o_div(I_RationalNumber another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_Integer p_getNumerator() {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_Integer p_getDenominator() {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_RealNumber o_add(I_RealNumber another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_RealNumber o_sub(I_RealNumber another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_RealNumber o_mut(I_RealNumber another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_RealNumber o_div(I_RealNumber another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public double m_round(int decimalPlaces) {
		// TODO �Զ����ɵķ������
		return 0;
	}
	@Override
	public Sign p_getSign() {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_AlgebraicExpression o_add(I_AlgebraicExpression another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_AlgebraicExpression o_sub(I_AlgebraicExpression another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_AlgebraicExpression o_mut(I_AlgebraicExpression another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_AlgebraicExpression o_div(I_AlgebraicExpression another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_NaN p_calculate() {
		return this;
	}
	@Override
	public String p_getAbsString() {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_NaN o_inv() {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_Boolean o_or(I_Boolean another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_Boolean o_not() {
		// TODO �Զ����ɵķ������
		return null;
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
	public I_AlgebraicBinaryOperator p_getOperator() {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_NaN p_getLeft() {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_NaN p_getRight() {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_LogicExpression o_equ(I_RealNumber another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_LogicExpression o_mor(I_RealNumber another) {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public I_LogicExpression o_les(I_RealNumber another) {
		// TODO �Զ����ɵķ������
		return null;
	}
}