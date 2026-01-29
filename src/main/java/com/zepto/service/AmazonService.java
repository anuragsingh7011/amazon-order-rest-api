package com.zepto.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.AmazonEntity;
import com.zepto.repository.AmazonRepository;
import com.zepto.request.AmazonRequest;

@Service
public class AmazonService {
		@Autowired
		AmazonRepository amazonRepository;
		
		public String insertOrder(AmazonRequest amazonRequest) {
			
			AmazonEntity amazonEntity= new AmazonEntity();
			amazonEntity.setItemName(amazonRequest.getItemName());
			amazonEntity.setPrice(amazonRequest.getPrice());
			amazonEntity.setQty(amazonRequest.getQty());
			amazonEntity.setDescription(amazonRequest.getDescription());
			
			amazonRepository.save(amazonEntity);
			
			int orderId=amazonEntity.getId();
			if(orderId>0) {
				return "order placed successfully OrderId: "+ orderId;
			}
			return " order failed to placed";
		}
		
		public Optional<AmazonEntity> fetchOrderById(int id) {
		    return amazonRepository.findById(id);
		}
		
		public Optional<AmazonEntity> updateOrder(AmazonRequest amazonRequest,int id) {

		    Optional<AmazonEntity> optional = amazonRepository.findById(id);

		    if (optional.isPresent()) {
		        AmazonEntity amazonEntity = optional.get();

		        amazonEntity.setItemName(amazonRequest.getItemName());
		        amazonEntity.setPrice(amazonRequest.getPrice());
		        amazonEntity.setQty(amazonRequest.getQty());
		        amazonEntity.setDescription(amazonRequest.getDescription());

		        amazonRepository.save(amazonEntity);   // update in DB
		        return Optional.of(amazonEntity);
		    }

		    return Optional.empty();   // record not found
		}

		public String deleteOrder(int id) {

		    Optional<AmazonEntity> optional =
		            amazonRepository.findById(id);

		    if (optional.isPresent()) {
		        AmazonEntity amazonEntity = optional.get();
		        amazonRepository.delete(amazonEntity);   // update in DB
		        return "Order delte successfully of OrderId: "+amazonEntity.getId();
		    }

		    return "failed to delete order";   // record not found
		}

		
}
