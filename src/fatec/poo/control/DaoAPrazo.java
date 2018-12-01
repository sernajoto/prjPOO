package fatec.poo.control;

import fatec.poo.model.APrazo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Guilherme Sernajoto
 */
public class DaoAPrazo {
    private Connection conn;

    public DaoAPrazo(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(APrazo aPrazo) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_APrazo(codAprazo, valor, dtVencimento, taxaJuros, qtdeMensalidade)"
                    + "VALUES(seqPK_APrazo.nextval, ?, ?, ?, ?)");
            ps.setDouble(1, aPrazo.getValor());
            ps.setString(2, aPrazo.getDtVencimento());
            ps.setDouble(3, aPrazo.getTaxaJuros());
            ps.setInt(4, aPrazo.getQtdeMensalidade());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(APrazo aPrazo) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tb_APrazo SET valor = ?, dtVencimento = ?, taxaJuros = ?, qtdeMensalidade = ?"
                    + "WHERE codAprazo = ?");
            ps.setDouble(1, aPrazo.getValor());
            ps.setString(2, aPrazo.getDtVencimento());
            ps.setDouble(3, aPrazo.getTaxaJuros());
            ps.setInt(4, aPrazo.getQtdeMensalidade());   
            ps.setInt(5, aPrazo.getCodAprazo());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public APrazo consultar(int codAprazo) {
        APrazo ap = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tb_APrazo WHERE codAprazo = ?");
            ps.setInt(1, codAprazo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ap = new APrazo();
                ap.setCodAprazo(codAprazo);
                ap.setValor(rs.getDouble("valor"));
                ap.setDtVencimento(rs.getString("dtVencimento"));
                ap.setTaxaJuros(rs.getDouble("taxaJuros"));
                ap.setQtdeMensalidade(rs.getInt("qtdeMensalidade"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (ap);
    }

    public void excluir(APrazo aPrazo) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_APrazo WHERE codAprazo = ?");
            ps.setInt(1, aPrazo.getCodAprazo());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
