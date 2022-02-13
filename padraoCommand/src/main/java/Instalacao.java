public class Instalacao{

    private double valorInst;
    private String periodoAgendamento;
    private String status;

    public Instalacao(double valorInst, String periodoAgendamento) {
        this.valorInst = valorInst;
        this.periodoAgendamento = periodoAgendamento;
    }

    public String getStatus(){
        return this.status;
    }

    public void abrirOrdemServico(){
        this.status = "Instalação agendada!";
    }

    public void fecharOrdemServico(){
        this.status = "Instalação cancelada!";
    }
}
