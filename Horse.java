package ������;

public class Horse {
	static Horse[][] board=new Horse[41][6];  //���� �����ִ� ������. [position][0] : �÷��̾� ��ȣ ,[position][1,2,3,4,5] : ����ȣ
	int playerNum;//�÷��̾� ��ȣ
	int horseNum; //�� ��ȣ
	int position=0; // ���� ��ġ
	int[] atmp=new int[6];
	int itmp;
	void move(int x) {	
		
		int i;                      //���� �����ǿ� �ش� �÷��̾��� �ٸ� ���� ������ tmp�� �ش� ����ȣ�� ������. 
		for(i=1;i<6;i++) {
			if(board[position][i].playerNum==playerNum)
				atmp[i]=i;
		}
		itmp=position;
		board[position]=null;//���� �������� �����.
		
		if(itmp==5 && x!=-1) {     
			position=25+x;
		}
		if(itmp==10 && x!=-1) {
			position=35+x;
		}
		if(itmp==28 && x!=-1) {
			position=38+x;
		}
		position=itmp+x;
		
		if(itmp>30&&itmp<36) {
			position=itmp-30+14;
		}
		if((position>=20&&position<26)||position>40) {
			position=100; // ������ �ǹ�
		}
		
		if(board[position][0].playerNum!=playerNum) {   //���� �ش� position�� �ٸ� ���� �ִ� ��� �ٸ� �� ���	
			grasp();
		}
		if(board[position][0].playerNum==playerNum) {   //�ش� position�� ���� ���� �ִ� ��� ����
			
		}
	}
	void grasp() {    //���� ������ ��� �ٷ�� ������ �𸣰ھ��̤�
		for(int i=0;i<6;i++) {
		 board[position][i].position=0;   //�ش� �����ǿ� �ִ� ��� ����ü�� �������� 0���� ����.
		}
		board[position][0].playerNum=playerNum;
		for(int i=1;i<6;i++) {
			if(atmp[i]!=0) {
				board[position][i].horseNum=i;
				board[position][i].playerNum=playerNum;
			}
		}
	}
}
 