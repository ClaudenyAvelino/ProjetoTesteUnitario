package br.com.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.teste.modelo.Aluno;
import br.com.teste.modelo.Disciplina;
import br.com.teste.negocio.MatriculaNE;

@SpringBootTest
class ProjetoTesteUnitarioApplicationTests {

	@Test
	void teste() {
		Aluno aluno = new Aluno();
		Disciplina disciplina = new Disciplina();
		
		boolean  resultado = new MatriculaNE().matricular(aluno, disciplina);
		assertEquals(true, resultado);
	}
	@Test
	void teste2() {
		
	}

}
