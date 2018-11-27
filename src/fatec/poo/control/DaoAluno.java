package fatec.poo.control;

import fatec.poo.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Guilherme Sernajoto
 */
public class DaoAluno {

    private Connection conn;

    public DaoAluno(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_Aluno(cpf, nome, dataNasc, endereco, numero, bairro, cidade, estado, cep, telefone, celular, sexo, estadoCivil,"
                    + "rg, email, escolaridade) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, aluno.getCpf());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getDataNasc());
            ps.setString(4, aluno.getEndereco());
            ps.setInt(5, aluno.getNumero());
            ps.setString(6, aluno.getBairro());
            ps.setString(7, aluno.getCidade());
            ps.setString(8, aluno.getEstado());
            ps.setString(9, aluno.getCep());
            ps.setString(10, aluno.getTelefone());
            ps.setString(11, aluno.getCelular());
            ps.setString(12, aluno.getSexo());
            ps.setString(13, aluno.getEstadoCivil());
            ps.setString(14, aluno.getRg());
            ps.setString(15, aluno.getEmail());
            ps.setString(16, aluno.getEscolaridade());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tb_Aluno SET nome = ?, dataNasc = ?, endereco = ?, numero = ?, bairro = ?, cidade = ?, estado = ?,"
                    + " cep = ?, telefone = ?, celular = ?, sexo = ?, estadoCivil = ?, rg = ?, email = ?, escolaridade = ? WHERE cpf = ?");
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getDataNasc());
            ps.setString(3, aluno.getEndereco());
            ps.setInt(4, aluno.getNumero());
            ps.setString(5, aluno.getBairro());
            ps.setString(6, aluno.getCidade());
            ps.setString(7, aluno.getEstado());
            ps.setString(8, aluno.getCep());
            ps.setString(9, aluno.getTelefone());
            ps.setString(10, aluno.getCelular());
            ps.setString(11, aluno.getSexo());
            ps.setString(12, aluno.getEstadoCivil());
            ps.setString(13, aluno.getRg());
            ps.setString(14, aluno.getEmail());
            ps.setString(15, aluno.getEscolaridade());
            ps.setString(16, aluno.getCpf());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public Aluno consultar(String cpf) {
        Aluno a = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tb_Aluno WHERE cpf = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                a = new Aluno(rs.getString("nome"), cpf);
                a.setDataNasc(rs.getString("dataNasc"));
                a.setEndereco(rs.getString("endereco"));
                a.setNumero(rs.getInt("numero"));
                a.setBairro(rs.getString("bairro"));
                a.setCidade(rs.getString("cidade"));
                a.setEstado(rs.getString("estado"));
                a.setCep(rs.getString("cep"));
                a.setTelefone(rs.getString("telefone"));
                a.setCelular(rs.getString("celular"));
                a.setSexo(rs.getString("sexo"));
                a.setEstadoCivil(rs.getString("estadoCivil"));
                a.setRg(rs.getString("rg"));
                a.setEmail(rs.getString("email"));
                a.setEscolaridade(rs.getString("escolaridade"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (a);
    }

    public void excluir(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_Aluno WHERE cpf = ?");
            ps.setString(1, aluno.getCpf());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
