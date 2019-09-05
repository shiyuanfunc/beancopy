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

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    //    private InnerVo innerVo ;
//
//    public InnerVo getInnerVo() {
//        return innerVo;
//    }
//
//    public void setInnerVo(InnerVo innerVo) {
//        this.innerVo = innerVo;
//    }



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
