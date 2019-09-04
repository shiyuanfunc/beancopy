package beancopy.demo.test.base;

import beancopy.demo.test.SourceBean;
import beancopy.demo.test.TargetBean;
import beancopy.demo.test.base.IBeanCopy;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Song Yinghui
 * @date 2019/9/4
 * @Version 1.0
 */
public class ApacheBeanCopy implements IBeanCopy {

    @Override
    public void copeBean(SourceBean sourceBean, TargetBean targetBean) throws InvocationTargetException, IllegalAccessException {
        BeanUtils.copyProperties(targetBean, sourceBean);
    }
}
