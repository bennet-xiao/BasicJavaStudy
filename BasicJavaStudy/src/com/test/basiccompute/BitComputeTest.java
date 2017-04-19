package com.test.basiccompute;

/**
 * @author PC
 *  ��Դ���е�λ������ز���
 */
public class BitComputeTest {

	/**
	 * @param Ҫ�������
	 * @param num  �ƶ�λ��
	 * @param flag true��ʾ���� 
	 * @return  ��������
	 *   ��λ����
	 */
	public static int bitMove(int old,int num,boolean flag){
		int newNum=-1;
		if(flag){
			newNum=old<<num;
		}else{
			newNum=old>>num;
		}
		return newNum;
	}
	
	/**
	 * @param Ҫ�������
	 * @param num  �ƶ�λ��
	 * @param flag true��ʾ���� 
	 * @return  ��������
	 *   �޷�������λ����,���Է���λ����λ����0����
	 *   num >> 1,�൱��num����2
	 *   num << 1,�൱��num����2
	 */
	public static int bitNoSignalMove(int old,int num){
		int newNum=-1;
		newNum=old>>>num;
		return newNum;
	}
	
	/**
	 * @author PC
	 *staticֻ�������ξ�̬�ڲ��࣬��̬��������̬��������̬�����
	 *��̬�ڲ�����Դ�����̬�ĳ�Ա�����Ǿ�̬���ڲ��಻���ԣ���̬�ڲ�����Դ�����̬�ĳ�Ա�����Ǿ�̬���ڲ��಻���ԣ���̬�ڲ��ഴ��ʱ���������ⲿ���ʵ�� ��
	 *��ͨ�ڲ����������ⲿ���ʵ��
	 */
	public static class A{//��������
		public String a="1";
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        System.out.println(bitMove(9,3,true));
	        System.out.println(bitMove(-1,2,false));
//	        System.out.println(bitNoSignalMove(-1,2));
		}
	}

}
