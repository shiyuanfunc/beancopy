package beancopy.demo.test.base;

import beancopy.demo.test.SourceBean;

/**
 * @author Song Yinghui
 * @date 2019/9/4
 * @Version 1.0
 */
public class JavaBeanCopy implements IBeanCopy {

    @Override
    public void copeBean(SourceBean sourceBean, TargetBean targetBean) {
        targetBean.setId(sourceBean.getId());
        targetBean.setProductName(sourceBean.getProductName());
        targetBean.setStatus(sourceBean.getStatus());
        targetBean.setPrice(sourceBean.getPrice());
        targetBean.setData(sourceBean.getData());
    }
}
