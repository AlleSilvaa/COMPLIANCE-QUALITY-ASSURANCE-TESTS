package JUNIT;

	import static org.junit.jupiter.api.Assertions.assertEquals;
	import org.junit.jupiter.api.Test;
	import br.com.fiap.beans.CodigoPessoaFisica;

		public class TesteCodigoPessoa {

		    // Função para verificar
		    public void equals(boolean expected, boolean actual) {
		        assertEquals(expected, actual);
		    }

		    @Test
		    public void testValidaCPFCorreto() {
		        CodigoPessoaFisica cpf = new CodigoPessoaFisica();
		        
		        // CPF valido
		        equals(true, cpf.validaCPF("529.982.247-25"));
		        equals(true, cpf.validaCPF("52998224725"));
		    }
		    
		    @Test
		    public void testValidaCPFIncorreto() {
		        CodigoPessoaFisica cpf = new CodigoPessoaFisica();
		        
		        // CPF invalido
		        equals(false, cpf.validaCPF("000.000.000-00"));
		        equals(false, cpf.validaCPF("123.456.789-10"));
		        equals(false, cpf.validaCPF("111.111.111-11"));
		        equals(false, cpf.validaCPF("999.999.999-99"));
		        equals(false, cpf.validaCPF("52998224726"));
		    }
		    
		    @Test
		    public void testRemoveCaracteresEspeciais() {
		        CodigoPessoaFisica cpf = new CodigoPessoaFisica();

		        // CPF -/.
		        String cpfComPontosETraço = "529.982.247-25";
		        String cpfApenasNumeros = "52998224725";

		        // Verifica de remoção
		        assertEquals(cpfApenasNumeros, cpf.removeCaracteresEspeciais(cpfComPontosETraço));
		    }
		}



