package com.userservice.userservice.dto;

import com.userservice.userservice.entity.WishlistEntity;

public class WishlistDTO {
	
	private Integer buyerId;
	private Integer productId;
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "WishlistDTO [BuyerID=" + buyerId + ", ProductId=" + productId + "]";
	}
	
	// Converts Entity into DTO
			public static WishlistDTO valueOf(WishlistEntity wishlistEntity) {
				WishlistDTO wishlistDTO = new WishlistDTO();
				wishlistDTO.setBuyerId(wishlistEntity.getBuyerId());
				wishlistDTO.setProductId(wishlistEntity.getProductId());

				return wishlistDTO;
			}

			// Converts DTO into Entity
			public WishlistEntity createEntity() {
				WishlistEntity wishlistEntity = new WishlistEntity();
				wishlistEntity.setBuyerId(this.getBuyerId());
				wishlistEntity.setProductId(this.getProductId());
				return wishlistEntity;
			}
	
}