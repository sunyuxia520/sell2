package com.sxx.sell.repository;

import com.sxx.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory =  repository.getOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("男生最爱",4);
//        productCategory.setCategoryId(2); 更新的一种方法:将需要修改的id set进去，其他需要修改的地方在set 然后保存即可
//        productCategory.setCategoryName("老人最爱");
//        productCategory.setCategoryType(4);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

//    @Test
//    public void updateTest(){
//        ProductCategory productCategory = repository.getOne(2);
//        productCategory.setCategoryName("女生最爱");
//        productCategory.setCategoryType(3);
//        repository.save(productCategory);
//    }
    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }

}