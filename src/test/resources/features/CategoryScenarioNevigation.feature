@Test3
Feature: Category Scenario

  Scenario Outline: User should able click on each category,
  So that user can navigate to category page successfully
    Given user is on Homepage
    When User click on each "<category>"
    Then User able to navigate to "<category page>" successfully

    Examples:
      | category    | category page                                                           |
   #   | Desktops          | http://tutorialsninja.com/demo/index.php?route=product/category&path=20 |
    #  | Laptops&Notebooks | http://tutorialsninja.com/demo/index.php?route=product/category&path=18 |
     # | Components        | http://tutorialsninja.com/demo/index.php?route=product/category&path=25 |
      | Tablets     | http://tutorialsninja.com/demo/index.php?route=product/category&path=57 |
      #| Software          | http://tutorialsninja.com/demo/index.php?route=product/category&path=17 |
      | Phones & PDAs | http://tutorialsninja.com/demo/index.php?route=product/category&path=24 |
      | Cameras     | http://tutorialsninja.com/demo/index.php?route=product/category&path=33 |
