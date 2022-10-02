package entities2;

import java.util.Date;

public class HoursContract {
	private Date date;
	private Double ValuePerHour;
	private Integer hours;
	
	public HoursContract() {
		
	}

	public HoursContract(Date date, Double valuePerHour, Integer hours) {
		
		this.date = date;
		this.ValuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return ValuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.ValuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double totalValue() {
		return ValuePerHour * hours;
	}
	
}
