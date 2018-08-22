
public class ¼øÇàÅ½»ö {
	public static void main(String[] args) {
		int data[] = new int[10];
		data = new int[]{3, 1, 20, 37, 4, 15, 16, 19, 21, 34};
		
		int key = 15;
		int cnt = 0;
		
		for(int i = 0; i < data.length; i++) {
			cnt++;
			if(key == data[i]) {
				System.out.println("À§Ä¡ : data[" + i + "]");
				break;
			}
		}
		System.out.println("È½¼ö : " + cnt);
	}
}
