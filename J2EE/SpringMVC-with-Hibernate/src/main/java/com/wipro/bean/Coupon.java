package com.wipro.bean;

import javax.persistence.*;

@Entity
@Table(name="Coupon")
public class Coupon {
	@Id
	private String CouponCode;
	private float OfferPercentage;
	public Coupon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coupon(String couponCode, float offerPercentage) {
		super();
		CouponCode = couponCode;
		OfferPercentage = offerPercentage;
	}
	public String getCouponCode() {
		return CouponCode;
	}
	public void setCouponCode(String couponCode) {
		CouponCode = couponCode;
	}
	public float getOfferPercentage() {
		return OfferPercentage;
	}
	public void setOfferPercentage(float offerPercentage) {
		OfferPercentage = offerPercentage;
	}
	@Override
	public String toString() {
		return "Coupon [CouponCode=" + CouponCode + ", OfferPercentage=" + OfferPercentage + "]";
	}

}
