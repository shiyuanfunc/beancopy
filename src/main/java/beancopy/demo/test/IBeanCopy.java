package beancopy.demo.test;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Song Yinghui
 * @date 2019/9/4
 * @Version 1.0
 */
public interface IBeanCopy {

    void copeBean(SourceBean sourceBean , TargetBean targetBean) throws InvocationTargetException, IllegalAccessException;
    //void copeBean2(SourceBean sourceBean , TargetBean2 targetBean) throws InvocationTargetException, IllegalAccessException;
}
