package com.example.monopoly.model.properties;

public enum ClassicAmericanTitleDeed {

  MEDITERRANEAN_AVENUE(Category.BROWN, 2, 10, 30, 90, 160, 250, 30, 50),
  BALTIC_AVENUE(Category.BROWN, 4, 20, 60, 180, 320, 450, 30, 50),
  ORIENTAL_AVENUE(Category.LIGHT_BLUE, 6, 30, 90, 270, 400, 550, 50, 50),
  VERMONT_AVENUE(Category.LIGHT_BLUE, 6, 30, 90, 270, 400, 550, 50, 50),
  CONNECTICUT_AVENUE(Category.LIGHT_BLUE, 8, 40, 100, 300, 450, 600, 60, 50),
  ST_CHARLES_PLACE(Category.LIGHT_BLUE, 10, 50, 150, 450, 625, 750, 70, 100),
  STATES_AVENUE(Category.LIGHT_BLUE, 10, 50, 150, 450, 625, 750, 70, 100),
  VIRGINIA_AVENUE(Category.LIGHT_BLUE, 12, 60, 180, 500, 700, 900, 80, 100),
  ST_JAMES_PLACE(Category.ORANGE, 14, 70, 200, 550, 750, 950, 90, 100),
  TENNESSEE_AVENUE(Category.ORANGE, 14, 70, 200, 550, 750, 950, 90, 100),
  NEW_YORK_AVENUE(Category.ORANGE, 16, 80, 220, 600, 800, 1000, 100, 100),
  KENTUCKY_AVENUE(Category.RED, 18, 90, 250, 700, 875, 1050, 110, 150),
  INDIANA_AVENUE(Category.RED, 18, 90, 250, 700, 875, 1050, 110, 150),
  ILLINOIS_AVENUE(Category.RED, 20, 100, 300, 750, 925, 1100, 120, 150),
  ATLANTIC_AVENUE(Category.YELLOW, 22, 110, 330, 800, 975, 1150, 130, 150),
  VENTNOR_AVENUE(Category.YELLOW, 22, 110, 330, 800, 975, 1150, 130, 150),
  MARVIN_GARDENS(Category.YELLOW, 24, 120, 360, 850, 1025, 1200, 140, 150),
  PACIFIC_AVENUE(Category.GREEN, 26, 130, 390, 900, 1100, 1275, 150, 200),
  NORTH_CAROLINA_AVENUE(Category.GREEN, 26, 130, 390, 900, 1100, 1275, 150, 200),
  PENNSYLVANIA_AVENUE(Category.GREEN, 28, 150, 450, 1000, 1200, 1400, 160, 200),
  PARK_PLACE(Category.DARK_BLUE, 35, 175, 500, 1100, 1300, 1500, 175, 200),
  BOARDWALK(Category.DARK_BLUE, 50, 200, 600, 1400, 1700, 2000, 200, 200);


  private Category category;

  private int baseRent;
  private int singleHouseRent;
  private int twoHousesRent;
  private int threeHousesRent;
  private int fourHousesRent;
  private int hotelRent;

  private int mortgageValue;
  private int houseCost;

  ClassicAmericanTitleDeed(Category category,
                           int baseRent,
                           int singleHouseRent,
                           int twoHousesRent,
                           int threeHousesRent,
                           int fourHousesRent,
                           int hotelRent,
                           int mortgageValue,
                           int houseCost) {
    this.category = category;
    this.baseRent = baseRent;
    this.singleHouseRent = singleHouseRent;
    this.twoHousesRent = twoHousesRent;
    this.threeHousesRent = threeHousesRent;
    this.fourHousesRent = fourHousesRent;
    this.hotelRent = hotelRent;
    this.mortgageValue = mortgageValue;
    this.houseCost = houseCost;
  }

}
