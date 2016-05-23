package br.net.sicap.sicap_business.bo;

import java.util.List;

import br.net.sicap.sicap_business.vo.DetentoVO;

public interface IDetentoBO {
	
    public  boolean inserirDetento(DetentoVO detentovo);

    public  boolean alteraDetento(DetentoVO detentovo);

    public  boolean inativarDetento(int cod);

    public  List<DetentoVO> listaTodos();
   
    public  DetentoVO listById(int cod);

}
