
package br.net.sicap.sicap_business.dao.impl;

import br.net.sicap.sicap_business.dao.IParentescoDAO;
import br.net.sicap.sicap_business.vo.ParentescoVO;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ParentescoDAOImpl extends JdbcTemplate
    implements IParentescoDAO
{

    public ParentescoDAOImpl()
    {
    }

    public ParentescoDAOImpl(DataSource dataSource)
    {
        setDataSource(dataSource);
    }

    public boolean inserirParentesco(ParentescoVO vo)
    {
        return false;
    }

    public boolean alterarParentesco(ParentescoVO vo)
    {
        return false;
    }

    public boolean DeletarParentesco(int id)
    {
        return false;
    }

    public List listaTodos()
    {
        return null;
    }
}
