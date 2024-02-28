Feature: Deck of Cards API Testing


  @chrome
  Scenario: Confirm the site is up
    Given I navigate to the deck of cards API
    Then Confirm the site is up or verify successful response
    Then Get a new deck
    When User shuffle the deck


#
#  Scenario: Get a new deck and shuffle it
#    Given I get a new deck from the API
#    Then I should receive a new deck id
#    When I shuffle the deck
#    Then the deck should be shuffled
#
#  Scenario: Deal three cards to each of two players
#    Given I have a deck with id "new_deck_id"
#    When I deal three cards to each of two players
#    Then each player should have three cards
#
#  Scenario: Check for blackjack
#    Given players have been dealt cards
#    When I check for blackjack
#    Then I should identify if either player has blackjack

