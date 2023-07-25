package edu.kh.array.practice.service;

import java.util.Scanner;

public class PracticeService {
	
	public void practice1() {
	  //길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
		//순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		//짝수 번째 인덱스 값의 합을 출력하세요 (0 번째 인덱스는 짝수로 취급)
		
		int[]arr = new int[9];
		
		arr[0]= 1; 
		arr[1]= 2; 
		arr[2]= 3; 
		arr[3]= 4; 
		arr[4]= 5; 
		arr[5]= 6; 
		arr[6]= 7; 
		arr[7]= 8; 
		arr[8]= 9; 
	
		for(int i = 1; i<=9; i++) {
			System.out.print(i);
			
		}
			int sum = 0;
			
			
			
			
			
			
		}
	public void practice2() {
		
	}
	
				

		
	public void practice3() {
		
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력받은 값까지 배열에 초기화한 후 출력하세요.
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("양의 정수 : ");
		 int input = sc.nextInt();
		 
		 int[] arr = new int[6];
		 
		 arr[0]=1;
		 arr[1]=2;
		 arr[2]=3;
		 arr[3]=4;
		 arr[4]=5;
		 arr[5]=6;
		 for(int i = 1; i < arr.length; i++) {
			 arr[i] = i;
			 
			 System.out.print(i);

		}
	}
	public void practice4() {
		
		//정수 5개를 입력 받아 배열을 초기화 하고
		//검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인데스를 찾아 출력.
		//배열에 같은수가 없을 경우 "일치하는 값이 존재하지 않습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력  : ");
				 
		int input = sc.nextInt();
		
		System.out.print("검색할 값 : " );
		int input1 = sc.nextInt();
		
		
		System.out.print("인덱스 : " );
		int input2 = sc.nextInt();
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
			
			boolean flag = false;
			
			if(arr[i]== input) {
				System.out.println("인덱스 : " + i);
				
			}
			
		}
		
		
	 
		
		
		
			 
			
			 
		 }
		 
		
		   
		
	 
		
		
	}
		 
	
		 
		 
		 
	
		
		
		
		
		
		

		
		
	
	
	
    



