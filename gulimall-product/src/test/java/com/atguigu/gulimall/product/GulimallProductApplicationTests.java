package com.atguigu.gulimall.product;

//import com.aliyun.oss.OSS;
//import com.aliyun.oss.OSSClient;
//import com.aliyun.oss.OSSClientBuilder;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService   brandService;

//    @Resource
//    OSSClient ossClient;

    @Test
    public   void contextLoads() {
//        BrandEntity brandEntity   = new BrandEntity();
////        brandEntity.setName("pingguo");
////        brandService.save(brandEntity);
        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        System.out.println(brand_id);
        //  System.out.println("保存");
    }

    @Test
    public void testUpload() throws FileNotFoundException {
        // yourEndpoint填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。
//        String endpoint = "oss-cn-beijing.aliyuncs.com";
//      //   阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//        String accessKeyId = "LTAI5tMnAKcoo3i1RYnfcFL5";
//        String accessKeySecret = "CJHGTv2kdDzuyZYRPfq9DR5OcnPctL";
//
//        // 创建OSSClient实例。
//         OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//        // 填写本地文件的完整路径。如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
//        InputStream inputStream = new FileInputStream("E:\\BaiduNetdiskDownload\\javaSSM\\project\\资料源码\\docs\\pics\\2b1837c6c50add30.jpg");
//        // 填写Bucket名称和Object完整路径。Object完整路径中不能包含Bucket名称。
//        ossClient.putObject("gulimall-linfeng", "0d40c24b264aa511.jpg", inputStream);
//
//// 关闭OSSClient。
//        ossClient.shutdown();
//        System.out.println("成功");
    }

}
