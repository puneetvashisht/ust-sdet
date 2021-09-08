package com.ust.day2.inherit;

public class TestFI {

	public static void main(String[] args) {
		
		VanillaStock stock = new VanillaStock(12, "TCS", "NSE", 3000, 1.3, 1.1);
		
//		System.out.println(stock);
//		stock.sell(10);
//		
//		stock.buy(20);

		
		PrefferedStock ps = new PrefferedStock(12, "TCS", "NSE", 3000, 1.3, 1.1, 34344343);
		
//		FinancialInstrument instruments[] = {stock, ps};
		FinancialInstrument instruments[] = new FinancialInstrument[2];
		instruments[0] = stock;
		instruments[0] = ps;
		
		for(FinancialInstrument instrument: instruments) {
			System.out.println(instrument);
			instrument.sell(10);
			instrument.buy(20);
			
			System.out.println(instrument instanceof PrefferedStock);
			if(instrument instanceof PrefferedStock) {
				PrefferedStock ps1 = (PrefferedStock)instrument;
				ps1.shareCaptitalCost();
			}
			
			
		}
		
		
		
//		System.out.println(ps);
//		ps.sell(10);
//		
//		ps.buy(20);
//		ps.shareCaptitalCost();
//	}
	}
	

}
