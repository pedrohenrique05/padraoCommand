public class AberturaInstalacaoOrdem implements OrdemServico{

    private Instalacao inst;

    public AberturaInstalacaoOrdem(Instalacao inst) {
        this.inst = inst;
    }

    @Override
    public void abrirOrdem() {
        this.inst.abrirOrdemServico();
    }

    @Override
    public void fecharOrdem() {
        this.inst.fecharOrdemServico();
    }
}
