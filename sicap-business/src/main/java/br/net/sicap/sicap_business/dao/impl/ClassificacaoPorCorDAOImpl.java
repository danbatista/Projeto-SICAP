
package br.net.sicap.sicap_business.dao.impl;

import br.net.sicap.sicap_business.dao.IClassificacaoPorCor;
import br.net.sicap.sicap_business.vo.ClassificacaoCorVO;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ClassificacaoPorCorDAOImpl extends JdbcTemplate
    implements IClassificacaoPorCor
{

    public ClassificacaoPorCorDAOImpl()
    {
    }

    public ClassificacaoPorCorDAOImpl(DataSource dataSource)
    {
        setDataSource(dataSource);
    }

    public boolean inserirClassCor(ClassificacaoCorVO vo)
    {
        return false;
    }

    public boolean alteraClassCor(ClassificacaoCorVO vo)
    {
        return false;
    }

    public boolean inativarClassCor(int id)
    {
        return false;
    }

    public List listaTodos()
    {
        return null;
    }
}
