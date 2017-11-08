package init_inteface;
public class Merge_sort implements Sort_interface{
	public void sort_array(int a[],int start,int end){
		mergesort(a,start,end);
	}
	void merge(int a[],int leftstart,int middle, int rightend){
		int leftend = middle-leftstart + 1;
		int rightstart = rightend - middle;
		int L[] = new int [leftend];
		int R[] = new int [rightstart];
		
		for(int i=0; i<leftend; i++) L[i] = a[leftstart+i];
		for(int j=0; j<rightstart; j++) R[j] = a[middle+1+j];
		
		int left = 0;
		int right = 0;
		int index = leftstart;
		
		while(left<leftend && right<rightstart){
			if(L[left]<=R[right]) a[index++] = L[left++];
			else a[index++] = R[right++];
		}
		while(left<leftend){
			a[index++] = L[left++];
		}
		while(right<rightstart){
			a[index++] =R[right++];
		}
	}
	void mergesort(int a[],int leftstart, int rightend){
		if(rightend<=leftstart) return;
		
		int middle = (leftstart+rightend)/2;
		mergesort(a, leftstart, middle);
		mergesort(a, middle+1, rightend);
		merge(a, leftstart, middle, rightend);
	}
	public void output_machine(int a[],int start, int end){
		System.out.println("Merge Sort: ");
		for(int i=start; i<end; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
