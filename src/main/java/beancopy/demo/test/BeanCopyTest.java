package beancopy.demo.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DoubleConverter;
import org.apache.commons.beanutils.converters.IntegerConverter;
import org.springframework.cglib.beans.BeanCopier;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Song Yinghui
 * @date 2019/9/4
 * @Version 1.0
 */
public class BeanCopyTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        SourceBean sourceBean = new SourceBean();
        sourceBean.setId(1);
        sourceBean.setProductName("商品名称");
        sourceBean.setPrice(10.3);
        sourceBean.setStatus(2);
        sourceBean.setData(new Byte("1"));
        sourceBean.setCreateTime(new Date());
        SourceBean.InnerVo innerVo = new SourceBean().new InnerVo();
        innerVo.setName("测试内部类");
        sourceBean.setInnerVo(innerVo);


        TargetBean targetBean = new TargetBean();
        TargetBean2 targetBean2 = new TargetBean2();


        IBeanCopy apacheBeanCopy = new ApacheBeanCopy();
        IBeanCopy cglibBeanCopy = new CglibBeanCopy();
        IBeanCopy springBeanCopy = new SpringBeanCopy();
        IBeanCopy javaBeanCopy = new JavaBeanCopy();
        int count = 10000;
        System.out.print("apacheBeanCopy:");
        test(apacheBeanCopy , sourceBean,targetBean,count);
        System.out.print("cglibBeanCopy:");
        test(cglibBeanCopy , sourceBean,targetBean,count);
        System.out.print("springBeanCopy:");
        test(springBeanCopy , sourceBean,targetBean,count);
        System.out.print("javaBeanCopy:");
        test(javaBeanCopy , sourceBean,targetBean,count);

        map2Bean();
        cglibBeanUtil(sourceBean , targetBean2);
        springBeanUtil(sourceBean , targetBean2);
    }

    public static void test(IBeanCopy beanCopy, SourceBean sourceBean , TargetBean targetBean,int count) throws InvocationTargetException, IllegalAccessException {
        long startTime = System.currentTimeMillis();
        for (int i = 0 ; i< count; i++){
            beanCopy.copeBean(sourceBean , targetBean);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("耗时："+(endTime - startTime));
        System.out.println(JSON.toJSONString(targetBean, SerializerFeature.WriteMapNullValue));
    }

    public static void map2Bean() throws InvocationTargetException, IllegalAccessException {

        Map<String, Object> param = new HashMap<>();
        param.put("id", 1);
        param.put("productName", "测试Map2Bean");
        param.put("price","");
        param.put("status","");
        param.put("data",new Byte("1"));

        TargetBean targetBean = new TargetBean();
//        ConvertUtils.register(new IntegerConverter(null), Integer.class);
//        ConvertUtils.register(new DoubleConverter(null) , Double.class);
        BeanUtils.populate(targetBean , param);
        System.out.println(JSON.toJSONString(targetBean , SerializerFeature.WriteMapNullValue));
    }

    public static void cglibBeanUtil(SourceBean sourceBean , TargetBean2 targetBean2){
        BeanCopier beanCopier = BeanCopier.create(SourceBean.class , TargetBean2.class, false);
        beanCopier.copy(sourceBean,targetBean2,null);
        System.out.println(JSON.toJSONString(targetBean2 , SerializerFeature.WriteMapNullValue));
    }

    public static void springBeanUtil(SourceBean sourceBean , TargetBean2 targetBean2){
        org.springframework.beans.BeanUtils.copyProperties(sourceBean , targetBean2);
        System.out.println(JSON.toJSONString(targetBean2 , SerializerFeature.WriteMapNullValue));
    }
}
