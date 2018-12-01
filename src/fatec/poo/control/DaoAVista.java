package fatec.poo.control;

import fatec.poo.model.AVista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Guilherme Sernajoto
 */
public class DaoAVista {
    private Connection conn;

    public DaoAVista(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(AVista aVista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_AVista(codAVista, valor, agencia, nCheque, preDt)"
                    + "VALUES(seqPK_AVista.nextval, ?, ?, ?, ?)");
            ps.setDouble(1, aVista.getValor());
            ps.setInt(2, aVista.getAgencia());
            ps.setInt(3, aVista.getnCheque());
            ps.setString(4, aVista.getPreData());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(AVista aVista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tb_AVista SET valor = ?, agencia = ?, nCheque = ?, preDt = ?"
                    + "WHERE codAvista = ?");
            ps.setDouble(1, aVista.getValor());
            ps.setInt(2, aVista.getAgencia());
            ps.setInt(3, aVista.getnCheque());
            ps.setString(4, aVista.getPreData());   
            ps.setInt(5, aVista.getCodAvista());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public AVista consultar(int codAvista) {
        AVista av = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tb_AVista WHERE codAvista = ?");
            ps.setInt(1, codAvista);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                av = new AVista();
                av.setCodAvista(codAvista);
                av.setValor(rs.getDouble("valor"));
                av.setAgencia(rs.getInt("agencia"));
                av.setnCheque(rs.getInt("nCheque"));
                av.setPreData(rs.getString("preDt"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (av);
    }

    public void excluir(AVista aVista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_AVista WHERE codAvista = ?");
            ps.setInt(1, aVista.getCodAvista());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
