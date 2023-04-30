package com.ltp.workbook;
import java.math.BigDecimal;
import java.util.Objects;

public class Record {
    private String item;
    private BigDecimal revenue;
    private BigDecimal cost;


    public Record() {
    }

    public Record(String item, BigDecimal revenue, BigDecimal cost) {
        this.item = item;
        this.revenue = revenue;
        this.cost = cost;
    }

    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public BigDecimal getRevenue() {
        return this.revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }

    public BigDecimal getCost() {
        return this.cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Record item(String item) {
        setItem(item);
        return this;
    }

    public Record revenue(BigDecimal revenue) {
        setRevenue(revenue);
        return this;
    }

    public Record cost(BigDecimal cost) {
        setCost(cost);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Record)) {
            return false;
        }
        Record record = (Record) o;
        return Objects.equals(item, record.item) && Objects.equals(revenue, record.revenue) && Objects.equals(cost, record.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, revenue, cost);
    }

    @Override
    public String toString() {
        return "{" +
            " item='" + getItem() + "'" +
            ", revenue='" + getRevenue() + "'" +
            ", cost='" + getCost() + "'" +
            "}";
    }

   
}
