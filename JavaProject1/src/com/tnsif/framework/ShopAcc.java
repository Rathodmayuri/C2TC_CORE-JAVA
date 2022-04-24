package com.tnsif.framework;

public abstract class ShopAcc 
{

	 protected int accNo;
	  protected String accNm;
	  protected float charges;


	   public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}

	 public void ShopAcc1(int accNo2, String accNm2, float charges2) {
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float charges)
	   {
		   
	   }
	   
	  public void iteams(float charges)
	   {
		   
	   }

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	}
