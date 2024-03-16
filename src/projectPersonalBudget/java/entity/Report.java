package projectPersonalBudget.java.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Report {

    private LocalDate periodStart;
    private LocalDate periodEnd;
    private double totalIncome;
    private double totalExpense;
    private double balance;

    public Report(LocalDate periodStart, LocalDate periodEnd, double totalIncome, double totalExpense, double balance) {
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
        this.totalIncome = totalIncome;
        this.totalExpense = totalExpense;
        this.balance = balance;
    }

    public LocalDate getPeriodStart() {
        return periodStart;
    }

    public LocalDate getPeriodEnd() {
        return periodEnd;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public double getBalance() {
        return balance;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report report = (Report) o;
        return Double.compare(totalIncome, report.totalIncome) == 0 && Double.compare(totalExpense, report.totalExpense) == 0 && Double.compare(balance, report.balance) == 0 && Objects.equals(periodStart, report.periodStart) && Objects.equals(periodEnd, report.periodEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodStart, periodEnd, totalIncome, totalExpense, balance);
    }

    @Override
    public String toString() {
        return "Report{" +
                "periodStart=" + periodStart +
                ", periodEnd=" + periodEnd +
                ", totalIncome=" + totalIncome +
                ", totalExpense=" + totalExpense +
                ", balance=" + balance +
                '}';
    }
}
