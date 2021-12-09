package test;

import org.junit.jupiter.api.Test;
import padrao.prototype.IdInfo;
import padrao.prototype.Pessoa;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Pessoa pessoa = new Pessoa("Arthur", 22, "Juiz de Fora", new IdInfo(11154245, "Policia"));

        Pessoa pessoaClone = pessoa.clone();
        pessoaClone.setNome("Arthur Clone");
        pessoaClone.setIdade(12);
        pessoaClone.getIdInfo().setNumeroId(5454545);

        assertEquals("Pessoa{nome=Arthur, idade=22, localNascimento=Juiz de Fora, idInfo=IdInfo{numero=11154245, orgao emissor=Policia}}"
                , pessoa.toString());

        assertEquals("Pessoa{nome=Arthur Clone, idade=12, localNascimento=Juiz de Fora, idInfo=IdInfo{numero=5454545, orgao emissor=Policia}}"
                , pessoaClone.toString());
    }

}
