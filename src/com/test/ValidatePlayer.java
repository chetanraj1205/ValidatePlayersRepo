package com.test;

public class ValidatePlayer {

	// Ques:- Write the test that validates that the teams has only 4 foreign
	// players.
	@Test
			
			public void countForeignPlayes() {
			RestAssured.baseURI="--------";

			String responsePayload=
			given().body().
			when().("---").
			then().extract().response().asString();

			JsonPath getParam = new JsonPath(responsePayload);
			int countries=getParam.getInt("player.country");
	        int foreignPlayers=0;
	 		for(int i=0; i<countries; i++)
			{
			if(getParam.getString(player.country)!="India")
			{
				foreignPlayers++;
			}
			}

			Assert.assertEquals(foreignPlayers,4);
		}

	// Ques:- Write the test that validates that there is atleast one wicket keeper.

	@Test(priority=1)
		
		public void validateWicketKeeper() {
		RestAssured.baseURI="--------";

		String responsePayload=
		given().body().
		when().("Resource"),
		then().extract().response().asString();

		JsonPath getParam = new JsonPath(responsePayload);
		int countries=getParam.getInt("player.role");
		for(int i=0; i<countries; i++)
		{
		if(getParam.getString(player.role).equalIgnoreCase("Wicket-keeper"))
		{
			System.out.println("Yes, there is atleast one wicket keeper");
		}
		}
	Assert.assertTrue(getParam.getString(player.role).equalIgnoreCase("Wicket-keeper"));
	}

}
