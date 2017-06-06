
package com.sample.api;

import com.backendless.Backendless;
import com.backendless.servercode.IBackendlessService;

public class DemoService implements IBackendlessService
{
  public String getGreeting( String guestName )
  {
    System.out.println( "in get greeing" );
    return "Hello, " + guestName;
  }

  public String saveComment( DemoComment comment )
  {
    DemoComment savedComment = Backendless.Data.of( DemoComment.class ).save( comment );
    return Backendless.FootprintsManager.getObjectId( savedComment );
  }
}
                           