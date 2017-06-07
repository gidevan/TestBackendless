package com.sample.api.dao;

import com.sample.api.domain.Item;

import java.util.List;

/**
 * Created by ivan on 7.6.17.
 */
public class ItemDaoImpl implements ItemDao {

    private static final int ITEM_COUNT = 10;
    private static final String NAME_PREFIX = "TestItem_";

    private List<Item> items;

    public ItemDaoImpl() {
        for(long i = 0; i < ITEM_COUNT; i++) {
            Item item = new Item(i, NAME_PREFIX + i);
            items.add(item);
        }
    }

    @Override
    public Item findById(Long id) {
        return items.stream().filter(it -> it.getId().equals(id)).findFirst().orElse(null);
    }
}
