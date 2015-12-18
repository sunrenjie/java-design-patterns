package com.iluwatar.abstractfactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

  private App app = new App();
  private KingdomFactory elfFactory;
  private KingdomFactory orcFactory;

  @Before
  public void setUp() {
    elfFactory = app.getElfKingdomFactory();
    orcFactory = app.getOrcKingdomFactory();
  }

  @Test
  public void king() {
    final King elfKing = app.getKing(elfFactory);
    assertTrue(elfKing instanceof ElfKing);
    assertEquals(ElfKing.DESCRIPTION, elfKing.getDescription());
    final King orcKing = app.getKing(orcFactory);
    assertTrue(orcKing instanceof OrcKing);
    assertEquals(OrcKing.DESCRIPTION, orcKing.getDescription());
  }

  @Test
  public void queen() {
    final Queen elfQueen = app.getQueen(elfFactory);
    assertTrue(elfQueen instanceof ElfQueen);
    assertEquals(elfQueen.getDescription(), ElfQueen.DESCRIPTION);
    final Queen orcQueen = app.getQueen(orcFactory);
    assertTrue(orcQueen instanceof OrcQueen);
    assertEquals(orcQueen.getDescription(), OrcQueen.DESCRIPTION);
  }

  @Test
  public void castle() {
    final Castle elfCastle = app.getCastle(elfFactory);
    assertTrue(elfCastle instanceof ElfCastle);
    assertEquals(ElfCastle.DESCRIPTION, elfCastle.getDescription());
    final Castle orcCastle = app.getCastle(orcFactory);
    assertTrue(orcCastle instanceof OrcCastle);
    assertEquals(OrcCastle.DESCRIPTION, orcCastle.getDescription());
  }

  @Test
  public void army() {
    final Army elfArmy = app.getArmy(elfFactory);
    assertTrue(elfArmy instanceof ElfArmy);
    assertEquals(ElfArmy.DESCRIPTION, elfArmy.getDescription());
    final Army orcArmy = app.getArmy(orcFactory);
    assertTrue(orcArmy instanceof OrcArmy);
    assertEquals(OrcArmy.DESCRIPTION, orcArmy.getDescription());
  }

  @Test
  public void createElfKingdom() {
    app.createKingdom(elfFactory);
    final King king = app.getKing();
    final Queen queen = app.getQueen();
    final Castle castle = app.getCastle();
    final Army army = app.getArmy();
    assertTrue(king instanceof ElfKing);
    assertEquals(ElfKing.DESCRIPTION, king.getDescription());
    assertTrue(queen instanceof ElfQueen);
    assertEquals(ElfQueen.DESCRIPTION, queen.getDescription());
    assertTrue(castle instanceof ElfCastle);
    assertEquals(ElfCastle.DESCRIPTION, castle.getDescription());
    assertTrue(army instanceof ElfArmy);
    assertEquals(ElfArmy.DESCRIPTION, army.getDescription());
  }

  @Test
  public void createOrcKingdom() {
    app.createKingdom(orcFactory);
    final King king = app.getKing();
    final Queen queen = app.getQueen();
    final Castle castle = app.getCastle();
    final Army army = app.getArmy();
    assertTrue(king instanceof OrcKing);
    assertEquals(OrcKing.DESCRIPTION, king.getDescription());
    assertTrue(queen instanceof OrcQueen);
    assertEquals(OrcQueen.DESCRIPTION, queen.getDescription());
    assertTrue(castle instanceof OrcCastle);
    assertEquals(OrcCastle.DESCRIPTION, castle.getDescription());
    assertTrue(army instanceof OrcArmy);
    assertEquals(OrcArmy.DESCRIPTION, army.getDescription());
  }
}
