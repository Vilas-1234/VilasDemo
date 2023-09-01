package in.vp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.vp.dto.CardPaymentRequestDto;
import in.vp.dto.CardPaymentResponseDto;
import in.vp.main.service.CardPaymentService;

@RestController

public class CardPaymentController {
	@Autowired 
	CardPaymentService cardPaymentService;
	
	
	
	@PostMapping("/pay-now")
	public ResponseEntity<CardPaymentResponseDto> cardPayment(@RequestBody CardPaymentRequestDto cardpaymentReqDto){
		
		return new ResponseEntity<CardPaymentResponseDto>(cardPaymentService.payment(cardpaymentReqDto),HttpStatus.OK);
		
		
	}

}
