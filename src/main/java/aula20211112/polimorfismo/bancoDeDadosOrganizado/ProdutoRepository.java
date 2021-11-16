package aula20211112.polimorfismo.bancoDeDadosOrganizado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
	private Connection conn;

	public ProdutoRepository(Connection conn) {
		this.conn = conn;
		try {
			conn.createStatement().execute("create table if not exists produto (" + "id integer not null primary key, "
					+ "nome varchar(255) not null unique" + ")");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public Produto encontrarPeloId(Integer id) {
		Produto recuperado = null;
		try {
			PreparedStatement psSelect = conn.prepareStatement("select id, nome from produto where id = ?");
			psSelect.setInt(1, id);
			ResultSet rsSelect = psSelect.executeQuery();
			if (rsSelect.next()) {
				recuperado = new Produto(rsSelect.getInt("id"), rsSelect.getString("nome"));
				return recuperado;
			}
			rsSelect.close();
			psSelect.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return recuperado;
	}

	public List<Produto> encontrarTodos() {
		List<Produto> todos = new ArrayList<>();
		try {
			PreparedStatement psSelectAll = conn.prepareStatement("select id, nome from produto");
			ResultSet rsAll = psSelectAll.executeQuery();
			while (rsAll.next()) {
				Integer id = rsAll.getInt("id");
				String nome = rsAll.getString("nome");

				Produto recuperado = new Produto(id, nome);
				todos.add(recuperado);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return todos;
	}

	// implementar o método excluirPeloId sabendo que o id é um Integer. Se baseie
	// no incluir.
	public void excluirPeloId(Integer id) {
		try {
			PreparedStatement psDelete = conn.prepareStatement(
					"delete from produto where id = ?");
			psDelete.setInt(1, id);
			psDelete.execute();
			psDelete.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void incluir(Produto p) {
		try {
			PreparedStatement psInsert = conn.prepareStatement(
					"insert into produto (id, nome) values (?,?)");
			psInsert.setInt(1, p.getId());
			psInsert.setString(2, p.getNome());
			psInsert.execute();
			psInsert.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
