
import br.edu.ifsul.cc.lpoo.estacionamentoifsul.lpoo_sistemaestacionamentoifsul.dao.PersistenciaJPA;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteConexao {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TesteConexao() {
    }
    
    @Before
    public void setUp() {
        if(jpa.conexaoAberta()){
            System.out.println("Conexão aberta");
        } else {
            System.out.println("Erro ao abrir conexao");
        }
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    @Test
    public void testeConexao() {
        System.out.println("Conexão realizada com sucesso");
    }
}
