package aula20211116.blocoDeExceções;

public class Cofre implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Fechando o cofre!");
	}

}
