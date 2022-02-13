import java.util.ArrayList;
import java.util.List;

public class Tecnico {

    private List<OrdemServico> ordens = new ArrayList<OrdemServico>();

    public void executarOrdem(OrdemServico os){
        this.ordens.add(os);
        os.abrirOrdem();
    }

    public void cancelarOrdem(){
        if(ordens.size() != 0){
            OrdemServico os = this.ordens.get(this.ordens.size()-1);
            os.fecharOrdem();
            this.ordens.remove(this.ordens.size() - 1);
        }
    }

}
