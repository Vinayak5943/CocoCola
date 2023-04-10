package Cola1;

import java.util.Arrays;

public class ZigZag {

	public static void main(String[] args) {
		int p[]= {1,3,5};
		int q[]= {2,4,6};
		
		int l=p.length;
		int m=q.length;
		
		int n=l+m;
		int r[] = new int[n];
		int d=0;
		for(int i=0;i<l;i++) {
			    r[d]  =p[i];
			    d++;
			    r[d]  = q[i];
			    d++;
			
		}
		System.out.println(Arrays.toString(r));
	}

}
