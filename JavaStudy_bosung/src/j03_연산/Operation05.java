package j03_연산;

public class Operation05 {

	public static void main(String[] args) {
		
		/*
		 * =	연산자를 중심으로 오른쪽 변수값을 왼쪽 변수에 대입한다.
		 * +=	왼쪽 변수에 더하면서 대입한다.
		 * -=	왼쪽 변수값에서 빼면서 대입한다.
		 * *=	왼쪽 변수에 곱하면서 대입한다.
		 * /=	왼쪽 변수에 나누면서 대입한다.
		 * %=	왼쪽 변수에 나머지 값을 구하면서 대입한다.
		 */
		
		int num = 10;
		num = num + 2;
		num += 2; // num = num + 2; 와 같은의미
		System.out.println(num); // 14
		num -= 5;
		System.out.println(num); // 9
		num *= 2;
		System.out.println(num); // 18
		num /= 3;
		System.out.println(num); // 6
		num %= 4;
		System.out.println(num); // 2
	}

}




















