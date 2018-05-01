Software Testing – Junit5


In simple wordsm unit testing is about sending value to a method, getting output and then compare it to the expected. 
•	Absence of failure is success. 
•	 Steps when I write a unit test: 
	1-	I know the output that I should get, the output here is two types: 
		a-	Expected. 
		b-	Actual.
	2-	In the assertion functions we first pass the expected and then the actuals. 

•	If we want to implement a setup that should be exist on each test unit we should use this annotation: @BeforeEach. 
•	Parameterized test, we use it when the only thing that change within the test function is the data. 

•	Assert functions that I know: 
	1-	AssertEquals. 
	2-	AssertNotNull.
	3-	AssertNull. 
	4-	AssertFalse.
	5-	AssertTrue. 
	6-	AssertThrows.

•	Annotations: 
	1-	@Test.
	2-	@BeforeEach.
	3-	@AfterEach.
	4-	@BeforeAll -- the method should be static.
	5-	@AfterAll – the method should be static. 
	6-	@DisplayName (“When method is null throw an exception.”) – to give a name for a test while running. 
	7-	@Disabled. – to disable a unit test, in junit4 it was called @Ignored. 

•	Junit4 vs Junit5:
	1-	In 4 all the methods are needed to be public. 

•	Notes:
	1-	Don’t forget the annotation @Test. 


•	Keywords: 
	1-	Corner Cases. 
