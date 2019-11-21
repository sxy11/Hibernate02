package com.sxy.dao;

import com.sxy.po.Emp;

import java.util.List;

/**
 * @author 孙鑫悦
 * @create 2019-11-21-11:00
 */
public interface EmpDao {
    /*
    * 查询全部
    * */
List<Emp> selectAll();
}
