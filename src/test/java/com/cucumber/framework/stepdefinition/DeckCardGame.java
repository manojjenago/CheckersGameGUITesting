package com.cucumber.framework.stepdefinition;

//  ManojKumarJena='Manoj Jena'
//        2/27/2024

public class DeckCardGame {
//    @Given("^I navigate to the deck of cards API$")
//    public void iNavigateToTheDeckOfCardsAPI() {
//
//        RestAssured.baseURI = "https://deckofcardsapi.com/";
//
//    }
//
//
//    @Then("^Confirm the site is up or verify successful response$")
//    public void confirmTheSiteIsUpOrVerifySuccessfulResponse() {
//        Response response = RestAssured.get("/");
//        Assert.assertEquals(200, response.getStatusCode());
//    }
//
//    @Then("^Get a new deck$")
//    public void getANewDeck() {
//
//        Response response = RestAssured.get("/api/deck/new/");
//        newDeckId = response.jsonPath().getString("deck_id");
//        isshuffled = response.jsonPath().getString("shuffled");
//        Assert.assertNotNull(newDeckId);
//        Assert.assertEquals(isshuffled);
//    }
//
//    @When("^User shuffle the deck$")
//    public void usershuffleTheDeck() {
//
//        RestAssured.get("/api/deck/" + deck_id + "/pile/"+pile_name+"/shuffle/");
//        public void checkShuffled() {
//            Response response = RestAssured.get("/api/deck/" + newDeckId + "/draw/?count=1");
//            String firstCardBeforeShuffle = response.jsonPath().getString("cards[0].code");
//
//            RestAssured.get("/api/deck/" + newDeckId + "/shuffle/");
//
//            response = RestAssured.get("/api/deck/" + newDeckId + "/draw/?count=1");
//            String firstCardAfterShuffle = response.jsonPath().getString("cards[0].code");
//
//            Assert.assertNotEquals(firstCardBeforeShuffle, firstCardAfterShuffle);
//        }
//    }
}
