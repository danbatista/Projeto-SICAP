package br.net.sicap.sicap_business.bo;

import java.util.List;

import br.net.sicap.sicap_business.vo.TipoStatusVO;

public interface ITipo_StatusBO {
	
    public  boolean inserirTipoStatus(TipoStatusVO vo);

    public  boolean alterarTipoStatus(TipoStatusVO vo);

    public  boolean deletarTipoStatus(int cod);

    public List<TipoStatusVO> listaTodos();

}
