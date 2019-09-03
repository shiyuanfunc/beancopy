package beancopy.demo.test;


import org.springframework.cglib.beans.BeanCopier;

/**
 * @author Song Yinghui
 * @date 2019/9/4
 * @Version 1.0
 */
public class CglibBeanCopy implements IBeanCopy {

    private BeanCopier beanCopier = BeanCopier.create(SourceBean.class , TargetBean.class, false);

    @Override
    public void copeBean(SourceBean sourceBean, TargetBean targetBean) {
        beanCopier.copy(sourceBean,targetBean,null);
    }
}
