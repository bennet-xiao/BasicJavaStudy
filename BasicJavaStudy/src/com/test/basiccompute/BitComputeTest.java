package com.test.basiccompute;

/**
 * @author PC
 *  看源码中的位运算相关测试
 */
public class BitComputeTest {

	/**
	 * @param 要计算的数
	 * @param num  移动位数
	 * @param flag true表示左移 
	 * @return  计算结果数
	 *   移位运算
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
	 * @param 要计算的数
	 * @param num  移动位数
	 * @param flag true表示左移 
	 * @return  计算结果数
	 *   无符号右移位运算,忽略符号位，空位都以0补齐
	 *   num >> 1,相当于num除以2
	 *   num << 1,相当于num乘以2
	 */
	public static int bitNoSignalMove(int old,int num){
		int newNum=-1;
		newNum=old>>>num;
		return newNum;
	}
	
	/**
	 * @author PC
	 *static只可以修饰静态内部类，静态方法，静态变量，静态代码块
	 *静态内部类可以创建静态的成员，而非静态的内部类不可以，静态内部类可以创建静态的成员，而非静态的内部类不可以，静态内部类创建时不依赖与外部类的实例 ，
	 *普通内部类依赖于外部类的实例
	 */
	public static class A{//用作测试
		public String a="1";
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        System.out.println(bitMove(9,3,true));
	        System.out.println(bitMove(-1,2,false));
//	        System.out.println(bitNoSignalMove(-1,2));
		}
	}

}
