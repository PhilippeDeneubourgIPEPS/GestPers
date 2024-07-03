package util;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class MyDate {

	    private LocalDate date;

	    public MyDate(String dateStr) {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        this.date = LocalDate.parse(dateStr, formatter);
	    }

	    public LocalDate getDate() {
	        return date;
	    }

	    @Override
	    public String toString() {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        return date.format(formatter);
	    }

}
