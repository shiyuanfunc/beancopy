package beancopy.demo.test;

/**
 * @author Song Yinghui
 * @date 2019/9/4
 * @Version 1.0
 */
public class BeanCopyTest {
    public static void main(String[] args) {

        SourceBean sourceBean = new SourceBean();
        sourceBean.setId(1);
        sourceBean.setProductName("商品名称");
        sourceBean.setPrice(10.3);
        sourceBean.setStatus(1);
        sourceBean.setData(new Byte("1"));



    }
}
