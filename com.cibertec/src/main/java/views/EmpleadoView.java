package views;

import controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		//Crear Empleado
		/*String emp = new EmpleadoController().createEmpleado("Torres Sandon","Kevin Alejandro", 25, "M", 220);*/
				
		//Eliminar Empleado
		/*String emp = new EmpleadoController().deleteEmpleado(2);*/
			
		//Actualizar Empleado
		/*String emp = new EmpleadoController().updateEmpleado(1, "Marcos Fernando");*/
				
		//Leer Empleado
		String emp = new EmpleadoController().getEmpleado(1);
				
		System.out.println(emp);
	}
}
