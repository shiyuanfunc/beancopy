package beancopy.demo.test;

import org.springframework.beans.BeanUtils;

/**
 * @author Song Yinghui
 * @date 2019/9/4
 * @Version 1.0
 */
public class SpringBeanCopy implements IBeanCopy {

    @Override
    public void copeBean(SourceBean sourceBean, TargetBean targetBean) {
        BeanUtils.copyProperties(sourceBean, targetBean);
    }
}
