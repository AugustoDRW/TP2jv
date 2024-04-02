package org.example;

import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class AlunoTestes {

    @Test
    public void testCriarAluno() {
        Aluno aluno = new Aluno("Augusto", "231", 3.7, 5, 2.23);


        assertEquals("Augusto", aluno.getNome());
        assertEquals("231", aluno.getTurma());
        assertEquals(3.7, aluno.getNotat1());
        assertEquals(5, aluno.getNotat2());
        assertEquals(2.23, aluno.getNotat3());

    }

    @Test
    public void testCriarAluno2() {
        Aluno aluno = new Aluno("Luiz", "231", 4, 5, 3.5);


        assertEquals("Luiz", aluno.getNome());
        assertEquals("231", aluno.getTurma());
        assertEquals(4, aluno.getNotat1());
        assertEquals(5, aluno.getNotat2());
        assertEquals(3.5, aluno.getNotat3());

        assertEquals("4,17",aluno.media());
        assertEquals("Reprovado",aluno.aprovado());
    }

    @Test
    public void testCriarAluno3() {
        Aluno aluno = new Aluno("Vitor", "231", 8, 6, 7.65);


        assertEquals("Vitor", aluno.getNome());
        assertEquals("231", aluno.getTurma());
        assertEquals(8, aluno.getNotat1());
        assertEquals(6, aluno.getNotat2());
        assertEquals(7.65, aluno.getNotat3());

        assertEquals("7,22",aluno.media());
        assertEquals("Aprovado",aluno.aprovado());
    }
    @Test
    public void testCriarAluno4() {
        Aluno aluno = new Aluno("Vitor", "231", 8, 6, 7.65);


        assertEquals("Vitor", aluno.getNome());
        assertEquals("231", aluno.getTurma());
        assertEquals(8, aluno.getNotat1());
        assertEquals(6, aluno.getNotat2());
        assertEquals(7.65, aluno.getNotat3());

        assertEquals("7,22",aluno.media());
        assertEquals("Aprovado",aluno.aprovado());

        aluno.setNome("Lucas");
        aluno.setTurma("221");
        aluno.setNotat1(7);
        aluno.setNotat2(8);
        aluno.setNotat3(6);

        assertEquals("Lucas", aluno.getNome());
        assertEquals("221", aluno.getTurma());
        assertEquals(7, aluno.getNotat1());
        assertEquals(8, aluno.getNotat2());
        assertEquals(6, aluno.getNotat3());

        assertEquals("7,00",aluno.media());
        assertEquals("Aprovado",aluno.aprovado());


    }


}
