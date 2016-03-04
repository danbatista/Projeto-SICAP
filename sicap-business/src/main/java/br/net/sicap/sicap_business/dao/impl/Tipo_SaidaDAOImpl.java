// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Tipo_SaidaDAOImpl.java

package br.net.sicap.sicap_business.dao.impl;

import br.net.sicap.sicap_business.dao.Itipo_SaidaDAO;
import br.net.sicap.sicap_business.vo.TipoSaidaVO;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Tipo_SaidaDAOImpl extends JdbcTemplate
    implements Itipo_SaidaDAO
{

    public Tipo_SaidaDAOImpl()
    {
    }

    public Tipo_SaidaDAOImpl(DataSource dataSource)
    {
        setDataSource(dataSource);
    }

    public boolean inserirTipoSaida(TipoSaidaVO vo)
    {
        return false;
    }

    public boolean alterarTipoSaida(TipoSaidaVO vo)
    {
        return false;
    }

    public boolean DeletarTipoSaida(int id)
    {
        return false;
    }

    public List listaTodos()
    {
        return null;
    }
}
