package beancopy.demo.test.base;

import beancopy.demo.test.ProductInfo;

import java.util.Date;

/**
 * @author Song Yinghui
 * @date 2019/9/4
 * @Version 1.0
 */
public class TargetBean {

    private int id;
    private String productName;
    private Double price ;
    private Integer status ;
    private byte data ;
    private Date createTime ;
    private ProductInfo productInfo ;

//    private InnerVo innerVo ;
//
//    public InnerVo getInnerVo() {
//        return innerVo;
//    }
//
//    public void setInnerVo(InnerVo innerVo) {
//        this.innerVo = innerVo;
//    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    protected void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    protected void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    protected void setStatus(Integer status) {
        this.status = status;
    }

    public byte getData() {
        return data;
    }

    protected void setData(byte data) {
        this.data = data;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    protected void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

//    public static class InnerVo{
//        private String innerName ;
//
//        public String getInnerName() {
//            return innerName;
//        }
//
//        public void setInnerName(String innerName) {
//            this.innerName = innerName;
//        }
//    }
}
