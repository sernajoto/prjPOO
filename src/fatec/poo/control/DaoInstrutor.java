package fatec.poo.control;

import fatec.poo.model.Instrutor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Guilherme Sernajoto
 */
public class DaoInstrutor {

    private Connection conn;

    public DaoInstrutor(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_Instrutor(cpf, nome, dataNasc, endereco, numero, bairro, cidade, estado, cep, telefone, celular, sexo, estadoCivil,"
                    + "rg, email, formacao, areaAtuacao) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, instrutor.getCpf());
            ps.setString(2, instrutor.getNome());
            ps.setString(3, instrutor.getDataNasc());
            ps.setString(4, instrutor.getEndereco());
            ps.setInt(5, instrutor.getNumero());
            ps.setString(6, instrutor.getBairro());
            ps.setString(7, instrutor.getCidade());
            ps.setString(8, instrutor.getEstado());
            ps.setString(9, instrutor.getCep());
            ps.setString(10, instrutor.getTelefone());
            ps.setString(11, instrutor.getCelular());
            ps.setString(12, instrutor.getSexo());
            ps.setString(13, instrutor.getEstadoCivil());
            ps.setString(14, instrutor.getRg());
            ps.setString(15, instrutor.getEmail());
            ps.setString(16, instrutor.getFormacao());
            ps.setString(17, instrutor.getAreaAtuacao());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tb_Instrutor SET nome = ?, dataNasc = ?, endereco = ?, numero = ?, bairro = ?, cidade = ?, estado = ?,"
                    + " cep = ?, telefone = ?, celular = ?, sexo = ?, estadoCivil = ?, rg = ?, email = ?, formacao = ?, areaAtuacao = ? WHERE cpf = ?");
            ps.setString(1, instrutor.getNome());
            ps.setString(2, instrutor.getDataNasc());
            ps.setString(3, instrutor.getEndereco());
            ps.setInt(4, instrutor.getNumero());
            ps.setString(5, instrutor.getBairro());
            ps.setString(6, instrutor.getCidade());
            ps.setString(7, instrutor.getEstado());
            ps.setString(8, instrutor.getCep());
            ps.setString(9, instrutor.getTelefone());
            ps.setString(10, instrutor.getCelular());
            ps.setString(11, instrutor.getSexo());
            ps.setString(12, instrutor.getEstadoCivil());
            ps.setString(13, instrutor.getRg());
            ps.setString(14, instrutor.getEmail());
            ps.setString(15, instrutor.getFormacao());
            ps.setString(16, instrutor.getAreaAtuacao());
            ps.setString(17, instrutor.getCpf());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public Instrutor consultar(String cpf) {
        Instrutor i = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tb_Instrutor WHERE cpf = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                i = new Instrutor(rs.getString("nome"), cpf);
                i.setDataNasc(rs.getString("dataNasc"));
                i.setEndereco(rs.getString("endereco"));
                i.setNumero(rs.getInt("numero"));
                i.setBairro(rs.getString("bairro"));
                i.setCidade(rs.getString("cidade"));
                i.setEstado(rs.getString("estado"));
                i.setCep(rs.getString("cep"));
                i.setTelefone(rs.getString("telefone"));
                i.setCelular(rs.getString("celular"));
                i.setSexo(rs.getString("sexo"));
                i.setEstadoCivil(rs.getString("estadoCivil"));
                i.setRg(rs.getString("rg"));
                i.setEmail(rs.getString("email"));
                i.setFormacao(rs.getString("formacao"));
                i.setAreaAtuacao(rs.getString("areaAtuacao"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (i);
    }

    public void excluir(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_Instrutor WHERE cpf = ?");
            ps.setString(1, instrutor.getCpf());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
