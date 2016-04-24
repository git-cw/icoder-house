package com.icoder.jxhouse.pojo.vo.common;

import java.util.List;

/**
 * Created by congwangshi on 16/4/24.
 */
public class PageSupport {
    /** 表示第几页 */
    private int pageIndex;
    /** 表示每页多少数据 */
    private int pageSize;
    /** 总计 */
    private int total;
    /** 数据成员 */
    private List rows;

    public PageSupport()
    {
    }

    public PageSupport(int pageIndex, int pageSize, int total, List rows)
    {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.total = total;
        this.rows = rows;
    }

    public PageSupport(int pageIndex, int pageSize)
    {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }

    public int getPageIndex()
    {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex)
    {
        this.pageIndex = pageIndex;
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

    public int getTotal()
    {
        return total;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }

    public List getRows()
    {
        return rows;
    }

    public void setRows(List rows)
    {
        this.rows = rows;
    }
}
