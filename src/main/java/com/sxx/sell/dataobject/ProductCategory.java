package com.sxx.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 *
 * @author xxx
 * @date 2018/12/14
 */
//@Entity 数据库映射成对象
@Entity
@Proxy(lazy = false)
@DynamicUpdate
@Data
public class ProductCategory {
    //类目id  @Id ：主键；@GeneratedValue：自增类型
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 设置主键自增
    private Integer categoryId;
    //类目名称
    private String categoryName;
    //类目编号
    private Integer categoryType;
    //创建时间
//    private Date createTime;
    //更新时间
//    private Date updateTime;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public ProductCategory() {}

}
