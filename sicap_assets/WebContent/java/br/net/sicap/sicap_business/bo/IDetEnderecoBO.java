package br.net.sicap.sicap_business.bo;

import java.util.List;

import br.net.sicap.sicap_business.vo.DetEnderecoVO;

public interface IDetEnderecoBO
{

    public boolean insert (DetEnderecoVO vo);
    public boolean update (DetEnderecoVO vo);
    public List<DetEnderecoVO> lista();
    public boolean delete (int id);
}
