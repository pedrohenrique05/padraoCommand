import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TecnicoTest {
    Instalacao inst;
    Tecnico tec;
    @BeforeEach
    void setUp(){
        tec = new Tecnico();
        inst = new Instalacao(210,"Manhã");
    }

    @Test
    void deveAbrirOrdemServico(){
        OrdemServico ordem = new AberturaInstalacaoOrdem(inst);
        tec.executarOrdem(ordem);
        assertEquals("Instalação agendada!",inst.getStatus());
    }

    @Test
    void deveFecharOrdemServico(){
        OrdemServico ordem = new FechamentoInstalacaoOrdem(inst);
        tec.executarOrdem(ordem);
        assertEquals("Instalação cancelada!",inst.getStatus());
    }

    @Test
    void deveCancelarFechamentoOrdemServico(){
        OrdemServico ordemAberta = new AberturaInstalacaoOrdem(inst);
        OrdemServico ordemFechada = new FechamentoInstalacaoOrdem(inst);
        tec.executarOrdem(ordemAberta);
        tec.executarOrdem(ordemFechada);
        tec.cancelarOrdem();

        assertEquals("Instalação agendada!",inst.getStatus());
    }
}