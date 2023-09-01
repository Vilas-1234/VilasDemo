package in.vp.main.service;

import java.util.List;

import in.vp.dto.BookingRequestDto;
import in.vp.dto.BookingResponseDto;
import in.vp.dto.CardPaymentResponseDto;
import jakarta.validation.Valid;

public interface BookService {

	BookingResponseDto addBooking(@Valid BookingRequestDto bookingReq);

	List<CardPaymentResponseDto> getAllticket();
	

}
