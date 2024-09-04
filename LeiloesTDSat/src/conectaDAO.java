import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {
    
    public Connection connectDB() {
        Connection conn = null;
        
        try {
            // String de conexão corrigida
            conn = DriverManager.getConnection("jdbc:mysql://localhost/uc11?useSSL=false", "root", "a1b2c3ct204v22");
        } catch (SQLException erro) {
            // Tratamento de erro
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO: " + erro.getMessage());
        }
        return conn;
    }
}
