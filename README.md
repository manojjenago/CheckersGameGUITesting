# CheckersGameGUITesting
The Checkers Game GUI Testing
*****************************************

  Scenario: Verify Checkers Game
    Given : Navigate to "ChekerGameURL"
    Then : Confirm that site is up
    Then : Make five legal moves as orange
    Then : Restart the game- This also counts the Number of Blue pices and Orange Pices before the Restart to make sure the Blue Dots are less than 1
