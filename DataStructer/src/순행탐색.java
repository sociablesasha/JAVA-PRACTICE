
public class ����Ž�� {
	public static void main(String[] args) {
		int data[] = new int[10];
		data = new int[]{3, 1, 20, 37, 4, 15, 16, 19, 21, 34};
		
		int key = 15;
		int cnt = 0;
		
		for(int i = 0; i < data.length; i++) {
			cnt++;
			if(key == data[i]) {
				System.out.println("��ġ : data[" + i + "]");
				break;
			}
		}
		System.out.println("Ƚ�� : " + cnt);
	}
}
