package beancopy.demo.test;

import java.util.Date;

/**
 * @author Song Yinghui
 * @date 2019/9/4
 * @Version 1.0
 */
public class TargetBean2 {

    private Integer id;
    private String productName;
    private double price ;
    private int status ;
    private byte data ;
    private Date createTime ;

    private InnerVo innerVo ;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public InnerVo getInnerVo() {
        return innerVo;
    }

    public void setInnerVo(InnerVo innerVo) {
        this.innerVo = innerVo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public byte getData() {
        return data;
    }

    public void setData(byte data) {
        this.data = data;
    }

    class InnerVo{
        private String name ;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
