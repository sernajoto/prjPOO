package fatec.poo.control;

import fatec.poo.model.Matricula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Guilherme Sernajoto
 */
public class DaoMatricula {
    private Connection conn;

    public DaoMatricula(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Matricula matricula) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_Matricula(cpf, dtMatricula, siglaTurma, codAvista, codAprazo)"
                    + "VALUES(?, ?, ?, ?, ?)");
            ps.setString(1, matricula.getAluno().getCpf());
            ps.setString(2, matricula.getData());
            ps.setString(3, matricula.getTurma().getSiglaTurma());
            if (matricula.getaVista()== null){
                ps.setString(4, null);
                ps.setInt(5, matricula.getaPrazo().getCodAprazo());
            } else {
                ps.setInt(4, matricula.getaVista().getCodAvista());
                ps.setString(5, null);
            }
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Matricula matricula) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tb_Matricula SET dtMatricula = ?, siglaTurma = ?, codAvista = ?, codAprazo = ?"
                    + "WHERE cpf = ?");
            
            ps.setString(1, matricula.getData());
            ps.setString(2, matricula.getTurma().getSiglaTurma());
            if (matricula.getaVista()== null){
                ps.setString(3, null);
                ps.setInt(4, matricula.getaPrazo().getCodAprazo());
            } else {
                ps.setInt(3, matricula.getaVista().getCodAvista());
                ps.setString(4, null);
            }
            ps.setString(5, matricula.getAluno().getCpf());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public Matricula consultar(String cpf) {
        Matricula m = null;
        DaoAPrazo dap = new DaoAPrazo(conn);
        DaoAVista dav = new DaoAVista(conn);
        DaoTurma dt = new DaoTurma(conn);
        DaoAluno da = new DaoAluno(conn);
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tb_Matricula WHERE cpf = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                m = new Matricula(rs.getString("dtMatricula"));
                m.setAluno(da.consultar(rs.getString("cpf")));
                m.setTurma(dt.consultar(rs.getString("siglaTurma")));
                m.setaVista(dav.consultar(rs.getInt("codAvista")));
                m.setaPrazo(dap.consultar(rs.getInt("codAprazo")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (m);
    }

    public void excluir(Matricula matricula) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_Matricula WHERE cpf = ?");
            ps.setString(1, matricula.getAluno().getCpf());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
