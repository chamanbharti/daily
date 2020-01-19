package com.example.demo;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping(path="/thresholdOptions",method = RequestMethod.POST)	
	public Map<String, Object> thresholdOptions(float item_amount,float amount_to_apply){
		     Map<String, Object> responseObject = new LinkedHashMap<String, Object>();
		     String status = null;
		     boolean allButtonEnable = false;
		     boolean underPaymentFieldActive = false;
		     boolean overPaymentFieldActive = false;
		     String message = null;
		     try {
		    	 
		    	 //item_amount is total amount
		    	 float  dividedAmount = amount_to_apply/item_amount;
		 		 System.out.println("dividedAmount:"+dividedAmount);
		 		 float percentage = dividedAmount*100;
		 		 System.out.println("percentage:"+percentage);
		 		 //List<Map<String,Object>> paymentThresholdList = jdbcTemplate.queryForList("select * from payment_threshold");
		 		 int percent_partial = 60;//Integer.parseInt(paymentThresholdList.get(0).get("percent_partial").toString());
		 		 int percent_under = 90;//Integer.parseInt(paymentThresholdList.get(0).get("percent_under").toString());
		 		 //int percent_max_under_under = Integer.parseInt(paymentThresholdList.get(0).get("max_under_under").toString());
		 		 //int percent_max_under_full = Integer.parseInt(paymentThresholdList.get(0).get("max_under_full").toString());
		 		 
		 		 int percent_over = 110;//Integer.parseInt(paymentThresholdList.get(0).get("percent_over").toString());
		 		 int percent_refund = 140;//Integer.parseInt(paymentThresholdList.get(0).get("percent_refund").toString());
		 		 //int percent_max_over_full = Integer.parseInt(paymentThresholdList.get(0).get("max_over_full").toString());
		 		// int percent_max_over_over = Integer.parseInt(paymentThresholdList.get(0).get("max_over_over").toString());
		    	 int finalPercent = (int) percentage;
		    	 // I have to check amount_to_apply fulfill which condition
		    	 if(finalPercent == 100) {
	    			 message = "Payment has been paid successfully";
	    			 responseObject.put("message", message);
	    	    }if (finalPercent < percent_over) {
					underPaymentFieldActive = true;
					if(finalPercent < percent_partial) {
		    			 status = "Partial Payment";
		    			 responseObject.put("status", status);
		    			 allButtonEnable = false;
		    			 responseObject.put("allButtonEnable", allButtonEnable);
		    			 responseObject.put("underPaymentFieldActive", underPaymentFieldActive);
					 	 responseObject.put("overPaymentFieldActive", overPaymentFieldActive);
		          }
				  //If finalPercent is >=percent_partial and finalPercent < percent_under
		    	  if(finalPercent >= percent_partial && finalPercent < percent_under) {
		    		  	 status = "Partial Payment";
		    		  	 responseObject.put("status", status);
		    			 allButtonEnable = true;
		    			 responseObject.put("allButtonEnable", allButtonEnable);
		    			 responseObject.put("underPaymentFieldActive", underPaymentFieldActive);
					 	 responseObject.put("overPaymentFieldActive", overPaymentFieldActive);
		    	  }if(amount_to_apply < item_amount && status == null) {
		    			 message = "The underpayment is within threshold values. It will be treated as full payment.";
		    			 responseObject.put("message", message);
		    	  }else if(amount_to_apply > item_amount && status == null) {
			    			 message = "The overpayment is within threshold values. It will be treated as full payment.";
			    			 responseObject.put("message", message);
		    	  }
				} else {
					overPaymentFieldActive = true;
					// if percentage is >= percent_refund
					if(finalPercent >= percent_refund) {
			    		 status = "Refund Overage";
			    		 responseObject.put("status", status);
		    			 allButtonEnable = false;
		    			 responseObject.put("allButtonEnable", allButtonEnable);
		    			 responseObject.put("underPaymentFieldActive", underPaymentFieldActive);
					 	 responseObject.put("overPaymentFieldActive", overPaymentFieldActive);
			    	 }
					// if percentage is >= percent_over and < percent_refund
					if(finalPercent >= percent_over && finalPercent < percent_refund) { 
		    		  	 status = "Refund Overage";
		    		  	 responseObject.put("status", status);
		    			 allButtonEnable = true;
		    			 responseObject.put("allButtonEnable", allButtonEnable);
		    			 responseObject.put("underPaymentFieldActive", underPaymentFieldActive);
					 	 responseObject.put("overPaymentFieldActive", overPaymentFieldActive);
		    	     }
				}	
		    	 responseObject.put("item_amount", item_amount);
		    	 responseObject.put("amount_to_apply", amount_to_apply);
		    	 responseObject.put("percentage", finalPercent);
		     }
		    catch (Exception e) {
			 e.printStackTrace();
		}
		return responseObject;
	}

}
