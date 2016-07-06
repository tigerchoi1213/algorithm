package algorithm;

import java.util.Scanner;
import java.util.Stack;

public class algorithm1 {

	public static void main(String[] args) {

		// 1. 선형탐색 리스트
		// algorithm1();

		// 2. 스택 (0은 빼)
		// algorithm2();

		// 3. 스택 (수식 계산)
		// algorithm3();
		

		// 4. 트리 (기억력 테스트3)
		// algorithm4();

		// 4.1 트리 (기억력 테스트3) (이진트리)
		//algorithm4_1();
		
		// 5. 그래프 (바이러스)
		algorithm5();
	}

	private static void algorithm5() {
		
	}

	private static void algorithm4_1() {
		System.out.println("##### start #####");

		Scanner sc = new Scanner(System.in);
		
		String intputVal = sc.nextLine(); 
		String[] inputValArr = intputVal.split(" ");
		 
		String inputVal2 = sc.nextLine(); 
		String[] inputVal2Arr = inputVal2.split(" ");

		/*
		String[] inputValArr = { "2", "23", "55", "87", "100" };
		String[] inputVal2Arr = { "5", "2", "100", "55" };
		*/
		
		for (int i = 0; i < inputVal2Arr.length; i++) {

			int idx = inputValArr.length / 2;
			while (0 < inputValArr.length) {
				if (idx == inputValArr.length) {
					idx = (inputValArr.length / 2) - 1;
				}else if (inputVal2Arr[i].equals(inputValArr[idx])) {
					System.out.println("result : " + (idx + 1));
					break;
				} else if (idx >= inputValArr.length / 2) {
					idx++;
				} else if( idx > 0){
					idx--;
				} else if( idx == 0){
					System.out.println("result : -1");
					break;
				}
			}
		}

		System.out.println("##### end #####");

	}

	private static void algorithm4() {
		System.out.println("##### start #####");

		Scanner sc = new Scanner(System.in);

		String intputVal = sc.nextLine();
		String[] inputValArr = intputVal.split(" ");

		String inputVal2 = sc.nextLine();
		String[] inputVal2Arr = inputVal2.split(" ");
		
		/*
		String[] inputValArr = { "2", "23", "55", "87", "100" };
		String[] inputVal2Arr = { "5", "2", "100", "55" };
		*/

		for (int i = 0; i < inputVal2Arr.length; i++) {
			for (int j = 0; j < inputValArr.length; j++) {
				if (inputVal2Arr[i].equals(inputValArr[j])) {
					System.out.println("result : " + (j + 1));
					break;
				}
				if (j == inputValArr.length - 1) {
					System.out.println("result : -1");
				}
			}
		}

		System.out.println("##### end #####");
	}

	private static void algorithm3() {
		System.out.println("##### start #####");

		Scanner sc = new Scanner(System.in);

		String inputVal = sc.nextLine();
		String[] intputValArr = inputVal.split(" ");
		int val1 = 0;
		int val2 = 0;

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < intputValArr.length; i++) {

			if (intputValArr[i].equals("+") || intputValArr[i].equals("-") || intputValArr[i].equals("*")
					|| intputValArr[i].equals("/")) {

				val2 = stack.pop();
				val1 = stack.pop();

				switch (intputValArr[i]) {
				case "+":
					stack.push(val1 + val2);
					break;
				case "-":
					stack.push(val1 - val2);
					break;
				case "*":
					stack.push(val1 * val2);
					break;
				case "/":
					stack.push(val1 / val2);
					break;
				default:
					break;
				}

			} else {
				stack.push(Integer.valueOf(intputValArr[i]));
			}
		}

		System.out.println("calculations : " + stack.pop());

		System.out.println("##### end #####");
	}

	public static void algorithm2() {
		System.out.println("##### start #####");

		Scanner sc = new Scanner(System.in);
		System.out.println("몇개를 입력할꺼니?");

		int inputVal = sc.nextInt();
		int[] intArr = new int[inputVal];
		int sum = 0;

		for (int i = 0; i < inputVal; i++) { 
			System.out.println("입력(" + (i + 1) + ")");

			int inputX = sc.nextInt();

			for (int j = 0; j < intArr.length; j++) {
				if (intArr[j] == 0) {
					if (inputX == 0) {
						intArr[j - 1] = 0;
					} else {
						intArr[j] = inputX;
					}
					break;
				}
			}
		}

		for (int j : intArr) {
			sum += j;
		}

		System.out.println("sum : " + sum);

		System.out.println("##### end #####");
	}

	public static void algorithm1() {

		System.out.println("##### start #####");
		System.out.println("몇개를 비교할꺼니? 범위 : 1 <= n <= 100,000");
		Scanner sc = new Scanner(System.in);
		String inputVal = sc.nextLine();
		int inputValInt = Integer.parseInt(inputVal);

		System.out.println(inputValInt + " 개를 입력해봐");

		String inputVal2 = sc.nextLine();
		String[] inputVal2Arr = inputVal2.split(" ");

		System.out.println("찾을 숫자를 입력해봐");
		String inputVal3 = sc.nextLine();

		boolean result = true;
		for (int i = 0; i < inputVal2Arr.length; i++) {
			if (inputVal3.equals(inputVal2Arr[i])) {
				System.out.println("equal");
				result = false;
				break;
			}
		}

		if (result) {
			System.out.println("-1");
		}

		System.out.println("##### end #####");
	}

}
