package com.avvedanth7.controller;

import java.util.List;

import com.avvedanth7.dao.MobileDao;
import com.avvedanth7.dto.Mobile;
import com.avvedanth7.dto.Sim;

public class GetMobileSimBymId {
	public static void main(String[] args) {
		MobileDao dao = new MobileDao();

		Mobile mobile = dao.getMobileSimBymId(5);
		if (mobile != null) {
			System.out.println(mobile.getmId());
			System.out.println(mobile.getName());
			System.out.println(mobile.getBrand());
			System.out.println(mobile.getPrice());
			System.out.println("-----------------------------------");

			List<Sim> sims = mobile.getSims();

			for (Sim sim : sims) {
				System.out.println(sim.getsId());
				System.out.println(sim.getProvider());
				System.out.println(sim.getGeneration());
				System.out.println("=====================================");
			}

		} else {
			System.out.println("No mobile with the id specified");
		}
	}

}
