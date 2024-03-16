package projectPersonalBudget.java.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Transaction {

    private String id;
    private double amount;
    private LocalDate date;
    private String type;
    private String categoryId;


    public Transaction(String id, double amount, LocalDate date, String type, String categoryId) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.type = type;
        this.categoryId = categoryId;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public String getCategoryId() {
        return categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Double.compare(amount, that.amount) == 0 && Objects.equals(id, that.id) && Objects.equals(date, that.date) && Objects.equals(type, that.type) && Objects.equals(categoryId, that.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, date, type, categoryId);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                ", type='" + type + '\'' +
                ", categoryId='" + categoryId + '\'' +
                '}';
    }
}
