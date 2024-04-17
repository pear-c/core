package hello.core.order;

public class Order {
    private Long memberId;
    private String itemName;
    private int itenPrice;
    private int discountPrice;

    public Order(Long memberId, String itemName, int itenPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itenPrice = itenPrice;
        this.discountPrice = discountPrice;
    }

    public int calculatePrice(){
        return itenPrice - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItenPrice() {
        return itenPrice;
    }

    public void setItenPrice(int itenPrice) {
        this.itenPrice = itenPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itenPrice=" + itenPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
