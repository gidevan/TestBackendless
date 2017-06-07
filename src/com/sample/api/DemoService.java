
package com.sample.api;

import com.backendless.Backendless;
import com.backendless.servercode.IBackendlessService;
import com.sample.api.dao.ItemDao;
import com.sample.api.dao.ItemDaoImpl;
import com.sample.api.domain.Item;

public class DemoService implements IBackendlessService {

    private ItemDao itemDao;

    public String getGreeting(String guestName ) {
        System.out.println( "in get greeing" );
        return "Hello, " + guestName;
    }

    public String saveComment( DemoComment comment ) {
        DemoComment savedComment = Backendless.Data.of( DemoComment.class ).save( comment );
        return Backendless.FootprintsManager.getObjectId( savedComment );
    }

    public Item getItemById(Long id) {
        if(itemDao == null) {
            itemDao = new ItemDaoImpl();
        }
        return itemDao.findById(id);
    }
}
                           