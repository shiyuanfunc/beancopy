package beancopy.demo.test;

import java.util.Date;

/**
 * @author Song Yinghui
 * @date 2019/9/4
 * @Version 1.0
 */
public class SourceBean {

    private int id;
    private String productName;
    private Double price ;
    private Integer status ;
    private byte data ;
    private Date createTime ;

    private InnerVo innerVo ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public byte getData() {
        return data;
    }

    public void setData(byte data) {
        this.data = data;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public InnerVo getInnerVo() {
        return innerVo;
    }

    public void setInnerVo(InnerVo innerVo) {
        this.innerVo = innerVo;
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
