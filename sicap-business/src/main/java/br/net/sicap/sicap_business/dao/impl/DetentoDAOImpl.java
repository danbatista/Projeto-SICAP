// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DetentoDAOImpl.java

package br.net.sicap.sicap_business.dao.impl;

import br.net.sicap.sicap_business.dao.IDetentoDAO;
import br.net.sicap.sicap_business.vo.DetentoVO;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class DetentoDAOImpl extends JdbcTemplate
    implements IDetentoDAO
{

    public DetentoDAOImpl(DataSource dataSource)
    {
        setDataSource(dataSource);
    }

    public boolean inserirDetento(DetentoVO vo)
    {
        return false;
    }

    public boolean alteraDetento(DetentoVO vo)
    {
        return false;
    }

    public boolean inativarDetento(int id)
    {
        return false;
    }

    public List listaTodos()
    {
        return null;
    }

    private final String INSERT = " insert into";
    private final String UPDATE = " UPDATE ";
    private final String INVATIVE = " ";
    private final String LISTALL = " ";
}
