package ch01;

public class B_Datatype {

	public static void main(String[] args) {
		
		// 기본형 데이터 타입
		
		// 정수형 데이터 타입: 실수부가 없는 정수를 나타냄
		// byte: 1byte(8bit)의 크기를 가지는 정수형 데이터 타입
		// -128 ~ 127
		byte byte1 = 127;
		// byte byte2 = 128;
		
		// short: 2byte(16bit)의 크기를 가지는 정수형 데이터 타입
		// -32768 ~ 32767
		short short1 = 32767;
		// short short1 = 32768;
		
		// int: 4byte(32bit)의 크기를 가지는 정수형 데이터 타입
		// -2147483648 ~ 2147483647
		// 숫자가 클때 _로 잘라서 표기 가능
		int int1 = 2_147_483_647;
		// int int1 = 2_147_483_648;
		
		// long: 8byte(64bit)의 크기를 가지는 정수형 데이터 타입
		long long1 = 2_147_483_648L;
		
		// 실수형 데이터 타입: 실수부를 가지는 데이터 타입
		// float: 4byte(32bit)의 크기를 가지는 실수형 데이터 타입
		// 소수점 6~7자리에서 오차가 발생 
		float float1 = 3.1415926535F;
		System.out.println(float1);
		
		// double: 8byte(64bit)의 크기를 가지는 실수형 데이터 타입
		// 소수점 15~17 자리에서 오차가 발생
		double double1 = 3.1415926535;
		System.out.println(double1);
		
		// 문자형 데이터 타입: 문자 하나를 저장할 수 있는 데이터 타입
		// char: 2byte(16bit)의 크기를 가지는 문자형 데이터 타입
		// 0 ~ 65535
		char char1 = 'a';
		char char2 = 97;
		System.out.println(char1);
		System.out.println(char2);
		
		// 논리형 데이터 타입: 참과 거짓 값을 가자 데이터 타입
		// boolean: 1byte(8bit)의 크기를 가지는 논리형 데이터 타입
		// true, false
		boolean boolean1 = true;
		boolean boolean2 = false;
		
		// 형변환: 데이터 타입이 서로 다른 변수를 옮겨 닮는 것
		
		// 자동 형변환 (묵시적 형변환): 작은 데이터 타입의 변수를 큰 데이터 타입의 변수에 옮겨 닮을 때 발생
		int number = 10;
		long longNumber = number;
		
		// 강제 형변환 (명시적 형변환): 큰 데이터 타입의 변수를 작은 데이터 타입으 변수에 옮겨 닮을 때 발생
		// 할당하고자 하는 큰 데이터 타입 변수 앞에 (작은 데이터타입)을 붙여줌
		number = (int) longNumber;
		
		number = 256;
		byte byteNumber = (byte) number;
		System.out.println(byteNumber);
		
		short shortNumber = 97;
		char character = 97;

		// shortNumber = character;
		
		int intNumber = 100;
		float floatNumber = 100;
		// intNumber = floatNumber;
		
		// 배열: 동일한 타입의 변수를 묶어 저장하는 컨테이너
		// new 연산자를 이용해서 생성을 해야함
		// 한번 생성된 배열의 크기는 변경할 수 없음
		// 선언
		// 데이터타입[] 변수명(배열명);
		// 생성
		// 변수명 = new 데이터 타입[크기];
		int[] numbers;
		numbers = new int[5];
		System.out.println(numbers);
		
		int[] numbers2 = {1, 2, 3, 4, 5}; //초기화
		int[] numbers3 = new int[] {1, 2, 3, 4, 5}; //생성과 동시에 초기화
		System.out.println(numbers2);
		System.out.println(numbers3);
 		
		
		
		
		
		
		
		
		
	}

}