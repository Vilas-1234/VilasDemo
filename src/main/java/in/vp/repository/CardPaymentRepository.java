package in.vp.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vp.entity.CardPaymentTicket;
import in.vp.entity.Movies;

public interface CardPaymentRepository extends JpaRepository<CardPaymentTicket, UUID> {


	CardPaymentTicket findByCardNo(String cardno);

}
