import java.util.*;

public class element_product{
	static int[] cache = new int[10];
	static int cached_product=1;

	
	public static void main(String[] args){
		int[] list = {1,2,3,4};

		
		System.out.println(calc_element(list)[1]);

	}

	public static int[] calc_element(int[] list){

		
		for(int i =0;i<list.length;i++){
			cached_product *= list[i];
		}
		
		for(int i =0;i<list.length;i++){
			list[i]=cached_product/list[i];
		
		}
		return list;
	}

}
