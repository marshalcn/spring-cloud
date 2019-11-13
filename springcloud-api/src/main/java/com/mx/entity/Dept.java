package com.mx.entity;

import java.io.Serializable;

/**
 * We used lombok component to auto fixed the constructor and
 * setter getter method . If you want your code commonly used
 * by another you should suppose to generate them by yourself
 */

public class Dept implements Serializable {
    private Integer deptno ;
    private String dname ;
    private String dbSource ;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }
}
