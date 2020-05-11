package singleton;

	
	public class Principal {

		public static void main(String[] args) {

			System.out.println("******** Exercicio de Singleton *******\n");
			System.out.println("******** Relógio ********");
			System.out.println("Data: "+Relogio.getInstancia().getData());
			System.out.println("Hora: "+Relogio.getInstancia().getHorario());
//			Relogio.getInstancia().Horario();
		}

	}



