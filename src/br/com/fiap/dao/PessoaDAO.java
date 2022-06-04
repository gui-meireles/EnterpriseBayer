package br.com.fiap.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.PessoaModel;

public class PessoaDAO implements IDataHandler<PessoaModel>{

	@Override
	public List<PessoaModel> Getall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PessoaModel GetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int Add(PessoaModel obj) {
		ConexaoDAO dao = new ConexaoDAO();
		try {
			PreparedStatement stmt = dao.GetConnection()
					.prepareStatement("INSERT INTO T_PESSOA VALUES (SEQ_PESSOA.nextval, ?, ?, ?, ?, ?)");
			stmt.setString(1, obj.getSexo());
			stmt.setInt(2, obj.getIdade());
			stmt.setInt(3, obj.getRegiao());
			stmt.setInt(4, obj.getDoenca());
			stmt.setInt(5, obj.getRenda());
			return dao.ExecuteCommand(stmt);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int Delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Update(PessoaModel obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
