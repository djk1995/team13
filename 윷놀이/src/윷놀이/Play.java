package ������;

import java.util.*;

public class Play {

	static Player[] person;
	
	static void selectPlayerNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�÷��̾� �� ���ϱ�:");
		int x= scan.nextInt();
		person=new Player[x+1];
		for(int i=1;i<x+1;i++) {
			person[i]=new Player();
			person[i].playerNum=i;
		}
		scan.close();
	}
	static void selectHorseNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("���Ǽ�  ���ϱ�:");
		int x= scan.nextInt();
		for(int i=1;i<person.length+1;i++) {
			person[i].horse=new Horse[x+1];
			for(int j=1;j<x+1;j++) {
				person[i].horse[j]=new Horse();
				person[i].horse[j].playerNum=i;  //����ü�� playerNum�� �÷��̾� ���ڸ� �Ҵ�;
				person[i].horse[j].horseNum=j;
			}
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		
		selectPlayerNumber();
		selectHorseNumber();
		String x=null;
		while(true) {
			for(int i=1;i<person.length+1;i++) {
				person[i].throwYut(); //i��° �÷��̾� �� ����
				person[i].choiceHorseToMove();
				
			}
			if(x.equals("exit")) break;
		}
	}

}
