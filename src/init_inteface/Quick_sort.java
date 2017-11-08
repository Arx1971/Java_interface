package init_inteface;

public class Quick_sort implements Sort_interface{
	public void sort_array(int a[],int start, int end){
		
		quick_sort(a, start, end);
	}
	void quick_sort(int[] a,int left,int right){
		int i = left;
		int j = right;
		int pivot = a[(right+left)/2];
		
		while(i<=j){
			while(a[i]<pivot)i++;
			while(a[j]>pivot)j--;
			if(i<=j){
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				i++;
				j--;
			}
		}
		if(i>left) quick_sort(a, left, j);
		if(j<right)quick_sort(a, i, right);
	}
	public void output_machine(int a[],int start, int end){
		System.out.println("Quick Sort: ");
		for(int i=start; i<end; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
