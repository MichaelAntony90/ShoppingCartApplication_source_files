package com.group.cart.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.group.cart.bean.Product;
import com.group.cart.bean.ProductList;

public class ProductListsUtil {

	public static final List<Product> prodList = new ArrayList<Product>();

	static {
		Product prodOne = new Product(
				1,
				"Mens Shoe",
				"$139.99",
				"I.G.S (Impact Guidance System) Technology: ASICS design philosophy that employs linked componentry to enhance the foot's "
						+ "natural gait from heel strike to toe-off.Dynamic DuoMax Support System: This evolution of DuoMax system enhances stability and"
						+ " support, with reduced weight and increased platform support");

		Product prodTwo = new Product(
				2,
				"Memory Card",
				"$15.99",
				"Ideal for premium Android based smartphones and tablets"
						+ "Up to 80 MB/s transfer speed, Comes with SD adapter for use in cameras");

		Product prodThree = new Product(
				3,
				"Dumbbells",
				"$15.18",
				"Rubber dumbbells are ideal for powerwalks, group exercises, bodybuilding, strengthening muscles, alleviating stress,"
						+ " physical therapy and other general exercises.Rubber sides increase durability, reduce noise, "
						+ "protect flooring, enhance appearance and is easy to clean.");

		Product prodFour = new Product(4, "External Hard Drive", "$77.88",
				"Create easy customized backup plans with included Dashboard software ."
						+ "USB powered - no power supply necessary."
						+ "Quick file transfer with USB 3.0 connectivity.");

		Product prodFive = new Product(
				5,
				"Java Book",
				"$21.09",
				"Ready to learn computer programming but aren't sure where to start. Look no further,"
						+ " Computer Programming for Teens is the book for you.");
		Product prodSix = new Product(
				6,
				"Toy Car",
				"$14.02",
				"Blocks in car are driving into your room, and big blocks are easy to build"
						+ "comes packed in a plastic car"
						+ "Recommended age 2+. 100% Brand New with Original Package.");

		Product prodSeven = new Product(
				7,
				"Smart Phone",
				"$99.01",
				"Roaming capability and network frequency support may not be available.Check with your network provider to see if and to what extent they "
						+ "offer support for this device."
						+ "4G-LTE Bands 1, 2, 3, 4, 5, 7, 12, 29, and 30");

		Product prodEight = new Product(8, "Kindle Tab", "$100.01",
				"Kindle Tab 1280x800 high definition LCD display with over one million pixels"
						+ "Fast 1.5GHz dual-core processor"
						+ "Ultra-fast web browsing over built-in Wi-Fi");

		Product prodNine = new Product(
				9,
				"Bluetooth Speaker",
				"$29.88",
				"Big sound--with deep bass--for a full-range listening experience."
						+ "Wireless and ultra-compact so you can take Bose sound anywhere ."
						+ "Built-in speakerphone lets you take calls out loud"
						+ "Voice prompts talk you through Bluetooth pairing, so it's super easy");

		prodList.add(prodOne);
		prodList.add(prodTwo);
		prodList.add(prodThree);
		prodList.add(prodFour);
		prodList.add(prodFive);
		prodList.add(prodSix);
		prodList.add(prodSeven);
		prodList.add(prodEight);
		prodList.add(prodNine);
	}

	public static ProductList getAvailableProducts() {
		return new ProductList(Collections.unmodifiableList(prodList));
	}

}
