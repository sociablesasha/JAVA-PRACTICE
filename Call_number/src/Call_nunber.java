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
		
		System.out.println("----------���α׷� ����----------");
		
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
						System.out.println(name + "�� ���������� �����Ͽ����ϴ�.");
						break;
					}
				}
				if(flag == 0)
					System.out.println(name + "��  ��ϵ��� �ʴ� ����Դϴ�.");
				break;
			case(3) :
				name = Input_name();
				set = map.keySet();
				it = set.iterator();
				while(it.hasNext()){
					if(name.equals(it.next())) {
						flag = 1;
						ph = map.get(name);
						System.out.printf("�ּ�>>%s\n��ȭ��ȣ>>%s\n", ph.address, ph.phone_number);
						break;
					}
				}
				if(flag == 0)
					System.out.println(name + "��  ��ϵ��� �ʴ� ����Դϴ�.");
				break;
			case(4) :
				set = map.keySet();
				it = set.iterator();
				while(it.hasNext()) {
					name = it.next();
					ph = map.get(name);
					System.out.println("�̸�>>" + name);
					System.out.println("�ּ�>>" + ph.address);
					System.out.println("��ȭ��ȣ>>" + ph.phone_number);
					System.out.println();
				}
			}
		}
		System.out.println("\n----------���α׷� ����----------");
	}
	
	static void Print() {
		System.out.println();
		System.out.println("����:1 , ����:2, ã��:3 , ��ü����:4 , ����:5");
	}
	
	static String Input_name() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸�>>");
		String name = sc.nextLine();
		
		return name;
	}
	
	static Phone Input_Phone() {
		Phone ph = new Phone();
		Scanner sc = new Scanner(System.in);
		System.out.print("�ּ�>>");
		ph.address = sc.nextLine();
		System.out.print("��ȭ��ȣ>>");
		ph.phone_number = sc.nextLine();
		return ph;
	}
}

//�����
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
			printf("\n*******������ �ʿ��մϴ�.*******\n");
			printer[0].boolean = 1;
		}
		else
			return;
	}
	
	printf("\n");
	for (int i = 0; i < 70; i++)
		printf("-");
	printf("\n\n�θ���� ���� ���ð� �������� �ϼ̴� ���� �ֽ��ϴ�.\n");
	for (int i = 0; i < 70; i++)
		printf("-");
	printf("\n\n");
}

//menu
void menu(Printer *printer, int cnt)
{
	int i;
	for (i = 0; i < cnt; i++)
		printf("\n%d > %d�� ������", i + 1, i + 1);

	printf("\n������ ���� : ");
}

int main(void)
{
	int i, cnt, num;
	Printer printer[5];

	cnt = sizeof(printer) / sizeof(printer[0]);

	//�ʱ�ȭ
	for (i = 0; i < cnt; i++) {
		printer[i].totalPrintingCounting = 0;
		printer[i].boolean = 0;
		printf("%d�� ������ �������� : ", i + 1);
		scanf("%d", &printer[i].year);
	}

	while (1) {
		menu(printer, cnt);
		scanf("%d", &num);
		print(&printer[num - 1]);
	}
}*/