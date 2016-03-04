// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Tipo_StatusDAOImpl.java

package br.net.sicap.sicap_business.dao.impl;

import br.net.sicap.sicap_business.dao.ITipo_StatusDAO;
import br.net.sicap.sicap_business.vo.TipoStatusVO;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Tipo_StatusDAOImpl extends JdbcTemplate
    implements ITipo_StatusDAO
{

    public Tipo_StatusDAOImpl()
    {
    }

    public Tipo_StatusDAOImpl(DataSource dataSource)
    {
        setDataSource(dataSource);
    }

    public boolean inserirTipoStatus(TipoStatusVO vo)
    {
        return false;
    }

    public boolean alterarTipoStatus(TipoStatusVO vo)
    {
        return false;
    }

    public boolean deletarTipoStatus(int id)
    {
        return false;
    }

    public List listaTodos()
    {
        return null;
    }
}
