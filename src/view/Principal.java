package view;

import controller.ControllerVerifica;

public class Principal {
	
	public static void main(String[] args) {
		
		ControllerVerifica controller = new ControllerVerifica();
		
		int result = controller.verifica(31234, 3, 0);
		System.out.println(result);
		
	}
	
}
