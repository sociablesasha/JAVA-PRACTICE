
public class 이진탐색 {
	public static void main(String[] args) {
		int data[] = new int[10];
		data = new int[]{15, 3, 11, 1, 9, 7, 8, 70, 76, 4};
		
		//정렬
		for(int i = 0; i < data.length - 1; i++){
			for(int j = i + 1; j < data.length; j++){
				if(data[i] > data[j]){
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		
		//탐색
		int key = 15;  
		int cnt = 0;
		int left = 0;
		int right = data.length - 1;
		
		System.out.println("key: " + key);
		
		while(true) {
			if(++cnt >= 4) {
				System.out.println("key를 찾지 못하였습니다.");
				break;
			}
			
			int middle = (left + right) / 2;
			
			if(data[middle] == key) {
				System.out.println("위치 : [" + middle + "]");
				break;
			}
			
			else if(data[middle] > key)
				right = middle - 1;
			
			else if(data[middle] < key)
				left = middle - 1;
		}
		System.out.println("횟수 : " + cnt);
	}
}
