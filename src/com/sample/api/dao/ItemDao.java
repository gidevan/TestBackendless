package com.sample.api.dao;


import com.sample.api.domain.Item;

public interface ItemDao {
    Item findById(Long id);
}
