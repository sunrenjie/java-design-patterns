package com.iluwatar.chain;

/**
 * A cook
 */
public class OrcCook extends RequestHandler {
  public OrcCook(RequestHandler handler) {
    super(handler);
  }

  @Override
  public void handleRequest(Request req) {
    if (req.getRequestType().equals(RequestType.COOK)) {
      printHandling(req);
      req.markHandled();
    } else {
      super.handleRequest(req);
    }
  }

  @Override
  public String toString() {
    return "Orc cook";
  }
}
