package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeRepo.AddressRepo;
import com.example.demo.EmployeeRepo.BankRepo;
import com.example.demo.model.Address;
import com.example.demo.model.Bank;

import jakarta.transaction.Transactional;

@Service
public class BankService {

	@Autowired
	private BankRepo bankRepo;
	@Autowired
	private AddressRepo addRepo;

	@Transactional(rollbackOn = Exception.class )
	public void saveBankDetails() {
		Bank b = new Bank();
		b.setBankIfsc("5585");
		b.setBankName("HDFC");
		b.setId(222);

		bankRepo.save(b);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int a = 10 / 0;
		Address ad = new Address();
		ad.setCity("Pune");
		ad.setPincode("411001");
		ad.setId(131);
		addRepo.save(ad);

	}

}
