package beancopy.demo.test;

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
}
