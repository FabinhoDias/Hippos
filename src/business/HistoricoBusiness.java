package business;

import java.util.List;

import dao.HistoricoDAO;
import domain.Historico;
import domain.Usuario;

public class HistoricoBusiness {

	HistoricoDAO dao = new HistoricoDAO();

	public boolean salvar(Historico historico) {
		return dao.salvarHistorico(historico);
	}

	public boolean excluir(Historico historico) {
		return dao.removerHistorico(historico);
	}
	
	public boolean atualizar(Historico historico) {
		return dao.atualizarHistorico(historico);
	}

	public List<Historico> getListaDeHistoricos() {
		return dao.listaDeHistoricos();
	}

	public Historico getHistorico(Usuario usuario) {
		return dao.buscarHistorico(usuario);
	}

	public Historico getHistorico(int id) {
		return dao.buscarHistorico(id);
	}
}
