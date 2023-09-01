package in.vp.dto;

import java.util.List;

import lombok.Data;

@Data

public class CardPaymentRequestDto {
	private Integer totalPrice;
	private Integer price;
	private String username;
	private String userEmail;
	private String moviesName;
	private String poster;
	private String location;
	private String theater;
	private List<String> bookedSeats;
	private String time;
	private String food;
	private String cardHolder;
	private String cardNo;
	private String expDate;

}
