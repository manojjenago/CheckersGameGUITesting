Feature: The Checkers Game GUI Testing

  @chrome
  Scenario: Verify Checkers Game
    Given : Navigate to "ChekerGameURL"
    Then : Confirm that site is up
    Then : Make five legal moves as orange
    Then : Restart the game
