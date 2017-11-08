package init_inteface;

public class Bubble_sort implements Sort_interface{

	public void sort_array(int[] a,int start, int end) {
		bubble_sort(a,start,end);
	}
	void bubble_sort(int [] a,int start,int end){
		for(int i=0; i<end-1; i++){
			for(int j=0; j<end-1; j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	public void output_machine(int a[],int start, int end){
		System.out.println("Bubble Sort: ");
		for(int i=start; i<end; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
