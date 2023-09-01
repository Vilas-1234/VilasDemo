package in.vp.main.service;

import in.vp.dto.CardPaymentRequestDto;
import in.vp.dto.CardPaymentResponseDto;

public interface CardPaymentService {

	CardPaymentResponseDto payment(CardPaymentRequestDto cardpaymentReqDto);
	

}
