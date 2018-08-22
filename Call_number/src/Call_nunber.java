import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Call_nunber {
	public static void main(String[] args) {
		HashMap<String, Phone> map = new HashMap<String, Phone>();
		Set<String> set = new HashSet<String>();
		Iterator<String> it;
		
		Phone ph = new Phone();
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		String name;
		int flag = 0;
		
		System.out.println("----------프로그램 실행----------");
		
		while(num != 5) {
			flag = 0;
			Print();
			num = sc.nextInt();
			
			switch(num) {
			case(1) :
				name = Input_name();
				ph = Input_Phone();
				map.put(name, ph);
				break;
			case(2) : 
				name = Input_name();
				set = map.keySet();
				it = set.iterator();
				while(it.hasNext()){
					if(name.equals(it.next())) {
						flag = 1;
						map.remove(name);
						System.out.println(name + "를 정상적으로 삭제하였습니다.");
						break;
					}
				}
				if(flag == 0)
					System.out.println(name + "는  등록되지 않는 사람입니다.");
				break;
			case(3) :
				name = Input_name();
				set = map.keySet();
				it = set.iterator();
				while(it.hasNext()){
					if(name.equals(it.next())) {
						flag = 1;
						ph = map.get(name);
						System.out.printf("주소>>%s\n전화번호>>%s\n", ph.address, ph.phone_number);
						break;
					}
				}
				if(flag == 0)
					System.out.println(name + "는  등록되지 않는 사람입니다.");
				break;
			case(4) :
				set = map.keySet();
				it = set.iterator();
				while(it.hasNext()) {
					name = it.next();
					ph = map.get(name);
					System.out.println("이름>>" + name);
					System.out.println("주소>>" + ph.address);
					System.out.println("전화번호>>" + ph.phone_number);
					System.out.println();
				}
			}
		}
		System.out.println("\n----------프로그램 종료----------");
	}
	
	static void Print() {
		System.out.println();
		System.out.println("삽입:1 , 삭제:2, 찾기:3 , 전체보기:4 , 종료:5");
	}
	
	static String Input_name() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름>>");
		String name = sc.nextLine();
		
		return name;
	}
	
	static Phone Input_Phone() {
		Phone ph = new Phone();
		Scanner sc = new Scanner(System.in);
		System.out.print("주소>>");
		ph.address = sc.nextLine();
		System.out.print("전화번호>>");
		ph.phone_number = sc.nextLine();
		return ph;
	}
}

//방과후
/*#include <stdio.h>
#include <stdlib.h>

typedef struct PRINTER{
	int totalPrintingCounting;
	int boolean; //0 true 1 false
	int year;
}Printer;

int maxPrintingCounting = 3;

//print
void print(Printer *printer)
{
	if (printer[0].totalPrintingCounting < maxPrintingCounting)
		printer[0].totalPrintingCounting++;

	else {
		if (printer[0].boolean == 0) {
			printf("\n*******수리가 필요합니다.*******\n");
			printer[0].boolean = 1;
		}
		else
			return;
	}
	
	printf("\n");
	for (int i = 0; i < 70; i++)
		printf("-");
	printf("\n\n부모님이 저를 보시고 옛날부터 하셨던 말이 있습니다.\n");
	for (int i = 0; i < 70; i++)
		printf("-");
	printf("\n\n");
}

//menu
void menu(Printer *printer, int cnt)
{
	int i;
	for (i = 0; i < cnt; i++)
		printf("\n%d > %d번 프린터", i + 1, i + 1);

	printf("\n프린터 선택 : ");
}

int main(void)
{
	int i, cnt, num;
	Printer printer[5];

	cnt = sizeof(printer) / sizeof(printer[0]);

	//초기화
	for (i = 0; i < cnt; i++) {
		printer[i].totalPrintingCounting = 0;
		printer[i].boolean = 0;
		printf("%d번 프린터 제조일자 : ", i + 1);
		scanf("%d", &printer[i].year);
	}

	while (1) {
		menu(printer, cnt);
		scanf("%d", &num);
		print(&printer[num - 1]);
	}
}*/