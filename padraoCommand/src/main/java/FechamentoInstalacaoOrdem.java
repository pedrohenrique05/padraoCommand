public class FechamentoInstalacaoOrdem implements OrdemServico{

    private Instalacao inst;

    public FechamentoInstalacaoOrdem(Instalacao inst) {
        this.inst = inst;
    }

    @Override
    public void abrirOrdem() {
        this.inst.fecharOrdemServico();
    }

    @Override
    public void fecharOrdem() {
        this.inst.abrirOrdemServico();
    }
}
