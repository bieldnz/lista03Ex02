package controller;

public class ControllerVerifica {
	
	public ControllerVerifica() {
		super();
	}
	
	public int verifica(int n1, int n2, int n) {
		
		if(n1 != 0) {
			if(n1%10 == n2) {
				n++;
			}
			n1 = n1/10;
			int result = verifica(n1,n2,n);
			return result;
		}else {
			return n;
		}
		
	}
	
}
