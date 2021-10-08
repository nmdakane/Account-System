package com.lelo.webdomain.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lelo.webdomain.persistence.Rewards;

public class RewardsDTO {
    private String category;
    private String name;
    private String amount;

    public RewardsDTO() {
    }

    public RewardsDTO(Rewards rewards) {
        this.amount = rewards.getAmount();
        this.name = rewards.getName();
        this.category = rewards.getCategory();
    }

    public RewardsDTO(String category, String name, String amount) {
        this.category = category;
        this.name = name;
        this.amount = amount;
    }

    @JsonIgnore
    public Rewards buildReward(RewardsDTO rewardsDTO){
        return  new Rewards(null,this.getCategory(),this.getName(), this.getAmount());
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "RewardsDTO{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
